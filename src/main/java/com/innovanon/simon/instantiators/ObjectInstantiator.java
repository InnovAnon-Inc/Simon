/**
 * 
 */
package com.innovanon.simon.instantiators;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

import com.innovanon.simon.instantiator.Instantiator;
import com.innovanon.simon.objects_general.ConstructorInstantiator;
import com.innovanon.simon.objects_special.AnnotationInstantiator;
import com.innovanon.simon.objects_special.ArrayInstantiator;
import com.innovanon.simon.objects_special.ArrayPopulator;
import com.innovanon.simon.objects_special.EnumInstantiator;
import com.innovanon.simon.objects_special.PopulatedArrayInstantiator;
import com.innovanon.simon.objects_special.PrimitiveInstantiator;
import com.innovanon.simon.primitives.ints.RangedRandomIntPInstantiator;
import com.innovanon.simon.reflection_errors.UnsupportedInstantiationClassError;

/**
 * @author gouldbergstein
 */
public class ObjectInstantiator implements Instantiators<Object> {

	private Set<Instantiator<Object>> delegates;

	/**
	 * @param random
	 */
	public ObjectInstantiator(Random random) {
		int initialCapacity = 10;
		Set<Instantiator<Object>> s = new HashSet<>(initialCapacity);

		// Object.class.isAnnotation();
		s.add(new AnnotationInstantiator(random));

		// Object.class.isAnonymousClass();

		// Object.class.isArray();
		IntSupplier lengths = new RangedRandomIntPInstantiator(random, 20, 0);
		Instantiator<Object> arrayInstantiator = new ArrayInstantiator(lengths);
		Consumer<Object> arrayPopulator = new ArrayPopulator(this);
		s.add(new PopulatedArrayInstantiator(arrayInstantiator, arrayPopulator));

		// Object.class.isEnum();
		s.add(new EnumInstantiator(random));

		// Object.class.isInterface();
		// Object.class.isLocalClass();
		// Object.class.isMemberClass();

		// Object.class.isPrimitive();
		s.add(new PrimitiveInstantiator(random));

		// Object.class.isSynthetic();
		
		s.add(new ConstructorInstantiator(random, this));

		this.delegates = Collections.unmodifiableSet(s);
	}

	@Override
	public boolean test(Class<?> t) {
		for (Instantiator<?> delegate : delegates)
			if (delegate.test(t))
				return true;
		return false;
	}

	@Override
	public Instantiator<Object> apply(Class<?> t) {
		// Predicate<Predicate<Class<?>>> predicate = new
		// Predicate<Predicate<Class<?>>>() {
		// @Override
		// public boolean test(Predicate<Class<?>> t0) {
		// return t0.test(t);
		// }
		// };
		//
		// Predicate<Predicate<Class<?>>>predicate = new
		// InvariablePredicate<Class<?>>(t);
		// Collection<Instantiator<Object>> copy =
		// this.delegates.stream().filter(predicate).collect(Collectors.toSet());
		// Bag<Instantiator<Object>> delegates = new BagImpl<>(copy, random);
		// return delegates.remove().apply(t);
		for (Instantiator<Object> delegate : delegates) {
			if (delegate.test(t))
				//return delegate.apply(t);
				return delegate;
		}
		assert !test(t);
		throw UnsupportedInstantiationClassError.factory(new Object() {}, t);
	}
}
