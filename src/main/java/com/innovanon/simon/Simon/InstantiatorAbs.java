/**
 * 
 */
package com.innovanon.simon.Simon;

import java.util.Random;

/**
 * @author seanrdev
 *
 */
public abstract class InstantiatorAbs<T> implements Instantiator<T> {
	protected Random random;
	public InstantiatorAbs(Random random) {
		this.random = random;
	}
}
