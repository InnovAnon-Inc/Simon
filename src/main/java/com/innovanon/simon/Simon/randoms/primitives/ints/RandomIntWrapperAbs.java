/**
 * 
 */
package com.innovanon.simon.Simon.randoms.primitives.ints;

import com.innovanon.simon.Simon.randoms.RandomWrapperAbs;

/**
 * @author gouldbergstein
 *
 */
public abstract class RandomIntWrapperAbs<R> extends RandomWrapperAbs<Integer,R> implements RandomIntWrapper {

	/**
	 * @param random
	 */
	public RandomIntWrapperAbs(R random) {
		super(random);
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon.randoms.RandomWrapper#next()
	 */
	@Override
	public Integer next() {
		return Integer.valueOf(nextInt( ));
	}
}
