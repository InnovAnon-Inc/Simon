/**
 * 
 */
package com.innovanon.simon.Simon1.functions;

import java.util.function.Function;

import com.innovanon.simon.Simon1.RandomScalarInstantiator;
import com.innovanon.simon.Simon1.randoms.RandomWrapper;

/**
 * @author gouldbergstein
 */
public abstract class RandomFunction<T, R extends RandomWrapper<T>> extends RandomScalarInstantiator<T, R>
		implements Function<Class<T>, T> {

	/**
	 * @param random
	 */
	public RandomFunction(R random) {
		super(random);
	}
}
