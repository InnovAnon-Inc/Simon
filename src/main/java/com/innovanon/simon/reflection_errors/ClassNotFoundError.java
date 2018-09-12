/**
 * 
 */
package com.innovanon.simon.reflection_errors;

import java.util.Objects;

/**
 * @author gouldbergstein
 *
 */
public class ClassNotFoundError extends Error {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7659214346578480364L;

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ClassNotFoundError(String message, ClassNotFoundException cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		Objects.requireNonNull(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ClassNotFoundError(String message, ClassNotFoundException cause) {
		super(message, cause);
		Objects.requireNonNull(cause);
	}

	/**
	 * @param cause
	 */
	public ClassNotFoundError(ClassNotFoundException cause) {
		super(cause);
		Objects.requireNonNull(cause);
	}
}
