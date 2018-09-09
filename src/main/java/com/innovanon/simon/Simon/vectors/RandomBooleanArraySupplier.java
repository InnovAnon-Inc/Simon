/**
 * 
 */
package com.innovanon.simon.Simon.vectors;

import com.innovanon.simon.Simon.suppliers.primitives.booleans.RandomBooleanSupplier;
import com.innovanon.simon.Simon.suppliers.primitives.ints.RandomIntSupplier;

/**
 * @author gouldbergstein
 *
 */
public class RandomBooleanArraySupplier extends RandomArraySupplier<boolean[], Boolean, RandomBooleanSupplier> {

	/**
	 * @param random
	 * @param length
	 */
	public RandomBooleanArraySupplier(RandomBooleanSupplier random, RandomIntSupplier length) {
		super(random, length);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.simon.Simon.vectors.RandomArraySupplier#getClassType()
	 */
	@Override
	public Class<boolean[]> getClassType() {
		return boolean[].class;
	}
}
