package stacksqueues;
/**
 * 
 * @author nfatima
 *
 * this class implements Deque on a circular array
 */
public class ArrayDeque<E> implements Deque<E> {
	
	  public static final int CAPACITY = 1000; // setting the final capacity
	  E array[]; 
	  int front = 0; //these are the indices for first and last elements, these indices change
	  int last = 0;


	  public ArrayDeque() {  
	    array = (E[]) new Object[CAPACITY]; //creates array with the default capacity
	  }

	@Override
	public void addFirst(E element) throws FullQueueException {
		front=(front-1+CAPACITY)%CAPACITY; //changes the index value, decrements by 1 and gets the positive equivalent
		array[front]=element; //the front index now points to the new added element	
	}

	@Override
	public void addLast(E element) throws FullQueueException {
		array[last] = element; //the last thing in the array is the new element
		last = (last + 1) % CAPACITY;//moves the index up by 1
		
	    
	  }

	@Override
	public E removeFirst() throws EmptyQueueException {
		E element = array[front]; //the first thing in the array is element
	    array[front] = null; //front is changed to null, doesn't exist
	    front = (front + 1) % CAPACITY; //front is moved up by 1 pointing to the next thing
	    return element; //returns the first thing, element
	  }
	

	@Override
	public E removeLast() throws EmptyQueueException {
		last=(last-1)%CAPACITY; //moves the last index down by one
		E element=array[last]; //puts the new element at the last of array
		array[last]=null; //points last to null
		return element; //prints out the last element
		
	}
	

	@Override
	public E getFirst() throws EmptyQueueException {
		return array[front];
	}

	@Override
	public E getLast() throws EmptyQueueException {
		return array[last-1];
	}

	@Override
	public int size() {
		return ((last - front + CAPACITY) % CAPACITY); //always works for size, we never get a negative
	}

	@Override
	public boolean isEmpty() {
		return (array[front] == null); 
	}
	
	@Override
	/**
	 * the toString method works by taking out the first element, adding it to the string and then putting it back
	 */
	public String toString() {
		String toPrint="(";
		for(int i=0; i<size(); i++) {
		E a=removeFirst();
		toPrint+=a+",";
		addLast(a);
		}
		toPrint=toPrint.substring(0,toPrint.length()-1);
		toPrint+=")";
		return toPrint;
	}
	
	
	}


