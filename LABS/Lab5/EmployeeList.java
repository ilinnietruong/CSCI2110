/**CSCI2110:
 * Lab6: Excercise 0
 * EmployeeList class. It have addEmployee, deleteEmployee,searchID.
 * Linh Truong | B00708389 
 */

public class EmployeeList {
	private OrderedList <Employee> employee;
	
	public EmployeeList () {
		employee= new OrderedList<Employee>();
	}
	
	//add employee
	public void addEmployee(Employee e) {
		employee.insert(e);
	}
	
	//delete an employee from their ID
	public void deleteEmployee(int ID) {
		Employee e=employee.first();
		int position=0;
		while(e!=null) {
			if(e.getEmployeeID()==ID) {
				employee.remove(e);
				System.out.println("ID: "+e.getEmployeeID()+" was remove."+" Deleted : "+e.getFirstName()+"\t"+e.getLastName()+"\t"+e.getEmail()+"\t"+e.getDepartment());
				System.out.println("\nList of the remaining employees after ID: "+e.getEmployeeID()+" is removed: " );
				printEmployees();
			}
			e=employee.next();
		}
	}
	
	//Search a certain  ID from the employees.txt.  It will output the position in the employees.txt and the information 
	public Employee searchID(int ID) {
		Employee e=employee.first();
		while(e!=null) {
			int pos=employee.binarySearch(e);
			if(e.getEmployeeID()==ID) {
				System.out.println("\nSearch for ID:"+e.getEmployeeID()+" in position "+(pos+1));
				System.out.println(e.getEmployeeID()+"\t"+e.getFirstName()+"\t"+e.getLastName()+"\t"+e.getEmail()+"\t"+e.getDepartment());
			}
			e=employee.next();
		}
		return e;
	}
	
	//display the employees information
	public void printEmployees() {
		Employee e = employee.first();
		while(e!=null) {
			System.out.println(e.getEmployeeID()+"\t"+e.getFirstName()+"\t"+e.getLastName()+"\t"+e.getEmail()+"\t"+e.getDepartment());								
			e=employee.next();
		}
	}
}



