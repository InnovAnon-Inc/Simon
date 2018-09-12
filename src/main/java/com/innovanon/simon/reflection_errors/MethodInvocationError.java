/**
 * 
 */
package com.innovanon.simon.reflection_errors;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author gouldbergstein
 *
 */
public class MethodInvocationError extends DynamicallyTypeCheckedError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4168188287745365633L;

	private static final Collection<Class<? extends Throwable>> TYPES = Arrays.asList(IllegalAccessException.class,
			IllegalArgumentException.class, InvocationTargetException.class);

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MethodInvocationError(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace, TYPES);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MethodInvocationError(String message, Throwable cause) {
		super(message, cause, TYPES);
	}

	/**
	 * @param cause
	 */
	public MethodInvocationError(Throwable cause) {
		super(cause, TYPES);
	}
}
