/**
 * 
 */
package com.innovanon.simon.bod;

import java.util.function.Consumer;

import com.innovanon.struct.Structs.bag.Bag;

/**
 * @author gouldbergstein
 *
 */
public enum Vacuum {
	;
	public static <T> void suck(Bag<T> bag) {
		bag.stream().forEach(new Consumer<T>() {
			@Override
			public void accept(T t) {
				System.out.println(t);
			}
		});
	}
}
