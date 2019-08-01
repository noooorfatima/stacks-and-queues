package stacksqueues;

import java.util.EmptyStackException;

public interface Stack<E> {
	int size();
	void push(E element) throws FullStackException;
	E pop() throws EmptyStackException;
	E top() throws EmptyStackException;
	boolean isEmpty();
}
