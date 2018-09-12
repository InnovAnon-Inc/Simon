/**
 * 
 */
package com.innovanon.simon.iter;

import java.util.Iterator;
import java.util.Optional;

import com.innovanon.simon.util.stream.ErrorEater;

/**
 * @author gouldbergstein
 *
 */
public class EatingIterator<E> implements Iterator<Optional<E>> {

	private Iterator<E> iterator;
	private ErrorEater<E, Throwable> eater;

	/**
	 * @param iterator
	 * @param eater
	 */
	public EatingIterator(Iterator<E> iterator, ErrorEater<E, Throwable> eater) {
		this.iterator = iterator;
		this.eater = eater;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Optional<E> next() {
		return eater.apply(() -> iterator.next(), x -> x);
	}
}
