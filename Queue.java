package stacksqueues;

public interface Queue<E> {
	void add(E element) throws FullQueueException;
	E remove() throws EmptyQueueException;
	E element() throws EmptyQueueException;
	int size();
	boolean isEmpty();
}
