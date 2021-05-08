/* CSCI2110
 * Lab 3 : Exercise 3
 * This the StudentRecord class use for Exercise3. Used the queue to add first name,last name and the id.
 * Linh Truong | B00708389 | Lab Section (B03)
 * 
 */

import java.util.ArrayList;

public class StudentRecord<T>{	  
		private ArrayList<T> StudentRecord =new ArrayList<T>() ;
		private String firstName,lastName;
		private int BannerID;
		
		//constructor
		public  StudentRecord (String f, String l, int id) {
			firstName= f;
			lastName= l;
			BannerID= id;
		}
		
		public StudentRecord() {
		}
		//setters
		public void setFirtName(String f) {
			firstName=f;
		}
		
		public void setLastName(String l) {
			lastName=l;
		}
		
		public void setID(int id) {
			BannerID=id;
		}
		
		//getters	
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public int getID() {
			return BannerID;
		}
		
		
		//size of the stack 
		public int size() { 
		    return StudentRecord.size(); 
		}
		
		//push the element to the bottom of stack
		public void push(T element) {
			StudentRecord.add(0,element);
		}
		
		//remove from the top of the stack
		public T pop() {
			return StudentRecord.remove(0);	 
		}
		
		//return the top of the list
		public T peek() {
			return StudentRecord.get(StudentRecord.size()-1);
		}
		
		//when the stack is empty
		public boolean isEmpty() {
			return size()==-1;
		}
	} //end class
