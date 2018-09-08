/**
 * 
 */
package com.innovanon.simon.Simon3;

/**
 * @author gouldbergstein
 *
 */
public interface ArrayInstantiator<T> {

	Object instantiateArray(Class<? extends T> clazz);
}