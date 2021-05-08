/*CSCI2110
 * Lab 3: Excercise 2 (Generic Stack)
 * This is the GenericStack class, where we used generic classes. The purpose of this exercise is to create a generic stack
 * by using ArrayList. There are size(), push(T element), peek(), pop() and isEmpty() methods. 
 * Linh Truong B00708389 (Lab section B03)
 * September 25th,2019
 */


import java.util.ArrayList;
	  
public class GenericStack <T> {
	private ArrayList<T> stack =new ArrayList<T>() ;
	  
	//size of the stack 
	public int size() { 
	    return stack.size(); 
	}
	
	//push the element to the bottom of stack
	public void push(T element) {
		stack.add(0,element);
	}
	
	//remove from the top of the stack
	public T pop() {
		return stack.remove(0);	 
	}
	
	//return the top of the list
	public T peek() {
		return stack.get(stack.size()-1);
	}
	
	//when the stack is empty
	public boolean isEmpty() {
		return size()==-1;
	}
}

