/**
 * 
 */
package com.innovanon.simon.instantiator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.innovanon.simon.Simon.ReflectionsWrapper;
import com.innovanon.simon.instantiators.Instantiators;
import com.innovanon.simon.instantiators.ObjectInstantiator;
import com.innovanon.simon.reflection_errors.ClassNotFoundError;
import com.innovanon.simon.util.reflection.NameToClassConverter;
import com.innovanon.simon.util.stream.StreamUtil;
import com.innovanon.struct.Structs.bag.BagImpl;

/**
 * @author gouldbergstein
 *
 */
public class RandomObjectIterable implements Iterable<Object> {

	private Iterable<Object> iterable;

	/**
	 * @param random
	 * 
	 */
	public RandomObjectIterable(Random random) {
		// TODO allow custom reflections
		ReflectionsWrapper reflectionsWrapper = ReflectionsWrapper.INSTANCE;
		Collection<String> classNames = reflectionsWrapper.getReflections().getAllTypes();
		List<Class<?>> classArray = StreamUtil.errorEatingConversion(classNames.stream(), NameToClassConverter.INSTANCE,
				Arrays.asList(ExceptionInInitializerError.class, NoClassDefFoundError.class, UnsatisfiedLinkError.class,
						ClassNotFoundException.class,ClassNotFoundError.class,Error.class,RuntimeException.class,Throwable.class/*, 
						UnsupportedInstantiationClassError.class, ConstructorInstantiationFailedError.class,
						Error.class, RuntimeException.class*/))
				.collect(Collectors.toList());
		Iterable<Class<?>> bag = new BagImpl<>(classArray, random);

		// TODO allow custom object instantiator
		Instantiators<Object> objectInstantiators = new ObjectInstantiator(random);

		iterable = new InstantiaIterable(bag, objectInstantiators);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Object> iterator() {
		return iterable.iterator();
	}
}
