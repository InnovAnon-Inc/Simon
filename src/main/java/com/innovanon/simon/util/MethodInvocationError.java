/**
 * 
 */
package com.innovanon.simon.util;

/**
 * @author gouldbergstein
 *
 */
public class MethodInvocationError extends Error {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4168188287745365633L;

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MethodInvocationError(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MethodInvocationError(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public MethodInvocationError(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
