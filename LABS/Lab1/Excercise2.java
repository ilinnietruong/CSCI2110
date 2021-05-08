//CSCI2110: Excercise 2. Linh Truong  B00708389 - a circle class where to see the two circle contains and touches. also to display radius 


import java.util.Scanner;

public class Excercise2 {

	private double xpos,ypos,radius; //instance variables
	
	public  Excercise2 (double xpos,double ypos,double radius){ //constructor
			this.xpos=xpos;
			this.ypos=ypos;
			this.radius=radius;
	}
	//setters
	public void setX(double xpos) {
		this.xpos=xpos;
	}
	public void setY(double ypos) {
		this.ypos=ypos;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	//getters
	public double getX() {
		return xpos;
	}
	public double getY() {
		return ypos;
	}
	public double getRadius() {
		return radius;
	}
	//calculate the area
	public double getArea() {
		return Math.PI*radius*radius;
	}
	//calculate the circumference
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	//check to see if the circle contains one another
	public boolean contains(double x, double y){  
	      return (y<=(radius+this.ypos)&&x<=(radius+this.xpos));
	}
    public boolean contains(Excercise2 circle){ 
	      double distance = Math.sqrt(Math.pow(circle.getX()-xpos,2)+Math.pow(circle.getY()-ypos,2));
	      return (distance<=(radius-circle.getRadius()));
	}
    
	 //check to see if the circle touches each other
    public boolean touches(Excercise2 circle){ 
	      double distance = Math.sqrt(Math.pow(circle.getX()-xpos,2)+Math.pow(circle.getY()-ypos,2));
	      return (distance >= (radius+circle.getRadius()));
	}
	   
	   //display string
    public String toString(){
    	return "Circle's centre is: "+xpos+","+ypos+"\nIt's radius is: "+radius;
	}   
//program run
	public static void main(String[] args) {
		Scanner kb=new Scanner (System.in);
		
		double input,xpos,xpos2,ypos,ypos2,radius,radius2;
		int count=0;
		input=kb.nextDouble();
			while(true) { //loop until false
				if(input!=count) { //count the loop until it reaches the amount the user input
				xpos=kb.nextDouble();
				ypos=kb.nextDouble();
				radius=kb.nextDouble();
				xpos2=kb.nextDouble();
				ypos2=kb.nextDouble();
				radius2=kb.nextDouble();
				
				Excercise2 c1 = new Excercise2(xpos, ypos, radius);
				Excercise2 c2 = new Excercise2(xpos2, ypos2, radius2);
				//output
				System.out.println("\nThe first "+ c1);
				System.out.println("\nThe second "+ c2);
				System.out.println();
				System.out.print("The 'contains' method returns: "+ c1.contains(c2));
				System.out.println();
				System.out.print("The 'touches' method returns: " + c1.touches(c2));
				System.out.println();

				count++;
			}
			else { //otherwise, program end
				break;
			}
		}		
	}
}


