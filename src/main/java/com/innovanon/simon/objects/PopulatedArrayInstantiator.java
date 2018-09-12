/**
 * 
 */
package com.innovanon.simon.objects;

import java.util.function.Consumer;

import com.innovanon.simon.instantiator.Instantiator;

/**
 * @author gouldbergstein
 *
 */
public class PopulatedArrayInstantiator implements Instantiator<Object> {
	private Instantiator<Object> instantiator;
	private Consumer<Object> populator;

	/**
	 * @param instantiator
	 * @param populator
	 */
	public PopulatedArrayInstantiator(Instantiator<Object> instantiator, Consumer<Object> populator) {
		this.instantiator = instantiator;
		this.populator = populator;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		return instantiator.test(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public Object apply(Class<?> t) {
		Object ret = instantiator.apply(t);
		populator.accept(ret);
		return ret;
	}
}
