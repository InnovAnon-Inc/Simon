/**
 * 
 */
package com.innovanon.simon.Simon.randoms.primitives.ints;

/**
 * @author gouldbergstein
 *
 */
public class RandomRangedIntWrapper extends RandomIntWrapperAbs<RandomIntWrapper> implements RandomIntWrapper {

	private int min, max;

	/**
	 * @param random
	 */
	public RandomRangedIntWrapper(RandomIntWrapper random, int min, int max) {
		super(random);
		this.min = min;
		this.max = max;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.innovanon.simon.Simon.randoms.primitives.ints.RandomIntWrapper#nextInt()
	 */
	@Override
	public int nextInt() {
		return getRandom().nextInt(min, max);
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
		return getRandom().nextInt(min, max);
	}
	
	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}
}
