/**
 * 
 */

/**
 * @author Linnie

 *
 */


import java.util.Scanner;
public class Board{
   private Piece[][] board = new Piece[8][8]; //an array
   //private Scanner input = new Scanner(System.in);
  
   //constructor
   public Board(){
   
   }
   
   //add a new piece to the game board
   public boolean addPiece(String direction, String name, String colour, int xPos, int yPos){
	   String s1="smove";
	   String s2="fmove";
	   String s3="createff";
	   String s4="createsf";
	   
	  //if the user did not created a board
      if(board[yPos][xPos]==null){
    	  
    	  //if the user input "smove" then it will move the direction left,right at a time.
         if(direction.equalsIgnoreCase(s1)){
             board[yPos][xPos] = new SlowPiece(name, colour, xPos, yPos);
             return true;
         }
         
         //if the user input"fmove", then it will move the direction move at any direction
         else if(direction.equals(s2.toUpperCase())|| direction.equals(s2.toLowerCase())){
             board[yPos][xPos] = new FastPiece(name, colour, xPos, yPos);
             return true;
          }
         
         //if the user input "createsf" then move any direction at one of a time
         else if(direction.equals(s3.toUpperCase())|| direction.equals(s3.toLowerCase())){
            board[yPos][xPos] = new SlowFlexible(name, colour, xPos, yPos);
            return true;
         }
         
         //if the user input "createff" then move any direction with multiple times
         else if(direction.equals(s4.toUpperCase())|| direction.equals(s4.toLowerCase())){
            board[yPos][xPos] = new FastFlexible(name, colour, xPos, yPos);
            return true;
         }
         else {
        	 System.out.print("ERROR: Wrong direction command.Please type either smove , fmove,createsf, or createff.");
         }
      } 
      return false;
   }
   
   //move the piece
   public boolean movePiece(){
      String direction="";
      int newX=0, newY=0, xPos=0, yPos=0;
      String d1="left";
      String d2="right";
      String d3="up";
      String d4="down";
      int numSpace=0;
      
     
      //moving the slow piece
      if(board[xPos][yPos] instanceof SlowPiece){
         SlowPiece sp = (SlowPiece)board[xPos][yPos];
        
         //if the direction is left
         if(direction.equals(d1))
            newX=sp.getX()-1;
         //when the direction if right
         else 
            newX=sp.getX()+1;
         
         if(sp.move(direction) && board[newX][yPos]==null){
            board[newX][yPos] = board[xPos][yPos];
            board[xPos][yPos] = null;
            return true;
         }   
         return false;
      }
      
      // move the new  fast piece position.
      if(board[xPos][yPos] instanceof FastPiece){
     	 FastPiece fp = (FastPiece)board[xPos][yPos];
     	 if(numSpace<0 || numSpace>7){
     		 System.out.println("ERROR: Out of the range from 1-7");
     	 }
     	 if(direction.equals("d1")) {
     		 newX=fp.getX()-numSpace;
     	 }
     	 else {
     		 newX=fp.getX()+numSpace;
     	 }
     	 if(fp.move(direction, numSpace) && board[yPos][newX]==null){
     		 board[yPos][newX] = board[yPos][xPos];
     		 board[yPos][xPos] = null;
     		 return true;
     	 }   
     return false;
   }
      
      //move the slow flexible
      if(board[xPos][yPos] instanceof SlowFlexible){
         SlowFlexible sf = (SlowFlexible)board[xPos][yPos];
         if(direction.equalsIgnoreCase(d1)){
            newX=sf.getX()-1;
         }
         else if(direction.equalsIgnoreCase("d2")) {
            newX=sf.getX()+1;
         }
         else if(direction.equalsIgnoreCase("d3")) {
             newY=sf.getY()-1;

         }
         else if(direction.equalsIgnoreCase("d4"))
            newY=sf.getY()+1;
         if(direction.equalsIgnoreCase("d1")||direction.equalsIgnoreCase("d2")){
            if(sf.move(direction) && board[newX][yPos]==null){
               board[newX][yPos] = board[xPos][yPos];
               board[xPos][yPos] = null;
               return true;
            }   
            return false;
         }
         
         //when the user enter up or down the board
         if(direction.equalsIgnoreCase("up")||direction.equalsIgnoreCase("down")){
            if(sf.move(direction) && board[xPos][newY]==null){
               board[xPos][newY] = board[xPos][yPos];
               board[xPos][yPos] = null;
               return true;
            }   
            return false;
         }
        
      //moving the fastFlexible with also moving the number of moves on the board
      if(board[xPos][yPos] instanceof FastFlexible){
         FastFlexible ff = (FastFlexible)board[xPos][yPos];
         if (numSpace>=6||numSpace<0){
            System.out.println("ERROR: Out of the range from 1-7");
         }
         if(direction.equalsIgnoreCase(d1)) {
            newX=ff.getX()-numSpace;
         }
         else if(direction.equalsIgnoreCase(d2)) {
            newX=ff.getX()+numSpace;
         }
         else if(direction.equalsIgnoreCase(d3)) {
            newY=ff.getY()-numSpace;
         }
         else if(direction.equalsIgnoreCase(d4)) {
            newY=ff.getY()+numSpace;
         }
         if(direction.equals(d1)||direction.equals(d2)){
            if(ff.move(direction, numSpace) && board[newX][yPos]==null){
               board[newX][yPos] = board[xPos][yPos];
               board[xPos][yPos] = null;
               return true;
            }   
            return false;
         }
         if(direction.equalsIgnoreCase(d3)||direction.equalsIgnoreCase(d4)){
            if(ff.move(direction, numSpace) && board[xPos][newY]==null){
               board[xPos][newY] = board[xPos][yPos];
               board[xPos][yPos] = null;
               return true;
            }
         }
      }
    }
	return false;
  }
     //display the board
   public void display(){
      String line="";
      int i=0, j=0;
      
      for(i=0; i<=7; i++){ //rows
         for(j=0; j<=7; j++){ //columns
            if(board[i][j]!=null){
            	line = board[i][j].toString();
            
            }
            
            //when the board is null
            else{
            	line = "-";
 
            }
            System.out.printf("%-19s",line);
         }
      }  	  
   }              
}
