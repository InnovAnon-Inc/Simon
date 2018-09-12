/**
 * 
 */
package com.innovanon.simon.ems;

import java.util.function.Consumer;

/**
 * @author gouldbergstein
 *
 */
public enum ShortConsumer implements Consumer<Short> {
	INSTANCE;

	/* (non-Javadoc)
	 * @see java.util.function.Consumer#accept(java.lang.Object)
	 */
	@Override
	public void accept(Short t) {
		System.out.println(t);
	}

}
