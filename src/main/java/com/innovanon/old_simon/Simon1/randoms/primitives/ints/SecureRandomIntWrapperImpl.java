/**
 * 
 */
package com.innovanon.old_simon.Simon1.randoms.primitives.ints;

import java.security.SecureRandom;

/**
 * @author gouldbergstein
 *
 */
public class SecureRandomIntWrapperImpl extends RandomIntWrapperAbs<SecureRandom> implements RandomIntWrapper {

	/**
	 * @param random
	 */
	public SecureRandomIntWrapperImpl(SecureRandom random) {
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
