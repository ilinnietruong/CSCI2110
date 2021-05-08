/**CSCI2110
 * Lab 4: Excercise 2
 * The Student class. Getting data from the student list. There are getters methods, toString and equals.
 * Linh Truong | B00708389 | Oct 12th
 */

public class Student {
	private int StudentID;
	private String FirstName,LastName,Email,Major,Faculty;
	
	//constructor
	public Student(int id, String f, String l, String e, String m, String fa ){
		StudentID=id;
		FirstName=f;
		LastName=l;
		Email=e;
		Major=m;
		Faculty=fa;	
	}
	
	//getters
	public int getStudentID() {
		return StudentID;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public String getMajor() {
		return Major;
	}
	
	public String getFaculty() {
		return Faculty;
	}
	
	//toString
	public String toString() {
		return StudentID+"\t"+FirstName+"\t"+LastName+"\t"+Email+"\t"+Major+"\t"+Faculty;
	}
	
	//to see if record equal to another.
	public boolean equals(Student other) {
		return (StudentID==other.getStudentID() && FirstName.equals(other.getFirstName()) && LastName.equals(other.getLastName())
				&& Email.equals(other.getEmail()) && Major.equals(other.getMajor()) && Faculty.equals(other.getFaculty()));
	}
}