/**
 * 
 */

/**
 * @author Linnie
 *
 */
public class SlowFlexible extends SlowPiece{

	public SlowFlexible(String na, String c, int x, int y) {
		super(na, c, x, y);
	}
	
	public boolean move(String direction){
		String s1="left";
		String s2= "right";
		String s3="down";
		String s4="up";
		
		//move the direction either right or left
		if (direction.equals(s1.toLowerCase()) || direction.equals(s1.toUpperCase()) || direction.equals(s2.toLowerCase()) || direction.equals(s2.toUpperCase())) {      
	         return (super.move(direction));
		}
		
		//move the direction down
	    else if(direction.equals(s3.toLowerCase()) || direction.equals(s3.toLowerCase())){
	         if(super.getY() <=6) {
	        	 super.setyPos(super.getY());
	        	 return true;
	         }
	         return false;
	    }
	    
		//if the direction is  up
	    else if(direction.equals(s4.toLowerCase()) || direction.equals(s4.toUpperCase())){
	    	if(super.getY() >=1){
	            super.setyPos(super.getY()-1); 
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

