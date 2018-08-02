/**
 * 
 */
package com.innovanon.simon.Simon;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author seanrdev
 *
 */
public class Lib {
	public Lib() {

	}

	public static <T> Constructor<T> getConstructor(Class<T> clazz) {
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

	public static <T> T getRandomElement(T[] arr) {
		// TODO
		T ret = arr[0];
		return ret;
	}

	public static <T> T getRandomElement(List<T> arr) {
		// TODO
		T ret = arr.get(0);
		return ret;
	}
}
