/**
 * 
 */
package com.innovanon.simon.objects_general;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;

import com.innovanon.simon.instantiator.Instantiator;
import com.innovanon.simon.reflection_errors.ConstructorInstantiationFailedError;
import com.innovanon.simon.struct.bags.Bag;
import com.innovanon.simon.struct.bags.BagImpl;

/**
 * @author gouldbergstein
 *
 */
public class ConstructorInstantiator implements Instantiator<Object> {

	private static int RETRIES = 20;

	private Random random;
	private Function<Class<?>, Instantiator<Object>> objects;

	/**
	 * @param random
	 * @param objects
	 */
	public ConstructorInstantiator(Random random, Function<Class<?>, Instantiator<Object>> objects) {
		Objects.requireNonNull(objects);
		this.random = random;
		this.objects = objects;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		Objects.requireNonNull(t);
		try {
			return t.getConstructors().length != 0;
		} catch (NoClassDefFoundError e) {
			// TODO
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public Object apply(Class<?> t) {
		Objects.requireNonNull(t);
		Constructor<?>[] constructors = t.getConstructors();
		Bag<Constructor<?>> bag = new BagImpl<Constructor<?>>(Arrays.asList(constructors), random);
		do {
			Constructor<?> constructor = bag.remove();
			Class<?>[] parameterTypes = constructor.getParameterTypes();

			Instantiator<Object>[] instantiators = new Instantiator[parameterTypes.length];
			for (int index = 0; index < parameterTypes.length; index++) {
				Class<?> parameterType = parameterTypes[index];
				instantiators[index] = objects.apply(parameterType);
			}

			// TODO retry until instantiators are exhausted
			for (int k = 1; k <= RETRIES; k++) {
				Object[] parameters = new Object[parameterTypes.length];
				for (int index = 0; index < parameterTypes.length; index++) {
					Class<?> parameterType = parameterTypes[index];
					Object parameter = instantiators[index].apply(parameterType);
					parameters[index] = parameter;
				}
				try {
					return constructor.newInstance(parameters);
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					// TODO
					// throw new ConstructorInvocationError(e);
				}
			}
		} while (!bag.isEmpty());
		throw ConstructorInstantiationFailedError.factory(new Object() {
		}, t);
	}
}
