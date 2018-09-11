/**
 * 
 */
package com.innovanon.struct.iter;

import java.util.Iterator;
import java.util.function.Function;

/**
 * Conv(erting)Iterator:
 * applies a function to convert from one type to another
 * @author gouldbergstein
 */
public class ConvIterator<T, E> implements Iterator<E> {

	private Iterator<T> iterator;
	private Function<T, E> converter;

	/**
	 * @param iterator
	 * @param converter
	 * @see ConvIterator#iterator
	 * @see ConvIterator#converter
	 */
	public ConvIterator(Iterator<T> iterator, Function<T, E> converter) {
		this.iterator = iterator;
		this.converter = converter;
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
	public E next() {
		T t = iterator.next();
		return converter.apply(t);
	}
}
