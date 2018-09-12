/**
 * 
 */
package com.innovanon.simon.primitives.bytes;

import com.innovanon.simon.primitives.PInstantiatorAbs;

/**
 * @author gouldbergstein
 *
 */
public abstract class BytePInstantiatorAbs extends PInstantiatorAbs<Byte> implements BytePInstantiator {

	/**
	 */
	public BytePInstantiatorAbs() {
		super(byte.class, Byte.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Byte get() {
		return Byte.valueOf(getAsByte());
	}
}
