/**
 * 
 */
package com.innovanon.old_simon.Simon2;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author gouldbergstein
 *
 */
public class PopulatedIntArraySupplier implements Supplier<int[]> {

	private Supplier<int[]> arrays;
	private Consumer<int[]> populator;

	/**
	 * @param arrays
	 * @param populator
	 */
	public PopulatedIntArraySupplier(Supplier<int[]> arrays, Consumer<int[]> populator) {
		this.arrays = arrays;
		this.populator = populator;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public int[] get() {
		int[] array = arrays.get();
		populator.accept(array);
		return array;
	}

}
