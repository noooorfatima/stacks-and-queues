package stacksqueues;
/**
 * 
 * @author nfatima
 *this class tests the methods etc
 */
public class Main {

	public static void main(String[] args) {
		TwoStacksQueue<Integer> testStack = new TwoStacksQueue<Integer>(5); //making a new stack to test the twostacksqueue
		/**
		 * calling to check the two stacks class
		 */
		testStack.add(3); //adding stuff into stacks
		testStack.add(2);
		testStack.add(1);
		System.out.println(testStack); //prints the stack, should be FIFO
		System.out.println(testStack.size()); //gets size
		System.out.println(testStack.remove());//removes the last added element and returns
		System.out.println(testStack); //gives the new stack
		System.out.println(testStack.size());
		System.out.println(testStack.element());//gets the element at the top
		System.out.println(testStack.isEmpty());
		System.out.println("!!End of twoStack test!! ");
		
		/**
		 * checking the array Deque methods
		 */
		ArrayDeque<Integer> testDeque = new ArrayDeque<Integer>();
		testDeque.addFirst(3); //adding elements to the arrayDeque
		testDeque.addFirst(2); //adding first
		testDeque.addFirst(1);
		testDeque.addLast(4); //adding last
		System.out.println(testDeque);
		testDeque.removeFirst(); //removing the first
		System.out.println(testDeque);
		System.out.println(testDeque.removeLast()); //removing the last and printing it
		System.out.println(testDeque);
		System.out.println(testDeque.size());
		System.out.println(testDeque.isEmpty());
		System.out.println(testDeque.getFirst());//prints the first element
		System.out.println(testDeque.getLast());//prints the last element
		System.out.println("!!End of Deque test!! ");
		
		/**
		 * checking newStack methods
		 */
		NewStack newStack = new NewStack(5); 
		newStack.push(1); 
		newStack.push(2);
		newStack.push(3);
		System.out.println(newStack);
		System.out.println(newStack.minElement());
		System.out.println(newStack.size());
		System.out.println(newStack.pop());
		System.out.println(" !!End of newStack test!!  ");
		
		
		
		
		
		
		
	}
	
}
