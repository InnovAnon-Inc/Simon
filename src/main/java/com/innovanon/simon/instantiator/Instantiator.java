/**
 * 
 */
package com.innovanon.simon.instantiator;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author gouldbergstein
 */
public interface Instantiator<T> extends Predicate<Class< ?>>, Function<Class< ?>, T>{

}
