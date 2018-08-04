/**
 * 
 */
package com.innovanon.simon.Simon.primitives;

import java.util.Random;

import com.innovanon.simon.Simon.RandomUtil;

/**
 * Instantiates shorts.
 * 
 * @author seanrdev
 */
public class ShortInstantiator extends NumberInstantiator<Short> {

	private RandomUtil util;

	public ShortInstantiator(Random random) {
		super(random);
		util = new RandomUtil(random);
	}

	@Override
	public Short instantiate() {
		return Short.valueOf(instantiateShort());
	}

	protected short instantiateShort() {
		int ret = util.randomRange(Short.MIN_VALUE, Short.MAX_VALUE);
		assert ret >= Short.MIN_VALUE;
		assert ret <= Short.MAX_VALUE;
		return (short) ret;
	}

}
