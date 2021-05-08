/**
 * 
 */

/**
 * @author Linnie
 *
 */
public class SlowPiece extends Piece{
	public SlowPiece(String na, String c, int x, int y) {
		super(na, c, x, y);
	}
	
	public boolean move(String direction) {
		String s1= "left";
		String s2="right";
	
		//when the direction is left
		if (direction.equals(s1.toLowerCase()) || direction.equals(s1.toUpperCase())){
			if(super.getX() > 0) { //x position is greater than 0
				super.setxPos(super.getX()-1); //subtract one
				return true;
			}
		}
		
		//when the direction is right
		if(direction.equals(s1.toLowerCase()) || direction.equals(s1.toUpperCase())){
			if(super.getX()<=6) {
				super.setxPos(super.getX()+1);
				return true;
			}
		}
		return false;
		}
	
	@Override
	public String toString() {
		String na="", c="";
		return  " "+na+" "+c;
		
	}
	
}


