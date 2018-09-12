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
public class InstantiaIterable implements Iterable<Object> {

	private Iterable<Class<?>> iterable;
	private Instantiators<Object> instantiators;

	/**
	 * @param iterable
	 * @param instantiators
	 */
	public InstantiaIterable(Iterable<Class<?>> iterable, Instantiators<Object> instantiators) {
		Objects.requireNonNull(iterable);
		this.iterable = iterable;
		this.instantiators = instantiators;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Object> iterator() {
		Iterator<Class<?>> iterator = iterable.iterator();
		return new InstantiaIterator(iterator, instantiators);
	}
}
