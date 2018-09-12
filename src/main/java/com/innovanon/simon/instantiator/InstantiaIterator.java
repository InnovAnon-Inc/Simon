/**
 * 
 */
package com.innovanon.simon.instantiator;

import java.util.Iterator;
import java.util.Objects;

import com.innovanon.simon.instantiators.Instantiators;

/**
 * @author gouldbergstein
 *
 */
public class InstantiaIterator implements Iterator<Object> {

	private Iterator<Class<?>> iterator;
	private Instantiators<Object>instantiators;
	private Class<?> next;
	
	/**
	 * @param iterator
	 * @param instantiators
	 */
	public InstantiaIterator(Iterator<Class<?>> iterator, Instantiators<Object> instantiators) {
		Objects.requireNonNull(iterator);
		Objects.requireNonNull(instantiators);
		this.iterator = iterator;
		this.instantiators = instantiators;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if (next != null)return true;
		while (iterator.hasNext()) {
			next=iterator.next();
			if (instantiators.test(next))
				return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Object next() {
		boolean test = hasNext ();
		assert test;
		Class<?> ret = next;
		next = null;
		return instantiators.apply(ret).apply(ret);
	}
}
