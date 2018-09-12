/**
 * 
 */
package com.innovanon.simon.objects_special;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.innovanon.simon.instantiator.Instantiator;
import com.innovanon.simon.primitives.PInstantiator;
import com.innovanon.simon.primitives.booleans.RandomBooleanPInstantiator;
import com.innovanon.simon.primitives.bytes.RandomBytePInstantiator;
import com.innovanon.simon.primitives.chars.RandomCharPInstantiator;
import com.innovanon.simon.primitives.doubles.RandomDoublePInstantiator;
import com.innovanon.simon.primitives.floats.RandomFloatPInstantiator;
import com.innovanon.simon.primitives.ints.RandomIntPInstantiator;
import com.innovanon.simon.primitives.longs.RandomLongPInstantiator;
import com.innovanon.simon.primitives.shorts.RandomShortPInstantiator;

/**
 * @author gouldbergstein
 *
 */
public class PrimitiveInstantiator implements Instantiator<Object> {

	private Set<PInstantiator<?>> delegates;

	/**
	 * @param random
	 * 
	 */
	public PrimitiveInstantiator(Random random) {
		int initialCapacity = 8;
		Set<PInstantiator<?>> s = new HashSet<>(initialCapacity);
		s.add(new RandomIntPInstantiator(random));
		s.add(new RandomDoublePInstantiator(random));
		s.add(new RandomLongPInstantiator(random));
		s.add(new RandomBooleanPInstantiator(random));
		s.add(new RandomFloatPInstantiator(random));
		s.add(new RandomShortPInstantiator(random));
		s.add(new RandomBytePInstantiator(random));
		s.add(new RandomCharPInstantiator(random));
		this.delegates = Collections.unmodifiableSet(s);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public Object apply(Class<?> t) {
		for (PInstantiator<?> delegate : delegates) {
			if (delegate.test(t))
				return delegate.get();
		}
		assert ! test(t);
		// TODO
		throw new Error();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		for (PInstantiator<?> delegate : delegates)
			if (delegate.test(t))
				return true;
		assert ! t.isPrimitive();
		return false;
	}
}
