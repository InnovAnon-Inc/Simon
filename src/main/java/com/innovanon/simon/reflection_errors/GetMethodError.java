/**
 * 
 */
package com.innovanon.simon.reflection_errors;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author gouldbergstein
 *
 */
public class GetMethodError extends DynamicallyTypeCheckedError {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4478976639090089415L;

	private static final Collection<Class<? extends Throwable>> TYPES = Arrays.asList(NoSuchMethodException.class,
			SecurityException.class);

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public GetMethodError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace,TYPES);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public GetMethodError(String message, Throwable cause) {
		super(message, cause,TYPES);
	}

	/**
	 * @param cause
	 */
	public GetMethodError(Throwable cause) {
		super(cause,TYPES);
	}
}
