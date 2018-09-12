/**
 * 
 */
package com.innovanon.old_simon.Simon2;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * @author gouldbergstein
 *
 */
public enum App {
	INSTANCE;
	App() {

	}

	public static void main(String... args) {
		Random random = new Random();
		int min = 0;
		int max = 20;
		/*
		IntSupplier lengths = new RangedIntSupplier(random, min, max);
		Supplier<int[]> arrays = new IntArraySupplierImpl(lengths);
		int[] array = arrays.get();
		IntSupplier elements = new RandomIntSupplier(random);
		Consumer<int[]> populator = new IntArrayPopulator(elements);
		populator.accept(array);
		System.out.println(Arrays.toString(array));
		 */
		random.ints(min,max).mapToObj(new IntFunction<int[]>() {

			@Override
			public int[] apply(int value) {
				return new int[value];
			}
		}).peek(new Consumer<int[]>() {

			@Override
			public void accept(int[] t) {
				int[] src = random.ints(t.length).toArray();
				System.arraycopy(src, 0, t, 0, t.length);
			}

		}).forEach(new Consumer<int[]>() {

			@Override
			public void accept(int[] t) {
				System.out.println(Arrays.toString(t));
			}

		});

		
	}
}
