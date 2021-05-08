/* CSCI2110
 * Lab 3 : Exercise 5
 * This the main class. The purpose from this main class is similar to Exercise 2. Output the String queue nd 
 * Integer queue.
 * Linh Truong | B00708389 | Lab Section (B03)
 * 
 */


import java.util.Scanner;

public class GenericQueueTest{
	public static void main(String[] args){
		Scanner kb=new Scanner (System.in);
		String word;
		int num;
		
		//two of the Queues
		GenericQueue<String> queue1 = new GenericQueue<String>();
		GenericQueue<Integer> queue2 = new GenericQueue<Integer>();
		
		//program end when user input "quit".
		while(!(word=kb.next()).equals("quit")) {  
				queue1.enqueue(word);
		}
		
		//program end when the user input "-1"
		while((num=kb.nextInt())!=-1){
			queue2.enqueue(num);
		}
		
		//print out the queue 1
		System.out.println("String Queue Contents:");
		for(int i=0;i<queue1.size()+1;i++){
			System.out.println(queue1.dequeue());
		}
		
		//new line
		System.out.println();
		
		//print out the stack2
		System.out.println("Integer Queue Contents:");
		for(int i=0;i<queue2.size()+i;i--) {
			System.out.println(queue2.dequeue());
		}
	}
}
