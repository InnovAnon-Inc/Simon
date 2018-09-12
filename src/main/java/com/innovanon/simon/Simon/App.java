/**
 * 
 */
package com.innovanon.simon.Simon;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Function;

import com.innovanon.simon.conv.NameToClassConverter;
import com.innovanon.simon.instantiator.ClassToObjectInstantiator;
import com.innovanon.simon.iter.ConvIterator;
import com.innovanon.simon.struct.BagImpl;

/**
 * @author gouldbergstein
 *
 */
public enum App {
	INSTANCE;

	App() {

	}

	public static void main(String... args) {
		ReflectionsWrapper reflectionsWrapper = ReflectionsWrapper.INSTANCE;
		Collection<String> classNames = reflectionsWrapper.getReflections().getAllTypes();
		// System.out.println(classNames);
		// int initialCapacity = classNames.size();
		Random random = new Random();
		Iterable<String> bag = new BagImpl<>(classNames, random);
		//Iterator<String> classNameIterator = new Reiterator<>(bag);
		//for (int k = 1; k <= 10 && classNameIterator.hasNext(); k++)
		//	System.out.println(classNameIterator.next());
		Iterator<String> classNameIterator = bag.iterator();
		//Iterator<Class<?>> classIterator = new ConvIterator<String, Class<?>>(classNameIterator,
		//		NameToClassConverter.INSTANCE);
		Iterator<Class<?>> classIterator = Arrays.asList(new Class<?>[] {int[][].class, int[][][].class}).iterator();
		Function<Class<?>,Object> objectInstantiator = new ClassToObjectInstantiator(random);
		Iterator<Object> objectIterator = new ConvIterator<Class<?>, Object>(classIterator, objectInstantiator);
		while (objectIterator.hasNext()) {
			Object next = objectIterator.next();
			System.out.println(Arrays.deepToString((Object[]) next));
		}
	}
}
