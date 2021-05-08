/**CSCI2110
 * Lab 5:Exercise 0A
 * Main Demo 
 * Linh Truong |B00708389
 */

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class EmployeeListDemo {
	public static void main(String[] args) throws IOException{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.nextLine();
		File file = new File(filename);
		EmployeeList record = new EmployeeList();
		int id;
		String fn,ln,email,department;
		Employee emp=null;	
		
		try {

			Scanner inputFile = new Scanner(file);
			while (inputFile.hasNextLine()) {
						
				String line = inputFile.nextLine();
				StringTokenizer token = new StringTokenizer(line, " ");

				while (token.hasMoreTokens()) {
					id = Integer.parseInt(token.nextToken());
					fn = token.nextToken();
					ln = token.nextToken();
					email=token.nextToken();
					department=token.nextToken(); //NOTE: line 4 in employees.txt, for department, I un-spaced Research & Development into "Research&Development".

						
					emp= new Employee (id,fn,ln,email,department);
					record.addEmployee(emp);
				}
			} 
			inputFile.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
	}
		
		
	//checking to see if the addingEmployee method is working properly from the employee list.
	System.out.println("\nList of all the employees ordered from the lowest number ID to greatest number ID: ");
	record.printEmployees();
	
	//Display the list after a certain ID is removed.
	System.out.println();
	record.deleteEmployee(30002);
	
	//Search for a certain ID in the employees.txt
	record.searchID(22346);
	}
}//end class
