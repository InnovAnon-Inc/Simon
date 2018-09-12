/**
 * 
 */
package com.innovanon.simon.objects_general;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Function;

import com.innovanon.simon.instantiator.Instantiator;
import com.innovanon.simon.struct.bags.Bag;
import com.innovanon.simon.struct.bags.BagImpl;

/**
 * @author gouldbergstein
 *
 */
public class ConstructorInstantiator implements Instantiator<Object> {

	private Random random;
	private Function<Class<?>, Object> objects;

	/**
	 * @param random
	 * @param objects
	 */
	public ConstructorInstantiator(Random random, Function<Class<?>, Object> objects) {
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
		return t.getConstructors().length != 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public Object apply(Class<?> t) {
		Constructor<?>[] constructors = t.getConstructors();
		Bag<Constructor<?>> bag = new BagImpl<Constructor<?>>(Arrays.asList(constructors), random);
		do {
		Constructor<?> constructor = bag.remove();
		Class<?>[] parameterTypes = constructor.getParameterTypes();
		// TODO re-try with different parameters
		Object[] parameters = new Object[parameterTypes.length];
		for (int index = 0; index < parameterTypes.length; index++) {
			Class<?> parameterType = parameterTypes[index];
			Object parameter = objects.apply(parameterType);
			parameters[index] = parameter;
		}
		try {
			return constructor.newInstance(parameters);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO
			//throw new Error(e);
		}
		} while (!bag.isEmpty());
		// TODO
		throw new Error ();
	}
}
