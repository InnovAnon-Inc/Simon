/**
 * 
 */
package com.innovanon.simon.Simon;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Function;

import com.innovanon.simon.instantiator.ClassToObjectInstantiator;
import com.innovanon.simon.instantiator.RandomObjectIterable;
import com.innovanon.simon.instantiators.Instantiators;
import com.innovanon.simon.instantiators.ObjectInstantiator;
import com.innovanon.simon.iter.ConvIterator;
import com.innovanon.simon.struct.bags.BagImpl;
import com.innovanon.simon.util.StringUtil;

/**
 * @author gouldbergstein
 *
 */
public enum App {
	INSTANCE;

	App() {

	}

	public static void main(String... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Random random = new Random();
		Iterable<Object> iterable = new RandomObjectIterable(random);
		Iterator<Object> iterator = iterable.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			String string = StringUtil.toString(next);
			System.out.println(string);
		}
	}
}
