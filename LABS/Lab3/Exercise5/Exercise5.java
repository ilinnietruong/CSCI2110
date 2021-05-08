/* CSCI2110
 * Lab 3 : Exercise 5
 * This the main class. The object is to Print the Queue when you enter the owner name and ID number.
 * Linh Truong | B00708389 | Lab Section (B03)
 */

import java.util.*;

public class Exercise5{
	public static void main(String[] args){
		Scanner kb= new Scanner (System.in);
		GenericQueue<String> name = new GenericQueue<String>();
		GenericQueue<Integer> id = new GenericQueue<Integer>();
		String owner,input;
		int jobID;
		PrintQueue pq =new PrintQueue();
		
		
		System.out.print("type quit if you want to stop the program or type go to continue: ");
		input=kb.next();
		
		//program end when user input "quit".
		while(!(input).equals("quit")) {  
			owner=kb.next();
			jobID=kb.nextInt();
			System.out.print("Type quit if you want to stop the program or type go to continue: ");
			input=kb.next();
		
			//add owner and jobID in the qeueu
			pq.lpr(owner,jobID);		
		}	
		//basic test
		System.out.println("\nQueue of the owner and job ID:\n");
		pq.lpq();
		System.out.println();
	}
} //end class