/**
 * 
 */

/**
 * @author Linnie
 *
 */
public class FastPiece extends Piece {

	public FastPiece(String na, String c, int x, int y) {
		super(na, c, x, y);
	}
	
	public boolean move(String direction, int n) {
		String s1= "left";
		String s2="right";
	
		//when the direction is left
		if (direction.equals(s1.toLowerCase()) || direction.equals(s1.toUpperCase())){
			if(super.getX()+n > 1) {
				super.setxPos(super.getX()- n);
				return true;
			}
		}
		//when the direction is right
		if(direction.equals(s1.toLowerCase()) || direction.equals(s1.toUpperCase())){
			if(super.getX()+n <8) {
				super.setxPos(super.getX() +n);
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
