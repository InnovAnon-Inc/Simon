/**
 * 
 */
package com.innovanon.struct;

import java.util.Collection;
import java.util.Queue;

/**
 * a random queue
 * @author gouldbergstein
 */
public interface Bag<E> extends Collection<E>, Queue<E> {
	/**
	 * removes from the bag the specified number of elements selected arbitrarily
	 * (most implementations will use random selection)
	 * @param amount the number of elements to remove from the bag
	 * @return the elements which were removed from the bag
	 * @see java.util.Queue#remove()
	 */
	Collection<E> bulkRemove (int amount) ;
	/**
	 * removes from the bag an arbitrarily selected number of elements 
	 * (most implementations will use random selection)
	 * @return the elements which were removed from the bag
	 * @see Bag#bulkRemove(int)
	 */
	Collection<E> bulkRemove ();
}
