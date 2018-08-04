/**
 * 
 */
package com.innovanon.simon.Simon.primitives;

import java.util.Map;
import java.util.Random;

import com.innovanon.simon.Simon.InstantiatorAbs;
import com.innovanon.simon.Simon.RandomUtil;

/**
 * Instantiates a primitive type.
 * 
 * @author seanrdev
 */
public abstract class PrimitiveInstantiator<T> extends InstantiatorAbs<T> {
	

	public PrimitiveInstantiator(Random random) {
		super(random);		
	}

	/*
	@SuppressWarnings("unchecked")
	public <E extends T> E instantiate(Class<E> clazz) {
		if (clazz.equals(int.class))
			return (E) ints.instantiate();
		if (clazz.equals(short.class))
			return (E)shorts.instantiate();
		if (clazz.equals(long.class))
			return (E) longs.instantiate();
		if (clazz.equals(boolean.class))
			return (E) booleans.instantiate();
		if (clazz.equals(float.class))
			return (E) floats.instantiate();
		if (clazz.equals(double.class))
			return (E) doubles.instantiate();
		throw new AssertionError("unexpected flow");
	}
	*/
//	public Object instantiate(Class<?> clazz) {
//		if (clazz.equals(int.class))
//			return  ints.instantiate();
	//		if (clazz.equals(short.class))
	//	return shorts.instantiate();
	//if (clazz.equals(long.class))
	//	return  longs.instantiate();
	//if (clazz.equals(boolean.class))
	//	return  booleans.instantiate();
	//if (clazz.equals(float.class))
	//	return  floats.instantiate();
	//if (clazz.equals(double.class))
	//	return  doubles.instantiate();
	//throw new AssertionError("unexpected flow");
	//}

	/*
	@SuppressWarnings("unchecked")
	@Override
	public T instantiate() {
		Class<?>[]classes = {int.class, double.class, float.class, short.class, long.class, boolean.class};
		Class<T>[] classesT = (Class<T>[]) classes;
		Class<T>clazz = util.getRandomElement(classesT);
		return instantiate(clazz);
	}
	*/
	//@Override
	//public Object instantiate() {
	//	Class<?>[]classes = {int.class, double.class, float.class, short.class, long.class, boolean.class};
	//	Class<?>clazz = util.getRandomElement(classes);
	//	return instantiate(clazz);
	//}
	}
