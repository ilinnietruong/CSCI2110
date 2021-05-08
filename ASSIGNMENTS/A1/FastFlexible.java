/**
 * 
 */

/**
 * @author Linnie
 *
 */
public class FastFlexible extends FastPiece {

	public FastFlexible(String na, String c, int x, int y) {
		super(na, c, x, y);
	}
	public boolean move(String direction, int n){
		String s1="left";
		String s2= "right";
		String s3="down";
		String s4="up";
		
		//moving the fast Flexible
		if (direction.equals(s1.toLowerCase()) || direction.equals(s1.toUpperCase()) || direction.equals(s2.toLowerCase()) || direction.equals(s2.toUpperCase()))      
	    	return(super.move(direction, n));
	      
		else if(direction.equals(s3.toLowerCase()) || direction.equals(s3.toLowerCase())){
	         if(super.getY()+n <=6) {
	        	 super.setyPos(super.getY()+n);
	        	 return true;
	         }
	         return false;
	    }
	    
		//if the direction is  up
	    else if(direction.equals(s4.toLowerCase()) || direction.equals(s4.toUpperCase())){
	    	if(super.getY()+n >=1){
	            super.setyPos(super.getY()-n); 
	            return true;
	         }
	         return false;
	    }
		return false;
	}

	@Override
	public String toString() {
		String na="", c="";
		return  " "+na+" "+c;
	}
}           

