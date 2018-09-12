/**
 * 
 */
package com.innovanon.simon.conv;

import java.util.function.Function;

/**
 * @author gouldbergstein
 */
public enum NameToClassConverter implements Function<String, Class<?>> {
	INSTANCE;

	/**
	 * @throws Error
	 * @see java.lang.ClassNotFoundException
	 * @see Class#forName(String)
	 */
	/* (non-Javadoc)
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public Class<?> apply(String className) {
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new Error (e);
		}
	}
}
