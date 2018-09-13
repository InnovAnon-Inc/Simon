/**
 * 
 */
package com.innovanon.simon.objects_special;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

import com.innovanon.simon.Simon.ReflectionsWrapper;
import com.innovanon.simon.instantiator.Instantiator;
import com.innovanon.struct.Structs.bag.Bag;
import com.innovanon.struct.Structs.bag.BagImpl;

/**
 * @author gouldbergstein
 *
 */
public class AnnotationInstantiator implements Instantiator<Object> {

	private Random random;

	/**
	 * @param random
	 */
	public AnnotationInstantiator(Random random) {
		this.random = random;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		Objects.requireNonNull(t);
		return t.isAnnotation();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Annotation apply(Class<?> t) {
		Reflections reflections = ReflectionsWrapper.INSTANCE.getReflections();
		Class<? extends Annotation> annotation = (Class<? extends Annotation>) t;
		Set<Constructor> constructors1 = reflections.getConstructorsAnnotatedWith(annotation);
		Set<Constructor> constructors2 = reflections.getConstructorsWithAnyParamAnnotated(annotation);
		Set<Field> fields = reflections.getFieldsAnnotatedWith(annotation);
		Set<Method> methods1 = reflections.getMethodsAnnotatedWith(annotation);
		Set<Method> methods2 = reflections.getMethodsWithAnyParamAnnotated(annotation);
		Set<Class<?>> types = reflections.getTypesAnnotatedWith(annotation, true);
		Set<AnnotatedElement> all = new HashSet<>(constructors1.size() + constructors2.size() + fields.size()
				+ methods1.size() + methods2.size() + types.size());
		all.addAll(constructors1);
		all.addAll(constructors2);
		all.addAll(fields);
		all.addAll(methods1);
		all.addAll(methods2);
		all.addAll(types);
		Bag<AnnotatedElement> bag = new BagImpl<>(all, random);
		return bag.iterator().next().getAnnotation(annotation);
	}
}
