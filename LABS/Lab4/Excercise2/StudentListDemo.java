/**CSCI2110
 * Lab 4: Excercise 2
 * This is the StudentList Demo class. We are going to test if the Students record is added in the list(list) by printing the list,
 * check to see if the ID is removed, display  the student records from certain majors,faculty, and last name , and search ID.
 * Linh Truong | B0070389 | Oct 13th
 */

import java.util.Scanner;
import java.io.*;
	
public class StudentListDemo {
	public static void main(String[] args) throws IOException{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.nextLine();
		File file = new File(filename);
		StudentList record = new StudentList();
		int id;
		String fn,ln,email,major,fac;
		Student studentRecord=null;	
		try {
			Scanner inputFile = new Scanner(file);
			while (inputFile.hasNextLine()) {
				String line = inputFile.nextLine();
				Scanner spacer = new Scanner(line);
				spacer.useDelimiter(" ");
				while (spacer.hasNext()) {
					id = spacer.nextInt();
					fn = spacer.next();
					ln = spacer.next();
					email= spacer.next();
					major=spacer.next();
					fac=spacer.next();
					studentRecord= new Student (id, fn,ln,email,major,fac);
					record.addRecord(studentRecord);
				}
			} 
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//Display the whole student list from the file.
		System.out.println("\nThe Student List contains the following entries: ");
		record.printList();
		System.out.println();//new line
			
		//Delete a record from the student list
		System.out.println("Delete id=200128, the new record is:");
		int idNum=200128;
		record.deleteRecord(idNum);
		System.out.println();
			
		//Fetch the student records who major,Music, and list the records
		System.out.println("Display students who is majoring Music: ");
		record.displayMajors("Music");
		System.out.println();
			
		//Fetch the student records who is in a faculty,Science 
		System.out.println("Display students who is in the faculty of Science: ");
		record.displayFaculty("Science");
		System.out.println();
			
		//fetch the student record who last name is "Williams".
		System.out.println("Display the student who last name is Williams: ");
		record.displayName("Williams");
		System.out.println();
			
		//Searching an ID from the student Record, 200121
		idNum=200121;
		System.out.println("Display student ID: 200121");
		record.searchID(idNum);
	}
}//end class