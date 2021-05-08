/**CSCI2110
 * Lab 4: Excercise 2
 * Implementing from the List class and create the StudentList. There are addRecord,deleteRecord,displayMajor,displayFaculty,displayname
 * searchID and printList methods.
 * Linh Truong | B00708389 | Oct 12th
 */

public class StudentList {
	private List<Student> students;

	public StudentList() {
		students = new List<Student>();
	}
	//add the students in the record
	public void addRecord(Student s) {
			students.add(s);
	}
	
	//remove the students in the record
	public void deleteRecord(int ID) {
		Student s=students.first();
		while(s!=null) {
			if(s.getStudentID()==ID) {
				students.remove(s);
				s.getStudentID();
				printList(); //print the new list after the deleted ID is removed.
				System.out.println("The record that is delete from the Student list is: "+s);
			}
			s=students.next();	
		}
	}
	
	
	//Display students record who major a certain major
	public void displayMajors(String major) {
		Student s=students.first();
		while(s!=null) {
				if(s.getMajor().equals(major)) {
					s.getMajor();
					System.out.println(s);
				}	
				s=students.next();
		}
	}
			
	// Display records of all students belonging to a particular faculty.
	public void displayFaculty(String faculty) {
		Student s=students.first();
		while(s!=null) {
			if(s.getFaculty().equals(faculty)) {
				s.getFaculty();  
				System.out.println(s); 
			}	
			s=students.next(); //goes to the next student
		}
	}
	//Display records of all students belonging to a particular last name.
	public void displayName(String lName) {
		Student s=students.first();
		while(s!=null) {
			if(s.getLastName().equals(lName)) {
				s.getLastName();
				System.out.println(s); 
			}	
			s=students.next(); //goes to the next student
		}
	}
		
	//Search for a studen's record given an ID number
	public Student searchID(int ID) {
		Student s=students.first();
		while(s!=null) {
			if(s.getStudentID()==(ID)) {
				s.getStudentID();
				System.out.println(s); 
			}	
			s=students.next(); //goes to the next student 
		}
		return s;
	}
		
	 //print the Student List 
	public void printList() {
		Student s= students.first();
		while(s!=null) {
			System.out.println(s.getStudentID()+" " +s.getFirstName()+" "+s.getLastName() +" "+s.getEmail()+" "+s.getMajor()+" "+s.getFaculty());
			s = students.next();
		}
	}
} //end class
