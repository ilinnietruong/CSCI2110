/* CSCI2110
 * Lab 3 : Exercise 4
 * This the GenericQueue. The purpose is to create a generic queue from using ArrayList.
 * Linh Truong | B00708389 | Lab Section (B03)
 */

import java.util.ArrayList;

public class GenericQueue<T>{
	private ArrayList<T> queue = new ArrayList<T>();
	int cursor; //used for the first and the next methods.

	//constructor
	public GenericQueue(){
	}
	
	//the size of the queue
	public int size() {
		return queue.size();
	}
	
	//get the head from the queue
	public T peek() {
		return queue.get(0);
	}
	
	//remove the head and return the head
	public T dequeue() {
		return queue.remove(queue.size()-1);
	}
	
	//add the element at the back
	public void enqueue (T element) {
		queue.add(0,element);
	}
	
	//check to see if the queue is empty
	public boolean isEmpty() {
		return queue.size()==0;
	}
	
	//cler the queue
	public void clear() {
		queue.clear();
	}
	
	//Return the position of the specified item and -1 if not found.
	public int positionOf(T item) {
		for(int i=0; i<queue.size(); i++) {
			if (queue.get(i)== item) 
				return i;
			}
			return -1;		
		}
	
	//Remove the first occurrence (from front) of specified item
	public void remove(T item) {
		for(int i=0; i< queue.size()-1;i++) {
			if (queue.equals(item)) {
				for(int k=1; k< queue.size(); k++) {
					queue.remove(k);
				}
			}
		}
	}
	
	//Return the first item in the Queue(front), null if Queue is empty
	public  T first() {
		if(queue.size()>0) {
			cursor=0;
			return queue.get(cursor);
		}
		return null;
	}
	
	//Return the next item in the Queue relative to the previous call to first or next. Return null if end of Queue is reached.
	public T next() {
		if(queue.size()>0) {
			for(int i=0; i<queue.size()-1; i++) {
				cursor=i;
				return queue.get(cursor+1);		
			}
		}
		return null;	
	}
}
		
