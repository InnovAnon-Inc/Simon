/**
 * 
 */
package com.innovanon.simon.iter;

import java.util.Iterator;
import java.util.Optional;

/**
 * @author gouldbergstein
 *
 */
public class OptionalSkippingIterator<E> implements Iterator<E> {

	private Iterator<Optional<E>> iterator;
	private Optional<E> next;

	/**
	 * @param iterator
	 * @param next
	 */
	public OptionalSkippingIterator(Iterator<Optional<E>> iterator) {
		this.iterator = iterator;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		while ((next == null || !next.isPresent()) && iterator.hasNext())
			next = iterator.next();
		if (next != null && next.isPresent())
			return true;
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#next()
	 */
	@Override
	public E next() {
		boolean test = hasNext();
		assert test;
		E ret = next.get();
		next = null;
		return ret;
	}

}
