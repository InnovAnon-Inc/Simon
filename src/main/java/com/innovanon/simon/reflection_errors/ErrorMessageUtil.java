/**
 * 
 */
package com.innovanon.simon.reflection_errors;

import java.lang.reflect.Method;

import com.innovanon.simon.util.StringUtil;

/**
 * @author gouldbergstein
 *
 */
public enum ErrorMessageUtil {
	;
	/**
	 * https://stackoverflow.com/questions/442747/getting-the-name-of-the-currently-executing-method#5891326
	 * @param messageSource
	 * @param parameters
	 * @return
	 */
	public static String getMessage(Object messageSource, Object parameters) {
		Class<?> messageSourceClass = messageSource.getClass();
		Class<?> sourceClass = messageSourceClass.getEnclosingClass();
		Method sourceMethod = messageSourceClass.getEnclosingMethod();
		String sourceClassName = sourceClass.getName();
		String sourceMethodName = sourceMethod.getName();
		String message = String.format("%s.%s (%s)", sourceClassName, sourceMethodName,
				StringUtil.toString2(parameters));
		return message;
	}
}
