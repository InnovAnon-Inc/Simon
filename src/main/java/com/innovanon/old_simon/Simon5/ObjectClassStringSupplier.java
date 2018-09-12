/**
 * 
 */
package com.innovanon.old_simon.Simon5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
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
public class ObjectClassStringSupplier implements Supplier<String> {
	private Reflections reflections;
	private Random random;
	private List<String> typeList;

	// TODO
	private static boolean isProduction() {
		return false;
	}

	/**
	 * 
	 */
	public ObjectClassStringSupplier() {
		random = new Random();
		initReflections();
		initTypeList();
	}

	private void initReflections() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setScanners(new SubTypesScanner(false), new ResourcesScanner(), new TypeElementsScanner());
		List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
		classLoadersList.add(ClasspathHelper.contextClassLoader());
		classLoadersList.add(ClasspathHelper.staticClassLoader());

		cb.setClassLoaders(classLoadersList.toArray(new ClassLoader[classLoadersList.size()]));
		cb.setExpandSuperTypes(true);

		reflections = isProduction() ? Reflections.collect() : new Reflections(cb);
		reflections.expandSuperTypes();
	}

	private void initTypeList() {
		Set<String> typeSet = reflections.getAllTypes();
		Enumeration<String> typeEnum = Collections.enumeration(typeSet);
		typeList = Collections.list(typeEnum);
		// Collections.shuffle(typeList ,random);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public String get() {
		// String type = typeList.get(0);
		String type = typeList.get(random.nextInt(typeList.size()));
		return type;
	}
}
