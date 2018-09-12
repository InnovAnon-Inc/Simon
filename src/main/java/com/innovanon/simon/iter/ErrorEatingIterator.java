/**
 * 
 */
package com.innovanon.simon.iter;

import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

import com.innovanon.simon.util.stream.ErrorEatingSupplier;

/**
 * @author gouldbergstein
 *
 */
public class ErrorEatingIterator<T> implements Iterator<T> {

	private Iterator<T> iterator;
	// private ErrorEatingSupplier<T> eater;
	// private Optional<T> next;

	/**
	 * @param iterator
	 * @param nameToClassConverter
	 * @param exceptionClassesToCatch
	 * @param rememberErrors
	 */
	public ErrorEatingIterator(Iterator<T> iterator, 
			Collection<Class<? extends Throwable>> exceptionClassesToCatch, boolean rememberErrors) {
		// this.iterator = iterator;
		ErrorEatingSupplier<T> eater = new ErrorEatingSupplier<>(exceptionClassesToCatch, rememberErrors,
				iterator::next);
		Iterator<Optional<T>> iter1 = new EatingIterator<T>(iterator, eater);
		Iterator<T> iter2 = new OptionalSkippingIterator<>(iter1);
		this.iterator = iter2;
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
	public T next() {
		return iterator.next();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	// @Override
	// public boolean hasNext() {
	// if (next != null && next.isPresent())
	// return true;
	// while (iterator.hasNext() && (next == null || ! next.isPresent()))
	// next = eater.get();
	// return false;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#next()
	 */
	// @Override
	// public T next() {
	// boolean test = hasNext();
	// assert test;
	// T ret = next.get();
	// next = null;
	// return ret;
	// }

}
