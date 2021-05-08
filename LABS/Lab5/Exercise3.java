/*CSCI2110:
 * Lab5: Exercise 3
 * A recursive where even number count backwards only with even numbers
 * Linh Truong B00708389
 */

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		
		System.out.print("Please enter an  even integer: ");
		int evennum=kb.nextInt();
		countDown(evennum);
		
		System.out.print("Please enter an odd integer: ");
		int oddnum=kb.nextInt();
		countDown(oddnum);
	}
	
	public static void countDown(int n) {
		if (n == 0 || n<0) { //n==0 stops FOR even integers and n<0 stops only FOR odd integers
			System.out.println("BlastOff!");
		}
		else { 
			if(n%2==1) { 
				System.out.print(n+"\t");
				countDown(n-2);
			}
			else  {  //when n is even
				System.out.print(n+"\t");
				countDown(n-2);		
			}
		}
	}
}
		    	
  
	