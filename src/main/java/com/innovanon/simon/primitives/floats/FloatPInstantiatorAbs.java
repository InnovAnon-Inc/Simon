/**
 * 
 */
package com.innovanon.simon.primitives.floats;

import com.innovanon.simon.primitives.PInstantiatorAbs;

/**
 * @author gouldbergstein
 *
 */
public abstract class FloatPInstantiatorAbs extends PInstantiatorAbs<Float> implements FloatPInstantiator {

	/**
	 */
	public FloatPInstantiatorAbs() {
		super(float.class, Float.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Float get() {
		return Float.valueOf(getAsFloat());
	}
}
