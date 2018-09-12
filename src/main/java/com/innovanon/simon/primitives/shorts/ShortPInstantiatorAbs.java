/**
 * 
 */
package com.innovanon.simon.primitives.shorts;

import com.innovanon.simon.primitives.PInstantiatorAbs;

/**
 * @author gouldbergstein
 *
 */
public abstract class ShortPInstantiatorAbs extends PInstantiatorAbs<Short> implements ShortPInstantiator {

	/**
	 */
	public ShortPInstantiatorAbs() {
		super(short.class, Short.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Short get() {
		return Short.valueOf(getAsShort());
	}
}
