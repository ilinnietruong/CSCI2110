
/**CSCI2112
 * Lab 2: Excercise 1 (Nth Prime)
 * Calculate the nth prime and print information about the running time.
 * Linh Truong (B00708389)
 * 
 */
import java.util.*;
public class Prime{
  public static void main(String[] args){
	  Scanner kb=new Scanner(System.in);
	  long p, count=0 , startTime, endTime, executionTime;
	  startTime=System.currentTimeMillis();
	  while((p=kb.nextLong())!=0 ){ //loop end when the user input "0".
		  endTime=System.currentTimeMillis();
		  executionTime=endTime-startTime;
		  System.out.println(p+" "+nthPrime(p)+" "+executionTime);
	  }
  }
  	
  public static long nthPrime(long p){
	  long num=1,count=0,i=0;
	  while(p>count){  //the loop will end when the count is larger than the nthPrime
		  num=num+1; //the prime number - starting at num=2
		  for(i=2;i<=num;i++){
			  if(num%i==0){ //if it is not prime
				  break;  //break the program 
			  }
		  }
		  if(i==num) { //if the iteration matches up to the prime number , then count each time. .
			  count=count+1; //add the count each time
		  }	  
	  }
	  return num;  //return the prime number from the nth prime.
  	}
}//end class