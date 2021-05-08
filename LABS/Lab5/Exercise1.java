
public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("The factoriral is :"+factorial(4));
		System.out.println("The fibonacci is: "+fibonacci(4));
		System.out.println("The power is: "+power(10,4));

	}
	public static int factorial(int n) {
		if(n==0)
			return 1;
		if(n>0)
			return (n*factorial(n-1));
		return n;
	}
	
	public static int fibonacci(int n) {
		if (n==0)
			return 0;
		else if(n==1)
			return 1;	
		else if(n>1)
			return fibonacci(n-1)+fibonacci(n-2);
		return n;
	}
	
	public static int power(int x, int n) {
		if(n==0)
			return 1;
		
		if(n>0) 
			return power(x,n-1)*x;
		return x;
	}	
}
