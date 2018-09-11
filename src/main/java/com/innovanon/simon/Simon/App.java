/**
 * 
 */
package com.innovanon.simon.Simon;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

import com.innovanon.struct.BagImpl;
import com.innovanon.struct.conv.NameToClassConverter;
import com.innovanon.struct.iter.ConvIterator;
import com.innovanon.struct.iter.Reiterator;

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
		Collection<String> classNames = reflectionsWrapper.getTypes();
		// System.out.println(classNames);
		// int initialCapacity = classNames.size();
		Random random = new Random();
		Iterable<String> bag = new BagImpl<>(classNames, random);
		//Iterator<String> classNameIterator = new Reiterator<>(bag);
		//for (int k = 1; k <= 10 && classNameIterator.hasNext(); k++)
		//	System.out.println(classNameIterator.next());
		Iterator<String> classNameIterator = bag.iterator();
		Iterator<Class<?>> classIterator = new ConvIterator<String, Class<?>>(classNameIterator,
				NameToClassConverter.INSTANCE);
		
	}
}
