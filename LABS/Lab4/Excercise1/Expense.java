/*CSCI2112
 * Lab 4: Exercise 1
 * This is the expense class given in the lab.
 * Linh Truong | B0070389 | Oct 12/19
 */


import java.text.DecimalFormat;
public class Expense
{
	private double amount;
	private String item;
	private String date;
	private static final DecimalFormat dollar = new DecimalFormat("0.00");
	
	public Expense(String date, String item, double amount)
	{
		this.date = date;
		this.item = item;
		this.amount = amount;
	}
	public String toString()
	{
		return date + "\t" + item + "\t\t" + dollar.format(amount) + "\n";
	}
	public boolean equals(Expense other)
	{
		return (item.equals(other.getItem())&&date.equals(other.getDate())&&amount==other.getAmount());
		
	}
	public String getItem()
	{
		return item;
	}
	public String getDate()
	{
		return date;
	}
	public double getAmount()
	{
		return amount;
	}
	
	
}