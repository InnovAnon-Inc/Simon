/**
 * 
 */
package com.innovanon.simon.ems;

import java.util.Random;
import java.util.stream.Stream;

import com.innovanon.simon.primitives.shorts.RandomShortPInstantiator;
import com.innovanon.simon.util.function.ShortSupplier;
import com.innovanon.struct.Structs.bag.Bag;
import com.innovanon.struct.Structs.bag.BagImpl;

/**
 * @author gouldbergstein
 *
 */
public enum App implements Runnable {
	INSTANCE;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		int initialCapacity = 20;
		Random random = new Random();
		Bag<Short> bagOfShorts = new BagImpl<>(initialCapacity, random);
		ShortSupplier shorts = new RandomShortPInstantiator(random);
		for (int k = 1; k <= initialCapacity; k++) {
			short e = shorts.getAsShort();
			bagOfShorts.add(e);
		}
		eatMyShorts(bagOfShorts.stream());
	}

	public static void eatMyShorts(Stream<Short> shorts) {
		System.out.println("eating my shorts:");
		shorts.forEach(ShortConsumer.INSTANCE);
	}

	public static void main(String... args) {
		INSTANCE.run();
	}
}
