/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 * 
 * InnovAnon, Inc. Proprietary
 * 
 * NOTICE:
 * All reproductions, total or partial, of this work must retain this notice.
 * 
 * Possession or use of this technology implies consent to our Terms of Service.
 * 
 * Owner and management NOT responsible for injury or death resulting from the use of this equipment.
 * 
 * If any clause in this notice is invalid or unenforceable in your jurisdiction, that does NOT necessarily invalidate any other clause in this notice.
 * 
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */
package com.innovanon.old_simon.Simon3;

import java.util.PrimitiveIterator.OfInt;
import java.util.Random;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author gouldbergstein
 *
 */
public class CharacterClassInstantiator extends RangeIntegerInstantiator implements CharacterInstantiator {

	private IntPredicate characterClassTest;
	
	/**
	 * @param random
	 */
	public CharacterClassInstantiator(Function<Integer, Integer> random, IntPredicate characterClassTest) {
		super(random, Character.MIN_VALUE, Character.MAX_VALUE);
		this.characterClassTest = characterClassTest;
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.CharacterInstantiator#instantiateCharacter()
	 */
	@Override
	public char instantiateCharacter() {
		
		//OfInt i = i.filter(characterClassTest).limit(1).iterator();
		// TODO
		OfInt i = null;
		int ret = i.nextInt();
		assert ! i.hasNext();
		assert Character.MIN_VALUE <= ret && ret <= Character.MAX_VALUE;
		return (char)ret;
	}

}

/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */