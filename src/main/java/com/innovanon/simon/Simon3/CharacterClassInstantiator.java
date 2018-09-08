/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.PrimitiveIterator.OfInt;
import java.util.Random;
import java.util.function.IntPredicate;

/**
 * @author gouldbergstein
 *
 */
public class CharacterClassInstantiator implements CharacterInstantiator {

	private Random random;
	private IntPredicate characterClassTest;
	
	/**
	 * @param random
	 */
	public CharacterClassInstantiator(Random random, IntPredicate characterClassTest) {
		this.random = random;
		this.characterClassTest = characterClassTest;
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.CharacterInstantiator#instantiateCharacter()
	 */
	@Override
	public char instantiateCharacter() {
		OfInt i = random.ints().filter(characterClassTest).limit(1).iterator();
		int ret = i.nextInt();
		assert ! i.hasNext();
		assert Character.MIN_VALUE <= ret && ret <= Character.MAX_VALUE;
		return (char)ret;
	}

}
