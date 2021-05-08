/**
 * 
 */

/**
 * @author Linnie
 *
 */
import java.util.Scanner;
public class PracticeMoves{
   public static void main(String[] args){
      Board b = new Board();
      String name="";
      String colour="";
      String type="";
      Scanner kb = new Scanner(System.in);
      String command;
      String direction;
      String exit="exit";
      String create="create";
      String help="help";
      int xPos,yPos;
      System.out.print("Enter a command (type help for details): ");
      command=kb.next();
      
      //the program exit when user enter exit
      while(!command.equalsIgnoreCase(exit)){
    		 if(command.equalsIgnoreCase(help)) {
    			 System.out.println("Possible commands are as follows: ");
    			 System.out.print("Enter \"move\" to move your piece.");
    			 System.out.println("Enter \"print\" to display the board");
    			 System.out.println("Enter \"help\" to display help");
    			 System.out.println("Enter \"exit\" to exit the program.");
    			 command=kb.next();
    		 }
    		 //when the user enter move, types of moves the user can move
    		 else if(command.equalsIgnoreCase("move")) {
    		    	System.out.println("Enter \"smove\" for a slow piece, which can move left or right, but moves one at a time.");
    		    	System.out.println("Enter \"fmove\" for a fast piece, which can move at any direction, but moves one at a time.");
    		    	System.out.println("Enter \"createsf\" for a slow flexible piece, which can move at any direction, and moves one at a time.");
    		    	System.out.println("Enter \"createff\" for a fast flexible piece, which can move at any direction, and moves  multiple .");
    		    	type=kb.nextLine();
    		    	if(type.equalsIgnoreCase("smove")){
    		    		System.out.println("Enter a name: ");
    		    		name = kb.nextLine();
    		    		System.out.println("Enter a color: ");
    		    		colour= kb.nextLine();
      			
    		    		System.out.print("Please enter a direction(either right or left): ");
    		    		direction=kb.nextLine();
      			
    		    		System.out.print("Please enter the X coordinate (1-8): ");
    		    		xPos = kb.nextInt()-1;
                
    		    		while(xPos<0||xPos>7){
    		    			System.out.print("ERROR: Input is out from the range. Please re-enter the X position (1-8): ");
    		    			xPos = kb.nextInt()-1;
    		    		}
    		    		System.out.print("Please enter the Y coordinate (1-8): ");
    		    		yPos = kb.nextInt()-1;
               
    		    		while(yPos<0||yPos>7){
    		    			System.out.print("ERROR:Input is out from the range. Please re-enter the Y position (1-8): ");
    		    			yPos = kb.nextInt()-1;
    		    		}
    		    		SlowPiece sp=new SlowPiece(name, colour, xPos, yPos);
    		    		sp.toString();
    		    		b.movePiece();
    		    	}
    		    	else if(type.equalsIgnoreCase("fmove")){
    		    		System.out.println("Enter a name: ");
    		    		name = kb.nextLine();
    		    		System.out.println("Enter a color: ");
    		    		colour= kb.nextLine();
      			
    		    		System.out.print("Please enter a direction(either right or left): ");
    		    		direction=kb.nextLine();
      			
    		    		System.out.print("Please enter the X coordinate (1-8): ");
    		    		xPos = kb.nextInt()-1;
                
    		    		while(xPos<0||xPos>7){
    		    			System.out.print("ERROR: Input is out from the range. Please re-enter the X position (1-8): ");
    		    			xPos = kb.nextInt()-1;
    		    		}
    		    		System.out.print("Please enter the Y coordinate (1-8): ");
    		    		yPos = kb.nextInt()-1;
               
    		    		while(yPos<0||yPos>7){
    		    			System.out.print("ERROR:Input is out from the range. Please re-enter the Y position (1-8): ");
    		    			yPos = kb.nextInt()-1;
    		    		}
    		    		FastPiece fp=new FastPiece(name,colour,xPos,yPos);
    		    		fp.toString();
    		    		b.movePiece();
    		    	}
    		    	else if(type.equalsIgnoreCase("createff")){
    		    		int spaceMove;
    		    		
    		    		System.out.println("Enter a name: ");
    		    		name = kb.nextLine();
    		    		System.out.println("Enter a color: ");
    		    		colour= kb.nextLine();
    		    		System.out.print("Please enter the amount of spaces you want:" );
    		    		spaceMove=kb.nextInt();
    		    		for(int i=0; i<spaceMove;i++) {
    		    			System.out.print("Please enter a direction(either right or left): ");
    		    			direction=kb.nextLine();
      			
    		    			System.out.print("Please enter the X coordinate (1-8): ");
    		    			xPos = kb.nextInt()-1;
                
    		    			while(xPos<0||xPos>7){
    		    				System.out.print("ERROR: Input is out from the range. Please re-enter the X position (1-8): ");
    		    				xPos = kb.nextInt()-1;
    		    			}
    		    			System.out.print("Please enter the Y coordinate (1-8): ");
    		    			yPos = kb.nextInt()-1;
               
    		    			while(yPos<0||yPos>7){
    		    				System.out.print("ERROR:Input is out from the range. Please re-enter the Y position (1-8): ");
    		    				yPos = kb.nextInt()-1;
    		    			}
    		    		
    		    			FastFlexible ff= new FastFlexible(name,colour,xPos,yPos);
    		    			ff.toString();
    		    			b.movePiece();
    		    		}
    		    	}
    		    	else if(type.equalsIgnoreCase("createf")){    		    		
    		    		System.out.println("Enter a name: ");
    		    		name = kb.nextLine();
    		    		System.out.println("Enter a color: ");
    		    		colour= kb.nextLine();
    		    
    		    		System.out.print("Please enter a direction(either right or left): ");
    		    		direction=kb.nextLine();
      			
    		    		System.out.print("Please enter the X coordinate (1-8): ");
    		    		xPos = kb.nextInt()-1;
                
    		    		while(xPos<0||xPos>7){
    		    			System.out.print("ERROR: Input is out from the range. Please re-enter the X position (1-8): ");
    		    			xPos = kb.nextInt()-1;
    		    		}
    		    		System.out.print("Please enter the Y coordinate (1-8): ");
    		    		yPos = kb.nextInt()-1;
               
    		    		while(yPos<0||yPos>7){
    		    			System.out.print("ERROR:Input is out from the range. Please re-enter the Y position (1-8): ");
    		    			yPos = kb.nextInt()-1;
    		    		}
    		    		
    		    		SlowFlexible sf= new SlowFlexible(name,colour,xPos,yPos);
    		    		sf.toString();
    		    		b.movePiece();
    		    		}
    		    	}
    		 //back to the command
    		    	else {
    		    		 System.out.print("Enter a command (type help for details): ");
    		    	      command=kb.next();
    		    	}
    		 	}
                if(command.equals("display")) {//displays pieces on board
                	b.display();
                }
                System.out.print("Exit");
      	}  
	}

      
           