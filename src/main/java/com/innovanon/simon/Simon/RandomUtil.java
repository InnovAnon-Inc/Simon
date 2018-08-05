/**
 * 
 */
package com.innovanon.simon.Simon;

import java.util.List;
import java.util.Random;

/**
 * @author seanrdev
 *
 */
public class RandomUtil {
	private Random random;

	public RandomUtil(Random random) {
		this.random = random;
	}

	public int randomRange(int min, int max) {
		int range = range(min, max);
		return random.nextInt(range) + min;
	}
	/*
	public int randomRange2(int mid, int range) {
		int midrange = range / 2;
		return random.nextInt(range) - midrange;
	}
	 */
	public int range(int min, int max) {
		return max - min + 1;
	}
	
	public <T> T getRandomElement(T[] arr) {
		int i = random.nextInt(arr.length);
		T ret = arr[i];
		return ret;
	}

	public <T> T getRandomElement(List<T> arr) {
		int i = random.nextInt(arr.size());
		T ret = arr.get(i);
		return ret;
	}
}
