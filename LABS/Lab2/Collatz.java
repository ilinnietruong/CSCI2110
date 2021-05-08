/**CSCI2110
 * Linh Truong
 * B00708389
 * Lab 2: Collatx Sequence where  if the integer is even, n/2 , if it it is odd 3n+1
 * until it reaches to 1. The object is to find the longest sequence and which step.
 */
import java.util.*;
public class Collatz {
	public static void main(String[] args) {
    	Scanner kb=new Scanner(System.in);
    	long largeCount=0, index=0;
    	long input,num,startTime, endTime, executionTime;
    	while((input=kb.nextInt())!=0) { //program will end when user enter 0
        	startTime = System.currentTimeMillis(); //start the timer
    		for(long i=1; i<=input;i++) { //look at the inputs
    			num = i; //the number start with 1 until it reaches to the input
    			long count = 1; //count at one
    			while(num!=1) { //program will end when the number reaches to 1
    				count++;  //add 1 each time
    				if( num%2== 0) { //when the number is even
    					num = num/2;
    				}  
    				else if(num%2!= 0) { //when the number is NOT even
    					num = 3*num+1;
    				}
    			}

    			if(count > largeCount){ //when count is larger than the larger sequence
    				largeCount = count;	 //then the count becomes the largeCount
    				index= i; //which step that has the largest sequence
    			}
    		}
    		endTime = System.currentTimeMillis(); //end the time
    		executionTime = endTime - startTime;
            System.out.println(input+" "+index+ " "+ largeCount+" "+executionTime);
    	}
    }
} //end class
 