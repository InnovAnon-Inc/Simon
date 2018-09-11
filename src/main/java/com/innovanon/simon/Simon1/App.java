/**
 * 
 */
package com.innovanon.simon.Simon1;

import java.util.Random;
import java.util.function.Supplier;

import com.innovanon.simon.Simon1.randoms.primitives.booleans.RandomBooleanWrapper;
import com.innovanon.simon.Simon1.randoms.primitives.booleans.RandomBooleanWrapperImpl;
import com.innovanon.simon.Simon1.randoms.primitives.ints.RandomIntWrapper;
import com.innovanon.simon.Simon1.randoms.primitives.ints.RandomIntWrapperImpl;
import com.innovanon.simon.Simon1.suppliers.primitives.booleans.RandomBooleanSupplier;
import com.innovanon.simon.Simon1.suppliers.primitives.ints.RandomRangedIntSupplier;

/**
 * @author gouldbergstein
 *
 */
public enum App {
	INSTANCE;

	// private RandomArrayFunction<boolean[], Boolean, RandomBooleanSupplier>
	// random;
	//private RandomBooleanArraySupplier random;

	App() {
		Random r0 = new Random();
		RandomIntWrapper r1 = new RandomIntWrapperImpl(r0);
		//RandomIntWrapper r2 = new RandomRangedIntWrapper(r1, 0, 20);
		Supplier<Integer> l = new RandomRangedIntSupplier(r1, 0, 20);
		RandomBooleanWrapper r3 = new RandomBooleanWrapperImpl(r0);
		RandomBooleanSupplier r4 = new RandomBooleanSupplier(r3);
		// random = new RandomArrayFunction<boolean[],Boolean,RandomBooleanSupplier>(r4,
		// l );
		//random = new RandomBooleanArraySupplier(r4, l);
	}

	public static void main(String... args) {
		App app = App.INSTANCE;
		// Object out = app.random.apply(boolean[].class);
		//boolean[] out = app.random.get();
		//System.out.println(Arrays.toString(out));
	}
}
