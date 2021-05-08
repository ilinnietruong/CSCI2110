/*CSCI2110
 * Lab 3: Excercise 1 (Point)
 * This is the Point class, where we used generic classes. There are get and set methods, and a toString method.
 * Linh Truong B00708389 (Lab section B03)
 * September 25th,2019
 */

public class Point<P> {
	private P xpos,ypos;
	
	//constructor
	public Point(P x, P y) {
		xpos=x;
		ypos=y;
	}
	
	//set methods
	public void setxPos(P x) {
		xpos=x;
	}
		
	public void setyPos(P y) {
		ypos=y;
	}
	
	//get methods
	public P getxPos() {
		return xpos;
	}
	
	public P getyPos() {
		return ypos;
	}
	
} //end class
