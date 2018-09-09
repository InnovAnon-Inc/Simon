package com.innovanon.simon.Simon4;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator.OfInt;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author gouldbergstein
 *
 */
public class RandomIntStream extends RandomStream<Integer, IntStream> implements IntStream {

	/**
	 * 
	 */
	public RandomIntStream() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.util.stream.BaseStream#isParallel()
	 */
	@Override
	public boolean isParallel() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.BaseStream#unordered()
	 */
	@Override
	public IntStream unordered() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.BaseStream#onClose(java.lang.Runnable)
	 */
	@Override
	public IntStream onClose(Runnable closeHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.BaseStream#close()
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#filter(java.util.function.IntPredicate)
	 */
	@Override
	public IntStream filter(IntPredicate predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#map(java.util.function.IntUnaryOperator)
	 */
	@Override
	public IntStream map(IntUnaryOperator mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#mapToObj(java.util.function.IntFunction)
	 */
	@Override
	public <U> Stream<U> mapToObj(IntFunction<? extends U> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#mapToLong(java.util.function.IntToLongFunction)
	 */
	@Override
	public LongStream mapToLong(IntToLongFunction mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#mapToDouble(java.util.function.IntToDoubleFunction)
	 */
	@Override
	public DoubleStream mapToDouble(IntToDoubleFunction mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#flatMap(java.util.function.IntFunction)
	 */
	@Override
	public IntStream flatMap(IntFunction<? extends IntStream> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#distinct()
	 */
	@Override
	public IntStream distinct() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#sorted()
	 */
	@Override
	public IntStream sorted() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#peek(java.util.function.IntConsumer)
	 */
	@Override
	public IntStream peek(IntConsumer action) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#limit(long)
	 */
	@Override
	public IntStream limit(long maxSize) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#skip(long)
	 */
	@Override
	public IntStream skip(long n) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#forEach(java.util.function.IntConsumer)
	 */
	@Override
	public void forEach(IntConsumer action) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#forEachOrdered(java.util.function.IntConsumer)
	 */
	@Override
	public void forEachOrdered(IntConsumer action) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#toArray()
	 */
	@Override
	public int[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#reduce(int, java.util.function.IntBinaryOperator)
	 */
	@Override
	public int reduce(int identity, IntBinaryOperator op) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#reduce(java.util.function.IntBinaryOperator)
	 */
	@Override
	public OptionalInt reduce(IntBinaryOperator op) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#collect(java.util.function.Supplier, java.util.function.ObjIntConsumer, java.util.function.BiConsumer)
	 */
	@Override
	public <R> R collect(Supplier<R> supplier, ObjIntConsumer<R> accumulator, BiConsumer<R, R> combiner) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#sum()
	 */
	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#min()
	 */
	@Override
	public OptionalInt min() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#max()
	 */
	@Override
	public OptionalInt max() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#count()
	 */
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#average()
	 */
	@Override
	public OptionalDouble average() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#summaryStatistics()
	 */
	@Override
	public IntSummaryStatistics summaryStatistics() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#anyMatch(java.util.function.IntPredicate)
	 */
	@Override
	public boolean anyMatch(IntPredicate predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#allMatch(java.util.function.IntPredicate)
	 */
	@Override
	public boolean allMatch(IntPredicate predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#noneMatch(java.util.function.IntPredicate)
	 */
	@Override
	public boolean noneMatch(IntPredicate predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#findFirst()
	 */
	@Override
	public OptionalInt findFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#findAny()
	 */
	@Override
	public OptionalInt findAny() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#asLongStream()
	 */
	@Override
	public LongStream asLongStream() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#asDoubleStream()
	 */
	@Override
	public DoubleStream asDoubleStream() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#boxed()
	 */
	@Override
	public Stream<Integer> boxed() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#sequential()
	 */
	@Override
	public IntStream sequential() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#parallel()
	 */
	@Override
	public IntStream parallel() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#iterator()
	 */
	@Override
	public OfInt iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.stream.IntStream#spliterator()
	 */
	@Override
	public java.util.Spliterator.OfInt spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
