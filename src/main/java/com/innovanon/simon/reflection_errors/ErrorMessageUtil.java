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
