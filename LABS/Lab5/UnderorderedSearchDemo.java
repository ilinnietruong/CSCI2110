import java.util.Scanner;
import java.io.*;
import java.util.Random;


public class UnderorderedSearchDemo {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.nextLine();
        String input="";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		//int n=0;
				
		List<String> list = new List<String>();
				
		while (inputFile.hasNext()) {
			input = inputFile.nextLine();
			list.add(input);				
		}	
		 Random rand = new Random();
		inputFile.close();	
		System.out.println("Names output: " );
		int random= rand.nextInt(list.size());
		while(random!=-1) {
		for(int i=0;i<10;i++) {
			if((list.size()-1)==random) {
			search(input);
			}}
		}
	}
	
	public static Boolean search(String name) {
		List<String> l =new List<String>();
     
        	l.add(name);
 
        

			if(l.contains(name)) {
				System.out.println("The name \""+name+"\" is found.");
				return true;		
			}
		
	
			System.out.println("The name \""+name+"\" is NOT found.");
			return false;
	}
}
