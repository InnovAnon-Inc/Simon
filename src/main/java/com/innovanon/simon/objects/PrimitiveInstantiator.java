/**
 * 
 */
package com.innovanon.simon.objects;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.innovanon.simon.instantiator.Instantiator;
import com.innovanon.simon.primitives.PInstantiator;
import com.innovanon.simon.primitives.RandomIntPInstantiator;

/**
 * @author gouldbergstein
 *
 */
public class PrimitiveInstantiator implements Instantiator<Object> {

	private Set<PInstantiator< ?>> delegates;
	
	
	
	/**
	 * @param random 
	 * 
	 */
	public PrimitiveInstantiator(Random random) {
		int initialCapacity=8;
		Set<PInstantiator< ?>> s = new HashSet<>(initialCapacity);
		s.add(new RandomIntPInstantiator(random));
		
		this.delegates = Collections.unmodifiableSet(s);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public Object apply(Class<?> t) {
		for (PInstantiator<?>delegate:delegates) {
			if (delegate.test(t))
				return delegate.get();
		}
		// TODO
		throw new Error ();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		return t.isPrimitive();
	}
}
