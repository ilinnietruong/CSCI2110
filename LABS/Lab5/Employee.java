/**CSCI2110
 * Lab 5:Exercise 0A
 * This is the Employee class, where it use comparable to compare other integers.
 * Linh Truong |B00708389
 */

public class Employee implements Comparable<Employee> {
	private int EmployeeID;
	private String FirstName,LastName,Email,Department;
	
	//constructor
	public Employee(int EmployeeID, String FirstName, String LastName, String Email,String Department) {
		this.EmployeeID=EmployeeID;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Email=Email;
		this.Department=Department;	
	}
	
	//getters
	public int getEmployeeID() {
		return EmployeeID;
	}
	
	public String getFirstName(){
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public String getDepartment() {
		return Department;
	}
	
	//equal
	public boolean equals(Employee other) {
		return (EmployeeID==other.getEmployeeID() && FirstName.equals(other.getFirstName()) && LastName.equals(other.getLastName())
				&& Email.equals(other.getEmail()) && Department.equals(other.getDepartment()));
	}
	
	//compareTo
	@Override
	public int compareTo(Employee e) {
		return this.EmployeeID-e.getEmployeeID();
	}
	
}
