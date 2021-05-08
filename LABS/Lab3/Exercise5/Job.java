/* CSCI2110
 * Lab 3 : Exercise 5
 * This the job class use for the the Print Queue. There is a constructor, String getOwner,
 * int getJobID and String getOwner. I copied and paste from the lab3 instruction.
 * Linh Truong | B00708389 | Lab Section (B03)
 * 
 */

public class Job{
	private String owner;
	private int jobId;
	
	//constructor
	public Job(String o, int j){
		owner = o;
		jobId = j;
	}
	
	//return the string owner
	public String getOwner(){
		return owner;
	}
	
	//return the int ID
	public int getJobId(){
		return jobId;
	}
}//end class