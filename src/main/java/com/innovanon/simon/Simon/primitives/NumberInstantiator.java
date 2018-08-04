/**
 * 
 */
package com.innovanon.simon.Simon.primitives;

import java.util.Random;

import com.innovanon.simon.Simon.InstantiatorAbs;

/**
 * Instantiates sub-types of number.
 * 
 * @author seanrdev
 */
public abstract class NumberInstantiator<T extends Number> extends InstantiatorAbs<T> {

	public NumberInstantiator(Random random) {
		super(random);
		// TODO Auto-generated constructor stub
	}
}
