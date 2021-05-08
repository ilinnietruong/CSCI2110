/*CSCI2110:
 * Lab 6: Exercise 4
 * Recursive where it print a certain amount of multiples integer
 * Linh Truong |B0070389
 */

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.print("Please enter a positive integer and the amount of the multiples of integer: ");
		int num=kb.nextInt();
		int mult=kb.nextInt();
		multiples(num,mult);
	}
	//recursive where it output the multiples of the integer by a certain amount
	 public static void multiples(int n,int m) {
		int count=1;
		if(m==0) {
			return; 
		 }
		 else {
			count++; //count the loops
			multiples(count*n,m-1); //multiply the integer by the count 
		 }		    
		 System.out.print(n+"\t");
 	}
}