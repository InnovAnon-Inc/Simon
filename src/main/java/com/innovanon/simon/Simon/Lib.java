/**
 * 
 */
package com.innovanon.simon.Simon;

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
import org.reflections.util.FilterBuilder;

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
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setScanners(new SubTypesScanner(false), new ResourcesScanner(), new TypeElementsScanner());
		List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
		classLoadersList.add(ClasspathHelper.contextClassLoader());
		classLoadersList.add(ClasspathHelper.staticClassLoader());
		System.err.println(classLoadersList);
		cb.setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[2])));
		//cb.filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix("org.reflections")));
		//FilterBuilder inputsFilter = new FilterBuilder();
		//inputsFilter.include(".*");
		//cb.filterInputsBy(inputsFilter);
		
		//cb.setClassLoaders(classLoaders);
		cb.setExpandSuperTypes(true);
		
		//reflections = isProduction() ? Reflections.collect() : new Reflections(cb, "com.innovanon.simon");
		reflections = isProduction() ? Reflections.collect() : new Reflections(cb);
		if (reflections == null) System.err.println("borked");
		reflections.expandSuperTypes();
		
		/*
		Reflections ref = new Reflections(cb);
		// ...
		Store s = reflections.getStore();
		//Set<String> typeSet = s.getStoreMap().get("TypeElementsScanner").keySet();
		Set<String> typeSet = s.get("TypeElementsScanner").keySet();
		Set<Class<? extends Object>> classes = Sets.newHashSet(ReflectionUtils.forNames(typeSet, reflections
				            .getConfiguration().getClassLoaders()));
				            */
	}

	public Lib(long seed) {
		this(new Random(seed));
	}

	public Lib() {
		this(new Random());
	}
	
	public void foo () {
		//reflections.getMethodsReturn(returnType);
		//reflections.getSubTypesOf(type);
		//reflections.
		System.out.println(reflections.getSubTypesOf(Object.class));
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
