/**
 * 
 */
package com.innovanon.simon.reflection_errors;

/**
 * @author gouldbergstein
 *
 */
public class ConstructorInstantiationFailedError extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6291408913570586813L;

	/**
	 * @param s
	 */
	public ConstructorInstantiationFailedError(String s) {
		super(s);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ConstructorInstantiationFailedError(String message, Throwable cause) {
		super(message, cause);
	}

	public static ConstructorInstantiationFailedError factory(Object messageSource, Object parameters) {
		String message = ErrorMessageUtil.getMessage(messageSource, parameters);
		return new ConstructorInstantiationFailedError(message);
	}
}
