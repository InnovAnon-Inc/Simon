/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 * 
 * InnovAnon, Inc. Proprietary
 * 
 * NOTICE:
 * All reproductions, total or partial, of this work must retain this notice.
 * 
 * Possession or use of this technology implies consent to our Terms of Service.
 * 
 * Owner and management NOT responsible for injury or death resulting from the use of this equipment.
 * 
 * If any clause in this notice is invalid or unenforceable in your jurisdiction, that does NOT necessarily invalidate any other clause in this notice.
 * 
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */
package com.innovanon.simon.Simon3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.SplittableRandom;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author gouldbergstein
 *
 */
public class InstantiatorImpl implements Instantiator<Object> {

	private SplittableRandom random;
	private Map<Predicate<Class<?>>,Function<Class<?>, Object>> instantiators;

	public InstantiatorImpl() {
		random = new SplittableRandom();
		int min = 0;
		int max = 20;
		IntegerInstantiator arrayLengthInstantiator = new RangeIntegerInstantiator (random::nextInt, min, max);
		ArrayInstantiator<Object> arrayInstantiator = new ArrayInstantiatorImpl<>(this, arrayLengthInstantiator);
		IntegerInstantiator integerInstantiator = new IntegerInstantiatorImpl(random);
		ShortInstantiator shortInstantiator = new ShortInstantiatorImpl (random::nextInt);
		LongInstantiator longInstantiator = new LongInstantiatorImpl (random);
		//DoubleInstantiator doubleInstantiator = new DoubleInstantiatorImpl(random);
		//FloatInstantiator floatInstantiator = new FloatInstantiatorImpl (new Supplier<Float>() {
		//	@Override public Float get () { return random.nextFloat(); }
		//});
		BooleanInstantiator booleanInstantiator = new BooleanInstantiatorImpl (random);
		ByteInstantiator byteInstantiator = new ByteInstantiatorImpl (random);
		//CharacterInstantiator characterInstantiator = new CharacterClassInstantiator (random, Character::isUpperCase);
		//PrimitiveInstantiator primitiveInstantiator = new PrimitiveInstantiatorImpl(integerInstantiator,shortInstantiator,longInstantiator,
		//		doubleInstantiator,floatInstantiator,booleanInstantiator,characterInstantiator,byteInstantiator);
		instantiators = new HashMap< >(9);
		instantiators.put(Class::isArray, clazz -> arrayInstantiator.instantiateArray (clazz));
		//instantiators.put(Class::isPrimitive, clazz -> primitiveInstantiator.instantiatePrimitive (clazz));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.simon.Simon3.Instantiator#instantiate(java.lang.Class)
	 */
	@Override
	public Object instantiate(Class<? extends Object> clazz) {
		for (Entry<Predicate<Class<?>>, Function<Class<?>, Object>> entrySet : instantiators.entrySet()) {
			Predicate<Class<?>>predicate = entrySet.getKey();
			Function<Class<?>,Object>function = entrySet.getValue();
			if (predicate.test(clazz))
				return function.apply(clazz);
		}
/*
		if (clazz.isInterface())
			return this.instantiateInterface(clazz);
		if (clazz.isAnnotation())
			return this.instantiateAnnotation(clazz);
		if (clazz.isAnonymousClass())
			return this.instantiateAnonymousClass(clazz);
		if (clazz.isEnum())
			return this.instantiateEnum(clazz);
		if (clazz.isLocalClass())
			return this.instantiateLocalClass(clazz);
		if (clazz.isMemberClass())
			return this.instantiateMemberClass(clazz);
		if (clazz.isSynthetic())
			return this.instantiateSyntheticClass(clazz);
			*/
		//return this.instantiateObject();
		throw new Error();
	}
}

/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */