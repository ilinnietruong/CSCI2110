/*CSCI2110
 * Lab 3: Exercise 5
 * This Print Queue class is used for the main class where it print the jobs in the queue. 
 * Linh Truong  | B0070389 | Lab Section: B03
 * 
 */
public class PrintQueue {
	private GenericQueue job = new GenericQueue();
	
	//constructor
	public PrintQueue() {
	}
	
	//Enqueues a Job with the specified owner and jobId.
	public void  lpr(String owner, int jobId) {
		job.enqueue(owner);
		job.enqueue(jobId);	
	}
	
	//Prints all the entries in this Queue.
	public void lpq() {
		for(int i=0; i<job.size()+i; i++) {
			System.out.println(job.dequeue());
		}
	}
	
	//Removes the active Job at the front of the Queue if jobId matches, error message otherwise.
	public void lprm(int jobID) {
		if(job.equals(jobID)) {
			job.remove(jobID);	
		}
		else {
			System.out.print("ERROR");
		}
	}
	
	//Removes all Jobs from the Queue that have been submitted by the owner.
	public void lprmAll(String owner) {
		if(owner.equals(job)) {
			job.clear();
		}
		else {
			System.out.print("ERROR");
		}
	}
}

