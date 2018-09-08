/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author gouldbergstein
 *
 */
public class PrimitiveInstantiatorImpl implements PrimitiveInstantiator {

	private Map<Class<?>, Supplier<?>> instantiators;

	public PrimitiveInstantiatorImpl( 
			IntegerInstantiator integerInstantiator,
			ShortInstantiator shortInstantiator,
			LongInstantiator longInstantiator,
			DoubleInstantiator doubleInstantiator,
			FloatInstantiator floatInstantiator,
			BooleanInstantiator booleanInstantiator,
			CharacterInstantiator characterInstantiator,
			ByteInstantiator byteInstantiator) {
		instantiators = new HashMap<>(8);
		instantiators.put(int.class, new Supplier<Integer> () {
			@Override
			public Integer get () {
				return Integer.valueOf (integerInstantiator.instantiateInteger ());
			}
		});
		instantiators.put(short.class, new Supplier<Short> () {
			@Override public Short get () {
				return Short.valueOf (shortInstantiator.instantiateShort ());
			}
		});
		instantiators.put(long.class, new Supplier<Long> () {
			@Override public Long get () {
				return Long.valueOf (longInstantiator.instantiateLong ());
			}
		});
		instantiators.put(double.class, new Supplier<Double> () {
			@Override public Double get () {
				return Double.valueOf (doubleInstantiator.instantiateDouble ());
			}
		});
		instantiators.put(float.class, new Supplier<Float> () {
			@Override public Float get () {
				return Float.valueOf (floatInstantiator.instantiateFloat ());
			}
		});
		instantiators.put(boolean.class, new Supplier<Boolean> () {
			@Override public Boolean get () {
				return Boolean.valueOf (booleanInstantiator.instantiateBoolean ());
			}
		});
		instantiators.put(char.class, new Supplier<Character> () {
			@Override 		public Character get () {
				return Character.valueOf (characterInstantiator.instantiateCharacter ());
			}
		});
		instantiators.put(byte.class, new Supplier<Byte> () {
			@Override 			public Byte get () {
				return Byte.valueOf (byteInstantiator.instantiateByte ());
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.innovanon.simon.Simon3.PrimitiveInstantiator#instantiatePrimitive(java.
	 * lang.Class)
	 */
	@Override
	public Object instantiatePrimitive(Class<?> clazz) {
		return instantiators.get(clazz).get();
	}

}
