/**
 * 
 */
package com.innovanon.simon.Simon.primitives;

import java.util.Random;

import com.innovanon.simon.Simon.Instantiator;

/**
 * Instantiates booleans.
 * 
 * @author seanrdev
 */
//public class BooleanInstantiator extends PrimitiveInstantiator<Boolean>{
public class BooleanInstantiator extends PrimitiveInstantiator<Boolean > implements Instantiator<Boolean>{

	public BooleanInstantiator(Random random) {
		super(random);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean instantiate() {
		return Boolean.valueOf(instantiateBoolean());
	}
	
	protected boolean instantiateBoolean() {
		return random.nextBoolean();
	}
}
