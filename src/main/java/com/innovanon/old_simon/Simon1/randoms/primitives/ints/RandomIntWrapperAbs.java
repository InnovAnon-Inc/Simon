/**
 * 
 */
package com.innovanon.old_simon.Simon1.randoms.primitives.ints;

import com.innovanon.old_simon.Simon1.randoms.RandomWrapperAbs;

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
