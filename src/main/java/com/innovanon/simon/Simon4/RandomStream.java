/**
 * 
 */
package com.innovanon.simon.Simon4;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/**
 * @author gouldbergstein
 *
 */
public class RandomStream<T, S extends BaseStream<T, S>> implements BaseStream<T, S> {

	/**
	 * 
	 */
	public RandomStream() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spliterator<T> spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isParallel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public S sequential() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public S parallel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public S unordered() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public S onClose(Runnable closeHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
