/**
 * 
 */
package com.innovanon.simon.Simon.struct;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.innovanon.simon.struct.bags.Bag;
import com.innovanon.simon.struct.bags.BagImpl;

/**
 * @author gouldbergstein
 *
 */
class BagImplTest {

	private Bag<Dick> bagOfDicks;
	private Random random;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		random = new Random ();
		int initialCapacity=random.nextInt(Byte.MAX_VALUE);
		bagOfDicks = new BagImpl<>(initialCapacity, random);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		bagOfDicks.clear();
		bagOfDicks = null;
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#BagImpl(int, java.util.Random)}.
	 */
	@Test
	void testBagImpl() {
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#size()}.
	 */
	@Test
	void testSize() {
		//fail("Not yet implemented"); // TODO
//		bagOfDicks.addAll(c);
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#contains(java.lang.Object)}.
	 */
	@Test
	void testContains() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#iterator()}.
	 */
	@Test
	void testIterator() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#toArray()}.
	 */
	@Test
	void testToArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#toArray(T[])}.
	 */
	@Test
	void testToArrayTArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#add(java.lang.Object)}.
	 */
	@Test
	void testAdd() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#remove(java.lang.Object)}.
	 */
	@Test
	void testRemoveObject() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#containsAll(java.util.Collection)}.
	 */
	@Test
	void testContainsAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#addAll(java.util.Collection)}.
	 */
	@Test
	void testAddAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#removeAll(java.util.Collection)}.
	 */
	@Test
	void testRemoveAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#retainAll(java.util.Collection)}.
	 */
	@Test
	void testRetainAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#clear()}.
	 */
	@Test
	void testClear() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#offer(java.lang.Object)}.
	 */
	@Test
	void testOffer() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#remove()}.
	 */
	@Test
	void testRemove() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#poll()}.
	 */
	@Test
	void testPoll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#element()}.
	 */
	@Test
	void testElement() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#peek()}.
	 */
	@Test
	void testPeek() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#bulkRemove(int)}.
	 */
	@Test
	void testBulkRemoveInt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.simon.struct.bags.BagImpl#bulkRemove()}.
	 */
	@Test
	void testBulkRemove() {
		fail("Not yet implemented"); // TODO
	}

}
