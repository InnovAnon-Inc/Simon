/**
 * 
 */
package com.innovanon.simon.Simon;

import java.util.Arrays;
import java.util.Random;

import com.innovanon.simon.Simon.functions.RandomArrayFunction;
import com.innovanon.simon.Simon.randoms.RandomWrapper;
import com.innovanon.simon.Simon.randoms.primitives.booleans.RandomBooleanWrapper;
import com.innovanon.simon.Simon.randoms.primitives.booleans.RandomBooleanWrapperImpl;
import com.innovanon.simon.Simon.randoms.primitives.ints.RandomIntWrapper;
import com.innovanon.simon.Simon.randoms.primitives.ints.RandomIntWrapperImpl;
import com.innovanon.simon.Simon.randoms.primitives.ints.RandomRangedIntWrapper;
import com.innovanon.simon.Simon.suppliers.RandomSupplier;
import com.innovanon.simon.Simon.suppliers.primitives.booleans.RandomBooleanSupplier;
import com.innovanon.simon.Simon.suppliers.primitives.ints.RandomIntSupplier;

/**
 * @author gouldbergstein
 *
 */
public enum App {
	INSTANCE;
	
	private RandomArrayFunction<boolean[], Boolean, RandomBooleanSupplier> random;
	
	App () {
		Random r0 = new Random();
		RandomIntWrapper r1 = new RandomIntWrapperImpl(r0);
		RandomIntWrapper r2 = new RandomRangedIntWrapper(r1, 0, 20);
		RandomIntSupplier l = new RandomIntSupplier(r2);
		RandomBooleanWrapper r3 = new RandomBooleanWrapperImpl (r0);
		RandomBooleanSupplier r4 = new RandomBooleanSupplier(r3);
		random = new RandomArrayFunction<boolean[],Boolean,RandomBooleanSupplier>(r4, l );
	}
	
	public static void main(String...args) {
		App app = App.INSTANCE;
		Object out = app.random.apply(boolean[].class);
		System.out.println(Arrays.toString((boolean[])out));
	}
}
