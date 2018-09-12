/**
 * 
 */
package com.innovanon.old_simon.Simon5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeElementsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

/**
 * @author gouldbergstein
 *
 */
public class ObjectClassSupplier implements Supplier<Class<?extends Object>> {

	private Supplier<String> classNameSupplier;

	/**
	 * 
	 */
	public ObjectClassSupplier() {
		classNameSupplier=new ObjectClassStringSupplier();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Class<?extends Object> get() {
		String type = classNameSupplier.get();
		try {
			return Class.forName(type);
		} catch (ClassNotFoundException e) {
			throw new AssertionError (e);
		}
	}
}
