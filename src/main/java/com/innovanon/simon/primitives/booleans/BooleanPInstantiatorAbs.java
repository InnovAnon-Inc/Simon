/**
 * 
 */
package com.innovanon.simon.primitives.booleans;

import com.innovanon.simon.primitives.PInstantiatorAbs;

/**
 * @author gouldbergstein
 *
 */
public abstract class BooleanPInstantiatorAbs extends PInstantiatorAbs<Boolean> implements BooleanPInstantiator {

	/**
	 */
	public BooleanPInstantiatorAbs() {
		super(boolean.class, Boolean.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Boolean get() {
		return Boolean.valueOf(getAsBoolean());
	}
}
