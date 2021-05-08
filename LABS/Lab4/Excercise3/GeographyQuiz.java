/*CSCI2112
 * Lab 4: Exercise 3
 * Main purpose of this program is to quiz people on capitals of their country or the way around. Stored the countries (odd indexes) and
 * capitals(even indexes) from the file inside an unordered list. Search the unordered list and report whether the answer supplied by a user is coorect or incorrect.
 * Towards the end of the program, display a statistic to show how well the player performed.
 * Linh Truong | B0070389 | Oct 13/19
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class GeographyQuiz {
	public static void main(String[] args) throws IOException {
		int correct=0, count=0,score=0;
		String country,capital,pick,answer;
			
		ArrayList <String> geoList= new ArrayList<String>(); //create an arraylist
			
		Random random=new Random(); //random generator
			
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String filename = kb.nextLine();
			
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
			
				
		while (inputFile.hasNext()) {
			geoList.add(inputFile.nextLine());		
		}
		inputFile.close();
			
		System.out.println("Welcome to the Country-Capital Quiz");
		do {
			System.out.print("Play?\t");
			pick=kb.nextLine();
			if(pick.equalsIgnoreCase("yes")){
				int indexGeo= random.nextInt(geoList.size()); //let assume odd indexes are countries and even indexes are capitals

				if(indexGeo%2==0) { //when the index is even numbers, need to give them the capital of the country. 
					System.out.print("What is the capital of \""+geoList.get(indexGeo)+"\"? ");
					answer=kb.nextLine();
						
                    if(answer.equalsIgnoreCase(geoList.get(indexGeo+1))) { //if the answer on the list is after the country, it is correct
                    	System.out.print("Correct.\n");
                        correct++; //add one for correct
                    }
                    else {
                    	System.out.print("Incorrect. The correct answer is \""+geoList.get(indexGeo+1)+"\".\n");
                    }
				}
				else { //when the index is odd
					System.out.print("What country has \""+geoList.get(indexGeo)+"\" as its capital? ");
					answer=kb.nextLine();
					if(answer.equalsIgnoreCase(geoList.get(indexGeo-1))) { //if the answer on the list is before the capital, it is correct
						System.out.print("Correct.\n");
						correct++; //add one for correct
					}
					else {
						System.out.print("Incorrect. The correct answer is \""+geoList.get(indexGeo-1)+"\"\n");
					}
				}
				count++; //count the rounds
			}		
		}
		while(!pick.equalsIgnoreCase("no")); //keep looping until input is no  
		score=(correct*100)/count; //calculate the score
		System.out.print("\nGame over.\n\nGame Stats: ");
        System.out.print("\nQuestions played : "+count+"; Correct answers : "+correct+"; Score: "+score+"%");		
	}
} //end class
			

