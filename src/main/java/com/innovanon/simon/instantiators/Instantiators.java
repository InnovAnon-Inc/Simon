/**
 * 
 */
package com.innovanon.simon.instantiators;

import java.util.function.Function;
import java.util.function.Predicate;

import com.innovanon.simon.instantiator.Instantiator;

/**
 * @author gouldbergstein
 */
public interface Instantiators<T> extends Predicate<Class< ?>>, Function<Class< ?>, Instantiator<T>>{

}
