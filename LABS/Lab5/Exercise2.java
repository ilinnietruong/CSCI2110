/*CSCI2110:
 * LAB6:Exercise 2. Recursive , where we want to count number backward.
 * Linh Truong |B0070389
 */

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int num=kb.nextInt();
		countDown(num);
	}
	
	//countDown class
	public static void countDown(int n) {
		if (n == 0) {
			System.out.println("BlastOff!");
		}
		else { //when n>0 , countDown by n-1
		    System.out.print(n+"\t");
		    countDown(n-1);
		}	    
	}
}