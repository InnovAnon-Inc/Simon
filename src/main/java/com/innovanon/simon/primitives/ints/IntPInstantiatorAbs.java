/**
 * 
 */
package com.innovanon.simon.primitives.ints;

import com.innovanon.simon.primitives.PInstantiatorAbs;

/**
 * @author gouldbergstein
 *
 */
public abstract class IntPInstantiatorAbs extends PInstantiatorAbs<Integer> implements IntPInstantiator {

	/**
	 */
	public IntPInstantiatorAbs() {
		super(int.class, Integer.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Integer get() {
		return Integer.valueOf(getAsInt());
	}
}
