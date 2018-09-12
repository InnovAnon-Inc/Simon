/**
 * 
 */
package com.innovanon.simon.util;

import java.util.Collections;

/**
 * @author gouldbergstein
 *
 */
public enum StringUtil {
	;
	/**
	 * https://stackoverflow.com/questions/19198048/how-to-repeat-string-n-times-in-java
	 * @param str
	 * @param n
	 * @return
	 */
	public static String repeatv1 (String str, int n) {
		return String.valueOf(new char[n]).replace("\0", str);
	}

	/**
	 * @param str
	 * @param n
	 * @return
	 */
	public static String repeatv2(String str, int n) {
		CharSequence delimiter = "";
		Iterable<CharSequence> elements = Collections.nCopies(n, str);
		return String.join(delimiter, elements);
	}
}
