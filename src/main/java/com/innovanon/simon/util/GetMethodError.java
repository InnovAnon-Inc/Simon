/**
 * 
 */
package com.innovanon.simon.util;

/**
 * @author gouldbergstein
 *
 */
public class GetMethodError extends Error {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4478976639090089415L;

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public GetMethodError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public GetMethodError(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public GetMethodError(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
