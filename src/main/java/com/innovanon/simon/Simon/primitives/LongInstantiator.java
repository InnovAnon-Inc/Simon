/**
 * 
 */
package com.innovanon.simon.Simon.primitives;

import java.util.Random;

/**
 * Instantiates longs.
 * 
 * @author seanrdev
 */
public class LongInstantiator extends NumberInstantiator<Long> {

	public LongInstantiator(Random random) {
		super(random);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Long instantiate() {
		return Long.valueOf(instantiateLong());
	}
	
	protected long instantiateLong() {
		return random.nextLong();
	}
}
