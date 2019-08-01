package stacksqueues;
/**
 * 
 * @author nfatima
 *this class is a simple stack data storage, also gives the min element in the stack
 */
public class NewStack {
	private ArrayStack<Integer> stack; //the main stack we will need, it stores the ints
	private ArrayStack<Integer> stackMin; //this keeps track of the min element in the stack
	private ArrayStack<Integer> stackPrint; //this helps in printing using to string
	int size;
	
	public NewStack(int size) {
		this.size=size;
		this.stack =new ArrayStack<Integer>(size);
		this.stackMin =new ArrayStack<Integer>(size);
		this.stackPrint =new ArrayStack<Integer>(size);
		
		
	
	}
	public void push(int i){ //pushes into two stacks, pushes everything in the main stack but only min ints in other stack 
		stack.push(i);
		if(stackMin.isEmpty() || i<stackMin.top())
		stackMin.push(i);
	}
	/**
	 * below are all the general methods for a stack
	 * 
	 */
	public int pop(){
		return stack.pop();	
	}
	public int top() {
		return stack.top();
		
	}
	
	public int size() {
		return stack.size();
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	public int minElement() { //returns minelement in the data
		return stackMin.top();
		
	}
	@Override
		public String toString() {  
			while (! stack.isEmpty()) {     //flipping the stack into another so its printed in the right order
				stackPrint.push(stack.pop());
			}
			String toPrint="(";
			while(! stackPrint.isEmpty()){
				toPrint+=stackPrint.top().toString()+","; //uses stack B to print the stack out
				stack.push(stackPrint.pop()); //putting elements back into a
			}
			toPrint=toPrint.substring(0,toPrint.length()-1);
			toPrint+=")";
			return toPrint;
		}
		
	}
	
	
	

