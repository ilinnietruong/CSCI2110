/*CSCI2110
 * Lab 3: Excercise 2 (Generic Stack)
 * This is the main class which we used from GenericStack class. User input strings and integers in each of their assigned stacks.
 * Linh Truong B00708389 (Lab section B03)
 * September 25th,2019
 */

import java.util.Scanner;

public class GenericStackTest{
	public static void main(String[] args){
		Scanner kb=new Scanner (System.in);
		String word;
		int num;
		
		//two of the stacks
		GenericStack<String> stack1 = new GenericStack<String>();
		GenericStack<Integer> stack2 = new GenericStack<Integer>();
		
		//program end when user input "quit".
		while(!(word=kb.next()).equals("quit")) {  
				stack1.push(word);
		}
		
		//program end when the user input "-1"
		while((num=kb.nextInt())!=-1){
			stack2.push(num);
		}
		
		//print out the stack 1
		System.out.println("String Stack Contents:");
		for(int i=-1;i<stack1.size()+i;i++){
			System.out.println(stack1.pop());
		}
		
		//new line
		System.out.println();
		
		//print out the stack2
		System.out.println("Integer Stack Contents:");
		for(int i=-1;i<stack2.size()+i;i--) {
			System.out.println(stack2.pop());
		}
	}
}
