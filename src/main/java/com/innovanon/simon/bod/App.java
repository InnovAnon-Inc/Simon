/**
 * 
 */
package com.innovanon.simon.bod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.innovanon.simon.instantiator.Instantiator;
import com.innovanon.simon.instantiators.Instantiators;
import com.innovanon.simon.instantiators.ObjectInstantiator;
import com.innovanon.simon.iter.Reiterator;
import com.innovanon.simon.reflection_errors.UnsupportedInstantiationClassError;
import com.innovanon.struct.Structs.bag.Bag;
import com.innovanon.struct.Structs.bag.BagImpl;

/**
 * @author gouldbergstein
 *
 */
public enum App implements Runnable {
	INSTANCE;

	private Random random;
	private Bag<Dick> bagOfDicks;

	App() {
		random = new Random();
		int initialCapacity = random.nextInt(Byte.MAX_VALUE);
		bagOfDicks = new BagImpl<>(initialCapacity, random);
	}

	public int fillBag() {
		int amount = random.nextInt(20) + 2; // it's not funny, otherwise
		fillBag(amount);
		return amount;
	}

	public void fillBag(int amount) {
		bagOfDicks.addAll(getDicks(amount));
	}

	private Collection<Dick> getDicks(int amount) {
		List<Dick> dicks = new LinkedList<>();
		for (int k = 1; k <= amount; k++) {
			Dick dick = new Dick(random.nextInt(20));
			dicks.add(dick);
		}
		return dicks;
	}

	/**
	 * @return the bagOfDicks
	 */
	public Bag<Dick> getBagOfDicks() {
		return bagOfDicks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		int numberOfDicks = INSTANCE.fillBag();
		Bag<Dick> yourBagOfDicks;

		do {
			System.out.printf("number of dicks for you: %d%n", numberOfDicks);
			yourBagOfDicks = INSTANCE.getBagOfDicks();
			Vacuum.suck(yourBagOfDicks);
		} while (yourBagOfDicks.size() < 4);

		Bag<Dick> myBagOfDicks = new BagImpl<>(yourBagOfDicks.size(), INSTANCE.random);
		;

		do {
			myBagOfDicks.addAll(yourBagOfDicks.bulkRemove());

			// System.out.println(myBagOfDicks);
			System.out.printf("number of dicks for me: %d%n", myBagOfDicks.size());
			Vacuum.suck(myBagOfDicks);
		} while (myBagOfDicks.size() < 3);

		System.out.println("reiterating the bag of dicks:");

		Iterator<Dick> dickIterator = new Reiterator<>(myBagOfDicks);
		List<Dick> dickList1, dickList2;

		int cnt = 0;
		do {
			cnt++;
			dickList1 = new ArrayList<>(myBagOfDicks.size());
			for (int k = 1; k <= myBagOfDicks.size(); k++)
				dickList1.add(dickIterator.next());
			dickList2 = new ArrayList<>(myBagOfDicks.size());
			for (int k = 1; k <= myBagOfDicks.size(); k++)
				dickList2.add(dickIterator.next());
		} while (dickList1.equals(dickList2));

		System.out.println(dickList1);
		System.out.println(dickList2);
		System.out.printf("iterations: %d%n", cnt);

		// RandomObjectIterable i = new RandomObjectIterable(random);
		Instantiators<Object> i0 = new ObjectInstantiator(random);
		Instantiator<Object> i3 = i0.apply(BagImpl.class);
		while (true) try{
		Object next= i3.apply(BagImpl.class);
		System.out.println(next);
		}catch (UnsupportedInstantiationClassError e) {
			
		}
		//
		//Bag<Class<?>> bag = new BagImpl<>(Arrays.asList(Bag.class), random);
		//Iterable<Object> i1 = new InstantiaIterable(bag, i0);
		//while (true) {
		//	Iterator<Object> i2 = i1.iterator();
		//	System.out.println("boink");
		//	while (i2.hasNext()) {
		//		System.out.println(i2.next());
		//	}
		//}
		// yourBagOfDicks =

	}

	public static void main(String... args) {
		INSTANCE.run();
	}
}
