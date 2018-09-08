/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author gouldbergstein
 *
 */
public class InstantiatorImpl implements Instantiator<Object> {

	private Random random;
	private Map<Predicate<Class<?>>,Function<Class<?>, Object>> instantiators;

	public InstantiatorImpl() {
		random = new Random();
		IntegerInstantiator arrayLengthInstantiator = new RangeIntegerInstantiator (random, 0, 20);
		ArrayInstantiator<Object> arrayInstantiator = new ArrayInstantiatorImpl<>(this, arrayLengthInstantiator);
		IntegerInstantiator integerInstantiator = new IntegerInstantiatorImpl(random);
		ShortInstantiator shortInstantiator = new ShortInstantiatorImpl (random);
		LongInstantiator longInstantiator = new LongInstantiatorImpl (random);
		DoubleInstantiator doubleInstantiator = new DoubleInstantiatorImpl(random);
		FloatInstantiator floatInstantiator = new FloatInstantiatorImpl (random);
		BooleanInstantiator booleanInstantiator = new BooleanInstantiatorImpl (random);
		ByteInstantiator byteInstantiator = new ByteInstantiatorImpl (random);
		CharacterInstantiator characterInstantiator = new CharacterClassInstantiator (random, Character::isUpperCase);
		PrimitiveInstantiator primitiveInstantiator = new PrimitiveInstantiatorImpl(integerInstantiator,shortInstantiator,longInstantiator,
				doubleInstantiator,floatInstantiator,booleanInstantiator,characterInstantiator,byteInstantiator);
		instantiators = new HashMap< >(9);
		instantiators.put(Class::isArray, clazz -> arrayInstantiator.instantiateArray (clazz));
		instantiators.put(Class::isPrimitive, clazz -> primitiveInstantiator.instantiatePrimitive (clazz));
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
