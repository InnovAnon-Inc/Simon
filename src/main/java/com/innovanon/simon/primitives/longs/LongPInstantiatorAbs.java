/**
 * 
 */
package com.innovanon.simon.primitives.longs;

import com.innovanon.simon.primitives.PInstantiatorAbs;

/**
 * @author gouldbergstein
 *
 */
public abstract class LongPInstantiatorAbs extends PInstantiatorAbs<Long> implements LongPInstantiator {

	/**
	 */
	public LongPInstantiatorAbs() {
		super(long.class, Long.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Long get() {
		return Long.valueOf(getAsLong());
	}
}
