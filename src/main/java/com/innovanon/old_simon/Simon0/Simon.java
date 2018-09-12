/**
 * 
 */
package com.innovanon.old_simon.Simon0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeElementsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

/**
 * @author seanrdev
 *
 */
public class Simon {

	private Random random;

	private Map<Class<?>, Collection<Method>> retTypeToMethods;
	private Map<Class<?>, Collection<Object>> typeToInstances;
	private Map<Class<?>, Collection<Class<?>>> typeToSubtypes;

	private Reflections reflections;

	// TODO
	private static boolean isProduction() {
		return false;
	}

	public Simon(Random random) {
		this.random = random;
//		util = new RandomUtil(random);
//		this.primitives = new PrimitivesInstantiator<Object>(random);
		// TODO
//		this.arrays = new ArraysInstantiator<Object>(this, Object.class);

		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setScanners(new SubTypesScanner(false), new ResourcesScanner(), new TypeElementsScanner());
		List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
		classLoadersList.add(ClasspathHelper.contextClassLoader());
		classLoadersList.add(ClasspathHelper.staticClassLoader());
		// System.err.println(classLoadersList);
		// cb.setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new
		// ClassLoader[2])));

		// cb.filterInputsBy(new
		// FilterBuilder().include(FilterBuilder.prefix("org.reflections")));
		// FilterBuilder inputsFilter = new FilterBuilder();
		// inputsFilter.include(".*");
		// cb.filterInputsBy(inputsFilter);

		cb.setClassLoaders(classLoadersList.toArray(new ClassLoader[classLoadersList.size()]));
		cb.setExpandSuperTypes(true);

		// reflections = isProduction() ? Reflections.collect() : new Reflections(cb,
		// "com.innovanon.simon");
		reflections = isProduction() ? Reflections.collect() : new Reflections(cb);
		// if (reflections == null) System.err.println("borked");
		reflections.expandSuperTypes();

		/*
		 * Reflections ref = new Reflections(cb); // ... Store s =
		 * reflections.getStore(); //Set<String> typeSet =
		 * s.getStoreMap().get("TypeElementsScanner").keySet(); Set<String> typeSet =
		 * s.get("TypeElementsScanner").keySet(); Set<Class<? extends Object>> classes =
		 * Sets.newHashSet(ReflectionUtils.forNames(typeSet, reflections
		 * .getConfiguration().getClassLoaders()));
		 */
	}

	public Simon(long seed) {
		this(new Random(seed));
	}

	public Simon() {
		this(new Random());
	}

	/*
	 * public void foo() { // reflections.getMethodsReturn(returnType); //
	 * reflections.getSubTypesOf(type); // reflections.
	 * System.out.println(reflections.getSubTypesOf(Object.class)); }
	 */

	//@SuppressWarnings("unchecked")
	//public <T> T instantiate(Class<T> clazz) {
	//	if (clazz.isArray())
	//		return instantiateArray(clazz);
	//	if (clazz.isPrimitive())
	//		return instantiatePrimitive(clazz);
	//	if (clazz.isEnum())
	//		return instantiateEnum(clazz);
	//	// if (clazz.isInterface())
	//	// if (clazz.isAnnotation())
	//	// if (clazz.isAnonymousClass())
	//	// if (clazz.isLocalClass())
	//	// if (clazz.isMemberClass())
	//	// if (clazz.isSynthetic())
	//	throw new AssertionError("unexpected flow");
	//}

//	private PrimitivesInstantiator<?> primitives;
//	private RandomUtil util;
//	private ArraysInstantiator<?>arrays;
	
	//@SuppressWarnings("unchecked")
	//public <T> T instantiatePrimitive(Class<T> clazz) {
	//	return  (T) primitives.instantiate(clazz);
	//}
	 /*
	public Object instantiatePrimitive (Class<?>clazz) {
		return primitives.instantiate(clazz);
	}
	*/
//	public <T> T instantiateEnum(Class<T> clazz) {
//		T[] arr = clazz.getEnumConstants();
//		return util.getRandomElement(arr);
//	}

	//@SuppressWarnings("unchecked")
	//public <T> T instantiateArray(Class<T> clazz) {
	//	//T ret = (T) instantiateArray0(clazz);
	//	//return ret;
	//	return arrays.instantiate(clazz);
//	}
/*
	protected <T> Object instantiateArray0(Class<T> clazz) {
		Class<?> e = clazz.getComponentType();
		// TODO
		// int length = random.nextInt();
		int length = random.nextInt(10);
		Object arr = Array.newInstance(e, length);
		for (int i = 0; i < length; i++) {
			Object value = instantiate(e);
			Array.set(arr, i, value);
		}
		return arr;
	}
*/
	/*
	 * public static Method getMethod (Class<?> clazz) { Method[]
	 * methods=clazz.getMethods(); for (Method method:methods) { Class<?> ret =
	 * method.getReturnType(); } }
	 */
//	public <T> Constructor<T> getConstructor(Class<T> clazz) {
//		List<Constructor<T>> consT = getConstructors(clazz);
//		Constructor<T> con = util.getRandomElement(consT);
//		return con;
//	}

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

	//public <T> Instantiator<T> getInstantiator(Class<T> componentType) {
		// TODO
		//return (Instantiator<T>) this;
	//}

	/**
	 * @return the random
	 */
	public Random getRandom() {
		return random;
	}
	
	

}
