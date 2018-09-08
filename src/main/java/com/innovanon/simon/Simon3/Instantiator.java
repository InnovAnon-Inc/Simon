/**
 * 
 */
package com.innovanon.simon.Simon3;

/**
 * @author gouldbergstein
 *
 */
public interface Instantiator<T> {

	Object instantiate(Class<? extends T> clazz);
}