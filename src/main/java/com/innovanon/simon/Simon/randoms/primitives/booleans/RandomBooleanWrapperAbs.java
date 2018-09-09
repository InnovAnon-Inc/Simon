/**
 * 
 */
package com.innovanon.simon.Simon.randoms.primitives.booleans;

import com.innovanon.simon.Simon.randoms.RandomWrapperAbs;

/**
 * @author gouldbergstein
 *
 */
public abstract class RandomBooleanWrapperAbs<R> extends RandomWrapperAbs<Boolean,R> implements RandomBooleanWrapper {

	/**
	 * @param random
	 */
	public RandomBooleanWrapperAbs(R random) {
		super(random);
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon.randoms.RandomWrapper#next()
	 */
	@Override
	public Boolean next() {
		return Boolean.valueOf(nextBoolean( ));
	}
}
