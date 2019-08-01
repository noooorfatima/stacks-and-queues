package stacksqueues;

import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {

	private E[] array;
	private int topIndex;
	private int maxSize;
	
	public ArrayStack(int size) {
		// The below is a little tricky.  It's casting the Object array to an array containing the
		// generic type E.
		array = (E[]) new Object[size];
		topIndex = -1;
		maxSize = size;
	}
	@Override
	public int size() {
		return topIndex + 1;
	}
	@Override
	public void push(E element) throws FullStackException {
		if (size() == this.maxSize) {
			throw new FullStackException();
		}
		array[topIndex + 1] = element;
		topIndex++;
	}
	@Override
	public E top() throws EmptyStackException {
		if (size() == 0) {
			throw new EmptyStackException();
		}
		return array[topIndex];
	}
	@Override
	public E pop() throws EmptyStackException {
		if (size() == 0) {
			throw new EmptyStackException();
		}
		E topElement = array[topIndex];
		topIndex--;
		return topElement;
	}
	@Override
	public boolean isEmpty() {
		return size() == 0;
	}
}
