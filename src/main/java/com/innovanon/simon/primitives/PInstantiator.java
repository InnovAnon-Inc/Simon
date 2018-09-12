/**
 * 
 */
package com.innovanon.simon.primitives;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author gouldbergstein
 *
 */
public interface PInstantiator<T> extends Predicate<Class< ?>>, Supplier<T> {

}
