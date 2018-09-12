/**
 * 
 */
package com.innovanon.simon.primitives.chars;

import com.innovanon.simon.primitives.PInstantiatorAbs;

/**
 * @author gouldbergstein
 *
 */
public abstract class CharPInstantiatorAbs extends PInstantiatorAbs<Character> implements CharPInstantiator {

	/**
	 */
	public CharPInstantiatorAbs() {
		super(char.class, Character.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Character get() {
		return Character.valueOf(getAsChar());
	}
}
