/*CSCI2110:
 * Lab 6: Exercise 5
 * Recursive where it print the integers vertically
 * Linh Truong |B0070389
 */

import java.util.Scanner;
public class Exercise5 {
	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int num=kb.nextInt();
		writeVertical(num);
	}
	//recursive to output vertical instead
	public static void writeVertical(int n) {
		if(n==0) {
			return;
		}
		else {
			writeVertical(n-1);
			System.out.println(n);
		}
	}
}
