/**
 * 
 */
package com.innovanon.simon.Simon;

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
	public Class<?> apply(String className) throws ClassNotFoundError {
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e) {
			throw new ClassNotFoundError(e);
		}
	}
}
