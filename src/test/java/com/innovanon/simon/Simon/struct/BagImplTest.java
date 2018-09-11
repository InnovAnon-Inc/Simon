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

import com.innovanon.struct.Bag;
import com.innovanon.struct.BagImpl;

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
	 * Test method for {@link com.innovanon.struct.BagImpl#BagImpl(int, java.util.Random)}.
	 */
	@Test
	void testBagImpl() {
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#size()}.
	 */
	@Test
	void testSize() {
		//fail("Not yet implemented"); // TODO
//		bagOfDicks.addAll(c);
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#contains(java.lang.Object)}.
	 */
	@Test
	void testContains() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#iterator()}.
	 */
	@Test
	void testIterator() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#toArray()}.
	 */
	@Test
	void testToArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#toArray(T[])}.
	 */
	@Test
	void testToArrayTArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#add(java.lang.Object)}.
	 */
	@Test
	void testAdd() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#remove(java.lang.Object)}.
	 */
	@Test
	void testRemoveObject() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#containsAll(java.util.Collection)}.
	 */
	@Test
	void testContainsAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#addAll(java.util.Collection)}.
	 */
	@Test
	void testAddAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#removeAll(java.util.Collection)}.
	 */
	@Test
	void testRemoveAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#retainAll(java.util.Collection)}.
	 */
	@Test
	void testRetainAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#clear()}.
	 */
	@Test
	void testClear() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#offer(java.lang.Object)}.
	 */
	@Test
	void testOffer() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#remove()}.
	 */
	@Test
	void testRemove() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#poll()}.
	 */
	@Test
	void testPoll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#element()}.
	 */
	@Test
	void testElement() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#peek()}.
	 */
	@Test
	void testPeek() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#bulkRemove(int)}.
	 */
	@Test
	void testBulkRemoveInt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.innovanon.struct.BagImpl#bulkRemove()}.
	 */
	@Test
	void testBulkRemove() {
		fail("Not yet implemented"); // TODO
	}

}
