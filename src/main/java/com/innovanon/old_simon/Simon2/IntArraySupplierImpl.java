/**
 * 
 */
package com.innovanon.old_simon.Simon2;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * @author gouldbergstein
 *
 */
public class IntArraySupplierImpl implements Supplier<int[]> {

	private IntSupplier lengths;
	
	/**
	 * @param lengths
	 */
	public IntArraySupplierImpl(IntSupplier lengths) {
		this.lengths = lengths;
	}

	/* (non-Javadoc)
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public int[] get() {
		int length = this.lengths.getAsInt();
		return new int[length];
	}
}
