/**
 * 
 */
package com.innovanon.simon.reflection_errors;

import java.util.Collection;
import java.util.Objects;

import com.innovanon.simon.util.reflection.ReflectionUtil;

/**
 * @author gouldbergstein
 *
 */
public abstract class DynamicallyTypeCheckedError extends Error {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4403684980176252716L;

	private final void validateCause(Throwable cause, Collection<Class<? extends Throwable>> throwables) {
		Objects.requireNonNull(cause);
		// validateCause (cause);
		if (!ReflectionUtil.isInstance(cause, throwables))
			throw new IllegalArgumentException(cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public DynamicallyTypeCheckedError(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace, Collection<Class<? extends Throwable>> types) {
		super(message, cause, enableSuppression, writableStackTrace);
		validateCause(cause, types);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DynamicallyTypeCheckedError(String message, Throwable cause, Collection<Class<? extends Throwable>> types) {
		super(message, cause);
		validateCause(cause, types);
	}

	/**
	 * @param cause
	 */
	public DynamicallyTypeCheckedError(Throwable cause, Collection<Class<? extends Throwable>> types) {
		super(cause);
		validateCause(cause, types);
	}
}
