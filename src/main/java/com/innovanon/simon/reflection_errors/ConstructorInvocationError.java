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
public class ConstructorInvocationError extends DynamicallyTypeCheckedError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7051270495959664584L;

	private static final Collection<Class<? extends Throwable>> TYPES = Arrays.asList(InstantiationException.class,
			IllegalAccessException.class, IllegalArgumentException.class, InvocationTargetException.class);

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ConstructorInvocationError(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace,TYPES);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ConstructorInvocationError(String message, Throwable cause) {
		super(message, cause,TYPES);
	}

	/**
	 * @param cause
	 */
	public ConstructorInvocationError(Throwable cause) {
		super(cause,TYPES);
	}
}
