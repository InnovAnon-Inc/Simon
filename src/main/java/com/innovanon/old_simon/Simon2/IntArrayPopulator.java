/**
 * 
 */
package com.innovanon.old_simon.Simon2;

import java.util.function.Consumer;
import java.util.function.IntSupplier;

/**
 * @author gouldbergstein
 *
 */
public class IntArrayPopulator implements Consumer<int[]> {

	private IntSupplier elements;

	/**
	 * @param elements
	 */
	public IntArrayPopulator(IntSupplier elements) {
		this.elements = elements;
	}

	@Override
	public void accept(int[] t) {
		for (int i = 0; i < t.length; i++)
			t[i] = elements.getAsInt();
	}
}
