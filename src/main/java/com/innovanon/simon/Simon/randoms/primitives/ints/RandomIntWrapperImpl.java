/**
 * 
 */
package com.innovanon.simon.Simon.randoms.primitives.ints;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RandomIntWrapperImpl extends RandomIntWrapperAbs<Random> implements RandomIntWrapper {

	/**
	 * @param random
	 */
	public RandomIntWrapperImpl(Random random) {
		super(random);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.innovanon.simon.Simon.randoms.primitives.ints.RandomIntWrapper#nextInt()
	 */
	@Override
	public int nextInt() {
		return getRandom().nextInt();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.innovanon.simon.Simon.randoms.primitives.ints.RandomIntWrapper#nextInt(
	 * int)
	 */
	@Override
	public int nextInt(int range) {
		return getRandom().nextInt(range);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.innovanon.simon.Simon.randoms.primitives.ints.RandomIntWrapper#nextInt(
	 * int, int)
	 */
	@Override
	public int nextInt(int min, int max) {
		return nextInt(max - min) + min;
	}
}
