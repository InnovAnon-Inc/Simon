/**
 * 
 */
package com.innovanon.simon.primitives;

/**
 * @author gouldbergstein
 *
 */
public abstract class PInstantiatorAbs<T> implements PInstantiator<T> {
	private Class<T> tClass;
	private Class<T> pClass;

	/**
	 * @param tClass
	 * @param pClass
	 */
	protected PInstantiatorAbs(Class<T> pClass, Class<T> tClass) {
		this.tClass = tClass;
		this.pClass = pClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		return pClass.equals(t) || tClass.equals(t);
	}
}
