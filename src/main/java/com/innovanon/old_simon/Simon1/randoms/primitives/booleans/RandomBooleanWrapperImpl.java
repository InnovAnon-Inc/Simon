/**
 * 
 */
package com.innovanon.old_simon.Simon1.randoms.primitives.booleans;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RandomBooleanWrapperImpl extends RandomBooleanWrapperAbs<Random> implements RandomBooleanWrapper {

	/**
	 * @param random
	 */
	public RandomBooleanWrapperImpl(Random random) {
		super(random);
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon.randoms.primitives.booleans.RandomBooleanWrapper#nextBoolean()
	 */
	@Override
	public boolean nextBoolean() {
		return getRandom().nextBoolean();
	}
}
