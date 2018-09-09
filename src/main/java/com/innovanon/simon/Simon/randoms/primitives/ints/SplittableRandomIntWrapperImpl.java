/**
 * 
 */
package com.innovanon.simon.Simon.randoms.primitives.ints;

import java.util.SplittableRandom;

/**
 * @author gouldbergstein
 *
 */
public class SplittableRandomIntWrapperImpl extends RandomIntWrapperAbs<SplittableRandom> implements RandomIntWrapper {

	/**
	 * @param random
	 */
	public SplittableRandomIntWrapperImpl(SplittableRandom random) {
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
		return getRandom().nextInt(min, max - min);
	}
}
