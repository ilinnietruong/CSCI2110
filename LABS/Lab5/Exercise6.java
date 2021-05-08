/*CSCI2110:
 * Lab 6: Exercise 6
 * Recursive where it add the squared of sums
 * Linh Truong |B0070389
 */

import java.util.Scanner;
public class Exercise6 {
	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int num=kb.nextInt();
		System.out.print(squares(num));
	}
	
	public static int squares(int n) {
		if(n==0) {
			return 0;
		}
		else { //return the sum of the squares
			return(n*n+squares(n-1));
		}
	}
}
