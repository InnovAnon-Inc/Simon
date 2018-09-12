/**
 * 
 */
package com.innovanon.simon.primitives.doubles;

import com.innovanon.simon.primitives.PInstantiatorAbs;

/**
 * @author gouldbergstein
 *
 */
public abstract class DoublePInstantiatorAbs extends PInstantiatorAbs<Double> implements DoublePInstantiator {

	/**
	 */
	public DoublePInstantiatorAbs() {
		super(double.class, Double.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Double get() {
		return Double.valueOf(getAsDouble());
	}
}
