/*CSCI2110
 * Lab 3: Excercise 1 (Point)
 * This is the main class, where we used the generic classes from the Point class. The user input 3 different lines. 
 * One line input two integers, second line input two double, and third line input Strings. 
 * Linh Truong B00708389 (Lab section B03)
 * September 25th,2019
 */


import java.util.Scanner;
public class PointTester{
  public static void main(String[] args){
	Scanner kb=new Scanner(System.in);
	int px1,py1;
	double px2,py2;
	String px3,py3;
	
	//user input for the first line
	px1=kb.nextInt();
	py1=kb.nextInt();
	
	//user input for the second line
	px2=kb.nextDouble();
	py2=kb.nextDouble();
	
	//user input for the third line
	px3=kb.next();
	py3=kb.next();
	
	//put the user input into each Points
    Point<Integer> point1 = new Point<Integer>(px1, py1);
    Point<Double> point2 = new Point<Double>(px2,py2);
    Point<String> point3 = new Point<String>(px3,py3);
    
    //output
    System.out.println(point1);
    System.out.println(point2);
    System.out.println(point3);
  } 
} //end class
