/**
 * 
 */
package com.innovanon.simon.instantiator;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.innovanon.simon.objects.AnnotationInstantiator;
import com.innovanon.simon.objects.ArrayInstantiator;
import com.innovanon.simon.objects.ArrayPopulator;
import com.innovanon.simon.objects.EnumInstantiator;
import com.innovanon.simon.objects.PopulatedArrayInstantiator;
import com.innovanon.simon.objects.PrimitiveInstantiator;
import com.innovanon.simon.primitives.RangedRandomIntPInstantiator;
import com.innovanon.simon.struct.Bag;
import com.innovanon.simon.struct.BagImpl;
import com.innovanon.simon.util.InvariablePredicate;

/**
 * @author gouldbergstein
 */
public class ClassToObjectInstantiator implements Instantiator<Object> {

	private Set<Instantiator< Object>> delegates;
	private Random random;

	/**
	 * @param random
	 */
	public ClassToObjectInstantiator(Random random) {
		int initialCapacity=9;
		Set<Instantiator< Object>> s = new HashSet<>(initialCapacity);
		s.add(new EnumInstantiator(random));
		s.add(new AnnotationInstantiator(random));
		IntSupplier lengths = new RangedRandomIntPInstantiator(random, 20, 0);
		Instantiator<Object> arrayInstantiator = new ArrayInstantiator(lengths);
		Consumer<Object> arrayPopulator = new ArrayPopulator(this);
		s.add(new PopulatedArrayInstantiator(arrayInstantiator, arrayPopulator));
		s.add(new PrimitiveInstantiator(random));
		this.delegates = Collections.unmodifiableSet(s);
		this.random = random;
	}

	/**
	 * @param random
	 */
	//@SuppressWarnings("unchecked")
	//public ClassToObjectInstantiator(Random random) {
		// TODO
		////Object.class.isAnnotation();
		//Object.class.isAnonymousClass();
		//Object.class.isArray();
		////Object.class.isEnum();
		//Object.class.isInterface();
		//Object.class.isLocalClass();
		//Object.class.isMemberClass();
		//Object.class.isPrimitive();
		//Object.class.isSynthetic();
	//}

	@Override
	public boolean test(Class< ?> t) {
		for (Instantiator<?> delegate : delegates)
			if (delegate.test(t))
				return true;
		return false;
	}

	@Override
	public Object apply(Class<?> t) {
		//Predicate<Predicate<Class<?>>> predicate = new Predicate<Predicate<Class<?>>>() {
		//	@Override
		//	public boolean test(Predicate<Class<?>> t0) {
		//		return t0.test(t);
		//	}
		//};
		//
		//Predicate<Predicate<Class<?>>>predicate = new InvariablePredicate<Class<?>>(t);
		//Collection<Instantiator<Object>> copy = this.delegates.stream().filter(predicate).collect(Collectors.toSet());
		//Bag<Instantiator<Object>> delegates = new BagImpl<>(copy, random);
		//return delegates.remove().apply(t);
		for (Instantiator<Object>delegate:delegates) {
			if (delegate.test(t))
				return delegate.apply(t);
		}
		// TODO
		throw new Error ();
	}
}
