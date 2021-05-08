/*CSCI2110:
 * Lab 6: Exercise 6
 * Recursive where it prints the hanoi tower
 * Linh Truong |B0070389
 */


import java.util.Scanner;


public class Exercise7 {
	public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.print("Please enter an integer: ");
	int num=kb.nextInt();
	solve(num,1,3,2);


	}
	
	
	public static long solve(int n,int start,int end,int tmp) {
		int count=1;
		if(n>0) {
			solve(n-1,start,end,tmp);
			count++;
			System.out.println("Move disc "+"from peg "+start+"to peg "+tmp);
			return solve(n-1,tmp,end,start);
		}
		return 0;
	}
}
