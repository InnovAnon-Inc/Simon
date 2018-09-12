/**
 * 
 */
package com.innovanon.old_simon.Simon2;

import java.util.Random;
import java.util.function.IntSupplier;

import com.innovanon.simon.util.CountingUtil;

/**
 * @author gouldbergstein
 *
 */
public class RangedIntSupplier implements IntSupplier {

	private Random random;
	private int offset;
	private int range;

	public RangedIntSupplier(Random random, int min, int max) {
		this.random = random;
		this.offset = min;
		this.range = CountingUtil.exclusiveRange(min, max);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.IntSupplier#getAsInt()
	 */
	@Override
	public int getAsInt() {
		return random.nextInt(range) + offset;
	}

}
