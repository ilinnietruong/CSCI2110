//CSCI2110: Excercise 1. Linh Truong  B00708389 - a rectangle class where to see the two rectangles contains and touches.

import java.util.Scanner;
public class Excercise1 {
	
	private double xpos,ypos,width,height; //instance variables
	
	//constructors
	public Excercise1() {		
	}
	public Excercise1(double xpos,double ypos,double width, double height){
		this.xpos=xpos;
		this.ypos=ypos;
		this.width=width;
		this.height=height;		
	}
	//setter methods
	public void setX(double xpos) {
		this.xpos=xpos;
	}
	public void setY(double ypos) {
		this.ypos=ypos;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	//getter methods
	public double getX() {
		return xpos;
	}
	public double getY() {
		return ypos;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	//to see if the rectangle contain the other rectangle
	public boolean contains(double px, double py){
		return (px>xpos && px<xpos+width && py>ypos && py< ypos+height);
		}
		
	public boolean contains(Excercise1 rect){
		return(this.contains(rect.getX(),rect.getY())&& this.contains(rect.getX() + rect.getWidth(), rect.getY()+rect.getHeight()));
	}
	
		//check to see rectangles touches one another
	public boolean touches (double px, double py) {
		   return (px < xpos + width && ypos + height > py && xpos + width > px && ypos < py + height );
	}
	private boolean touches (Excercise1 rect) {
	   return(this.touches(rect.getWidth(),rect.getHeight()));
	}
	
	//string method
	public String toString(){
		return "Rectangle's top corner is: "+xpos+","+ypos+"\nIt's width is: "+width+"\nIt's height is: "+height;
	}
	
	
	public static void main(String[] args) {
		Scanner kb=new Scanner (System.in);
	
		double input,xpos,xpos2,ypos,ypos2,width,width2,height,height2;
		int count=0; 
		input=kb.nextDouble();
		
		while(true) {
			if(input!=count) { //loop until reaches to the amount the user want. it will keep counting the loops until it reaches the amount 
			xpos=kb.nextDouble();
			ypos=kb.nextDouble();
			width=kb.nextDouble();
			height=kb.nextDouble();
			xpos2=kb.nextDouble();
			ypos2=kb.nextDouble();
			width2=kb.nextDouble();
			height2=kb.nextDouble();
			
			Excercise1 rect1 = new Excercise1(xpos, ypos, width, height);
			Excercise1 rect2 = new Excercise1(xpos2, ypos2, width2, height2);
			System.out.println("\nThe first "+ rect1);
			System.out.println("\nThe second "+ rect2);
			System.out.println();
			System.out.print("The contains method returns: "+ rect1.contains(rect2));
			System.out.println();
			System.out.print("The touches method returns: " + rect1.touches(rect2));
			System.out.println();
			
			count++;
			}
			else { //otherwise, end the program
				break;
			}
		}		
	}
}
