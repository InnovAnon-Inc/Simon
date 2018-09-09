/**
 * 
 */
package com.innovanon.simon.Simon.functions;

import java.util.function.Function;

import com.innovanon.simon.Simon.RandomScalarInstantiator;
import com.innovanon.simon.Simon.randoms.RandomWrapper;

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
