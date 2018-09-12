/**
 * 
 */
package com.innovanon.simon.reflection_errors;

/**
 * @author gouldbergstein
 *
 */
public class UnsupportedInstantiationClassError extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4933267745965498719L;

	/**
	 * @param s
	 */
	public UnsupportedInstantiationClassError(String s) {
		super(s);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public UnsupportedInstantiationClassError(String message, Throwable cause) {
		super(message, cause);
	}
	
	public static UnsupportedInstantiationClassError factory (Object messageSource, Object parameters) {
		String message = ErrorMessageUtil.getMessage(messageSource, parameters);
		return new UnsupportedInstantiationClassError(message);
	}
}
