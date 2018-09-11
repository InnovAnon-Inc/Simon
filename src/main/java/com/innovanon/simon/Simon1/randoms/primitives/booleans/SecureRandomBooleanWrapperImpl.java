/**
 * 
 */
package com.innovanon.simon.Simon1.randoms.primitives.booleans;

import java.security.SecureRandom;

/**
 * @author gouldbergstein
 *
 */
public class SecureRandomBooleanWrapperImpl extends RandomBooleanWrapperAbs<SecureRandom>
		implements RandomBooleanWrapper {

	/**
	 * @param random
	 */
	public SecureRandomBooleanWrapperImpl(SecureRandom random) {
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
