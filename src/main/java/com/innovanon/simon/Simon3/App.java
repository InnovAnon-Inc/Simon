/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 * 
 * InnovAnon, Inc. Proprietary
 * 
 * NOTICE:
 * All reproductions, total or partial, of this work must retain this notice.
 * 
 * Possession or use of this technology implies consent to our Terms of Service.
 * 
 * Owner and management NOT responsible for injury or death resulting from the use of this equipment.
 * 
 * If any clause in this notice is invalid or unenforceable in your jurisdiction, that does NOT necessarily invalidate any other clause in this notice.
 * 
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
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

/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */