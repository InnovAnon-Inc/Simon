/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.Arrays;

/**
 * @author gouldbergstein
 *
 */
public enum App {
	INSTANCE;
	
	private Instantiator<Object>instantiator;
	
	App () {
		this.instantiator = new InstantiatorImpl ();
	}
	
	public static void main (String...args) {
		App app = App.INSTANCE;
		Instantiator<Object> instantiator = app.instantiator;
		Object out = instantiator.instantiate(int[].class);
		System.out.println(Arrays.toString((int[])out));
		out = instantiator.instantiate(char[].class);
		System.out.println(String.valueOf((char[])out));
	}
}
