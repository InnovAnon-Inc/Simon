/**
 * 
 */
package com.innovanon.simon.Simon.randoms.primitives.booleans;

import java.util.SplittableRandom;

/**
 * @author gouldbergstein
 *
 */
public class SplittableRandomBooleanWrapperImpl extends RandomBooleanWrapperAbs<SplittableRandom>
		implements RandomBooleanWrapper {

	/**
	 * @param random
	 */
	public SplittableRandomBooleanWrapperImpl(SplittableRandom random) {
		super(random);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.innovanon.simon.Simon.randoms.primitives.booleans.RandomBooleanWrapper#
	 * nextBoolean()
	 */
	@Override
	public boolean nextBoolean() {
		return getRandom().nextBoolean();
	}
}
