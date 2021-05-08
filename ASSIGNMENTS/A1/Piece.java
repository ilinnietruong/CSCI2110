/**CSCI2110
 * Assignment 1
 * This is the piece class where we have constructor ,setters, getters and toString() methods.
 * Linh Truong | B00708389 
 */

/**
 * @author Linnie
 *
 */
public class Piece {
	private String name, colour;
	private int xpos,ypos; // position on the grid


	//constructor
	public Piece(String n,String c,int x, int y) {
		name=n;
		colour=c;
		xpos=x;
		ypos=y;
	}
	
	//getters	
	public String getName() {
		return name;
	}
	
	public String getColour() {
		return colour;
	}
	
	public int getX() {
		return xpos;
	}
	
	public int getY() {
		return ypos;
	}
	
	//setters
	public void setName(String n) {
		name=n;
	}
	
	public void setColour(String c) {
		colour=c;
	}
	
	public void setxPos(int x) {
		xpos=x;
	}
	
	public void setyPos(int y) {
		ypos=y;
	}
	
	//display the Piece Object's field
	public String toString() {
		return name+" "+colour+" ";
	
	}
}	
