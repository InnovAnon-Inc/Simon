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
package com.innovanon.simon.Simon3;

import java.security.SecureRandom;
import java.util.Random;
import java.util.SplittableRandom;
import java.util.function.Consumer;

/**
 * @author gouldbergstein
 *
 */
public class ByteInstantiatorImpl implements ByteInstantiator {

	private Consumer<byte[]> random;
	
	
	
	/**
	 * @param random
	 */
	public ByteInstantiatorImpl(Consumer<byte[]> random) {
		this.random = random;
	}
	
	public ByteInstantiatorImpl (Random random) {
		this(random::nextBytes);
	}
	
	public ByteInstantiatorImpl (SecureRandom random) {
		this(random::nextBytes);
	}
	
	public ByteInstantiatorImpl (SplittableRandom random) {
		this(new Consumer<byte[]>() {
			@Override public void accept (byte[] bytes) {
				for (int i = 0; i < bytes.length; i++)
					{int temp=random.nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE + 1);
					assert Byte.MIN_VALUE <= temp && temp<=Byte.MAX_VALUE;
					bytes[i]=(byte) temp;
					}
			}
		});
	}



	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.ByteInstantiator#instantiateByte()
	 */
	@Override
	public byte instantiateByte() {
		byte[] bytes = new byte[1];
		random.accept( bytes);
		return bytes[0];
	}

}

/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */