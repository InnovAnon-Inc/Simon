/**
 * 
 */
package com.innovanon.simon.Simon;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;
import java.util.Random;

import com.innovanon.simon.instantiator.RandomObjectIterable;
import com.innovanon.simon.iter.ErrorEatingIterator;
import com.innovanon.simon.reflection_errors.ClassNotFoundError;
import com.innovanon.simon.reflection_errors.ConstructorInstantiationFailedError;
import com.innovanon.simon.reflection_errors.UnsupportedInstantiationClassError;
import com.innovanon.simon.util.StringUtil;
import com.innovanon.simon.util.stream.ErrorEatingFunction;

/**
 * @author gouldbergstein
 *
 */
public enum App implements Runnable {
	INSTANCE;

	App() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		Random random = new Random();
		Iterable<Object> iterable = new RandomObjectIterable(random);
		Iterator<Object> iter1 = iterable.iterator();
		Iterator<Object> iterator = new ErrorEatingIterator<>(iter1,
				Arrays.asList(UnsupportedInstantiationClassError.class, ConstructorInstantiationFailedError.class,
						ClassNotFoundException.class, ClassNotFoundError.class, Error.class, RuntimeException.class,Throwable.class),
				false);

		ErrorEatingFunction<Object, String> eat = new ErrorEatingFunction<Object, String>(
				Arrays.asList(UnsupportedOperationException.class, Error.class, RuntimeException.class,Throwable.class), false, StringUtil::toString2);

		while (iterator.hasNext()) {
			try {
				Object next = iterator.next();
				// try {
				// String string = StringUtil.toString2(next);
				Optional<String> string = eat.apply(next);
				if (string.isPresent())
					System.out.println(string);
				else
					System.err.println("(object not present)");
				// } catch (IllegalAccessException | IllegalArgumentException |
				// InvocationTargetException
				// | NoSuchMethodException | SecurityException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
			} catch (Throwable t) {
				Error e = new Error(t);
				e.printStackTrace();
				throw e;
			}
		}
	}

	public static void main(String... args) {
		App.INSTANCE.run();
	}
}
