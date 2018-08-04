/**
 * 
 */
package com.innovanon.simon.Simon.primitives;

import java.util.Random;

import com.innovanon.simon.Simon.RandomUtil;

/**
 * Instantiates primitive types.
 * 
 * @author seanrdev
 */
public class PrimitivesInstantiator <T> extends PrimitiveInstantiator<T>{
	private RandomUtil util;
	
	public PrimitivesInstantiator(Random random) {
		super(random);
		util = new RandomUtil(random);
		
		ints = new IntegerInstantiator(random);
		longs = new LongInstantiator(random);
		shorts = new ShortInstantiator(random);
		floats = new FloatInstantiator(random);
		doubles = new DoubleInstantiator(random);
		booleans = new BooleanInstantiator(random);
	}

	private IntegerInstantiator ints;
	private ShortInstantiator shorts;
	private LongInstantiator longs;
	private DoubleInstantiator doubles;
	private FloatInstantiator floats;
	private BooleanInstantiator booleans;
	
	@SuppressWarnings("unchecked")
	public <E> E instantiate(Class<E> clazz) {
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

	
	@SuppressWarnings("unchecked")
	@Override
	public T instantiate() {
		Class<?>[]classes = {int.class, double.class, float.class, short.class, long.class, boolean.class};
		Class<T>[] classesT = (Class<T>[]) classes;
		Class<T>clazz = util.getRandomElement(classesT);
		return instantiate(clazz);
	}
	
	//@Override
	//public Object instantiate() {
	//	Class<?>[]classes = {int.class, double.class, float.class, short.class, long.class, boolean.class};
	//	Class<?>clazz = util.getRandomElement(classes);
	//	return instantiate(clazz);
	//}
}
