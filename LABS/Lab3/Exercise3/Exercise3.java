/* CSCI2110
 * Lab 3 : Exercise 3
 * This the main class use. Print out the file name. I copied and paste from the instruction... and added some things.
 * Linh Truong | B00708389 | Lab Section (B03)
 */

import java.util.*;
import java.io.*;
public class Exercise3{
  public static void main(String[] args)throws IOException{
	 StudentRecord<StudentRecord> stack1= new StudentRecord <StudentRecord>();
    //TODO: Create stack1 to hold StudentRecord Objects
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the filename to read from: ");
    String filename = keyboard.nextLine();
    File file = new File(filename);
    Scanner inputFile = new Scanner(file);
    
    //reading the file 
    StringTokenizer token;
    while (inputFile.hasNext()){
      String line = inputFile.nextLine();
      token = new StringTokenizer(line, " ");
      String firstName = token.nextToken();
      String lastName = token.nextToken();
      String IDString = token.nextToken();
      //convert String IDString to an Integer Object IDNum
      Integer IDNum = Integer.valueOf(IDString);
      
      
      //push the firstName,lastName,IDNUm into stack1 and then push lastName into stack2.
      StudentRecord<StudentRecord> record= new StudentRecord <StudentRecord>(firstName,lastName,IDNum);
      stack1.push(record);
      inputFile.close();
      StudentRecord<String> stack2 =new StudentRecord<String>();
      for(int i=-1; i<stack1.size()+i; i++) {
      	stack1.pop();
      	stack2.push(lastName);
      }
      
      //display stack2 , last names.
      for(int i=1;i<stack2.size();i++) {
      	System.out.print(stack2);
      }      
    }
  } 
}//end class
