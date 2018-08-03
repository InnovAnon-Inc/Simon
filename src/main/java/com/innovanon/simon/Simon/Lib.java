/**
 * 
 */
package com.innovanon.simon.Simon;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

/**
 * @author seanrdev
 *
 */
public class Lib {

	private Random random;

	private Map<Class<?>, Collection<Method>> retTypeToMethods;
	private Map<Class<?>, Collection<Object>> typeToInstances;
	private Map<Class<?>, Collection<Class<?>>> typeToSubtypes;

	private Reflections reflections;
	
	// TODO 
	private static boolean isProduction () { return false; }

	public Lib(Random random) {
		this.random = random;
		reflections = isProduction() ? Reflections.collect() : new Reflections("your.package.here");
	}

	public Lib(long seed) {
		this(new Random(seed));
	}

	public Lib() {
		this(new Random());
	}

	/*
	 * public static Method getMethod (Class<?> clazz) { Method[]
	 * methods=clazz.getMethods(); for (Method method:methods) { Class<?> ret =
	 * method.getReturnType(); } }
	 */
	public <T> Constructor<T> getConstructor(Class<T> clazz) {
		List<Constructor<T>> consT = getConstructors(clazz);
		Constructor<T> con = getRandomElement(consT);
		return con;
	}

	@SuppressWarnings("unchecked")
	protected static <T> Constructor<T>[] getConstructors0(Class<T> clazz) {
		Constructor<?>[] cons = clazz.getConstructors();
		// TODO unmodifiable array
		Constructor<T>[] consT = (Constructor<T>[]) cons;
		return consT;
	}

	public static <T> List<Constructor<T>> getConstructors(Class<T> clazz) {
		Constructor<T>[] consT = getConstructors0(clazz);
		List<Constructor<T>> list = Arrays.asList(consT);
		return Collections.unmodifiableList(list);
	}

	public <T> T getRandomElement(T[] arr) {
		int i = random.nextInt(arr.length);
		T ret = arr[i];
		return ret;
	}

	public <T> T getRandomElement(List<T> arr) {
		int i = random.nextInt(arr.size());
		T ret = arr.get(i);
		return ret;
	}
}
