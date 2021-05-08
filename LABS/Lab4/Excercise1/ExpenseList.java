/*CSCI2112
 * Lab 4: Exercise 1
 * This is the ExpenseList class given in the lab. Finished the avgExpense,totalExpense and amountSpentOn
 * Linh Truong | B0070389 | Oct 12/19
 */

public class ExpenseList
{
	private List<Expense> expenses;
	
	public ExpenseList()
	{
		expenses = new List<Expense>();
	}
	
	public void add(Expense exp)
	{
		expenses.add(exp);
	}
	
	public boolean isEmpty()
	{
		return expenses.isEmpty();
	}
	
	public boolean contains(Expense exp)
	{
		return expenses.contains(exp);
	}
	
	public Expense first()
	{
		return expenses.first();
	}
	
	public Expense next()
	{
		return expenses.next();
	}
	public void enumerate()
	{
		expenses.enumerate();
	}
	
	
	public double maxExpense()
	{
		double max =0.0, amt;
		Expense exp = expenses.first();
		while (exp!=null)
		{
			amt = exp.getAmount();
			if (amt>max)
				max = amt;
			exp = expenses.next();
		}
		return max;
	}
	
	public double minExpense()
	{
		double min =Double.MAX_VALUE, amt;
		Expense exp = expenses.first();
		if (exp==null) return 0.0;
		else
		{
		
			while (exp!=null)
			{
				amt = exp.getAmount();
				if (amt<min)
					min = amt;
				exp = expenses.next();
			}
		}
		return min;
	}
	
	//find the average expense spent in September
	public double avgExpense() {
		double total=0;
		Expense exp= expenses.first(); //get the first expense from the list
		while(exp!=null) { //loop end when there's no expenses in the list
			total=total+exp.getAmount(); //add the total and amount together
			exp=expenses.next(); //move on to the next expense
		}
		if(expenses.size()!=0) {   //when the size is not 0, then calculate return divide by the total size of expenses and then reutrn.
			return total/expenses.size();
		}
        return 0.0;
	}
	
	//calculate the total expense
	public double totalExpense(){
        double total=0.0;
        Expense exp=expenses.first();
        while(exp!=null){
        	total+=exp.getAmount();  //add all the expense together
        	exp=expenses.next();
        }
		
		return total;   //return the total expense
	}
	
	//find a certain item in list on how much they spent
	public double amountSpentOn(String expItem){
        double amount=0;
        Expense exp=expenses.first(); 
        while(exp!=null) {
        	if(exp.getItem().equals(expItem)) {		//fetch the items in a certain category, then add everything up 
        		amount+=exp.getAmount(); //total amount
        	}
        	exp=expenses.next();
        }
        if(expenses.size()!=0) {
        	return amount;  //return the amount
        }
        else { 
        	return 0.0;
        }
	}	
}
