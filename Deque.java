package stacksqueues;

public interface Deque<E> {
	void addFirst(E element) throws FullQueueException;
	void addLast(E element) throws FullQueueException;
	E removeFirst() throws EmptyQueueException;
	E removeLast() throws EmptyQueueException;
	E getFirst() throws EmptyQueueException;
	E getLast() throws EmptyQueueException;
	int size();
	boolean isEmpty();
}
