/**
 * 
 */
package com.innovanon.simon.fluff;

/**
 * @author gouldbergstein
 *
 */
public class Dick {

	private static final String shaft = "=";
	private static final String glans = ">";
	
	/**
	 * the length of the dick, measured in characters
	 */
	private int length;

	/**
	 * @param length
	 */
	public Dick(int length) {
		this.length = length;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * https://stackoverflow.com/questions/19198048/how-to-repeat-string-n-times-in-java
	 * @param str
	 * @param n
	 * @return
	 */
	private String repeat (String str, int n) {
		return String.valueOf(new char[n]).replace("\0", str);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Dick [%s%s]", repeat (shaft, length), glans);
	}		
}
