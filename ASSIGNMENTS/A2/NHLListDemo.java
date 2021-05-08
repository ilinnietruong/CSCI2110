/**CSCI2110:
 * A2:Excercise 1
 * The democlass
 *Linh Truong |B00708389
 */


import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
	
public class NHLListDemo {
	public static void main(String[] args) throws IOException{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.nextLine();
		File file = new File(filename);
		NHLStats stats = new NHLStats();
		String name,position,team;
		int played,scored,assists,minutes,shots,wins;
		PlayerRecord player=null;	
		try {

			Scanner inputFile = new Scanner(file);
			while (inputFile.hasNextLine()) {
					
				String line = inputFile.nextLine();
				StringTokenizer token = new StringTokenizer(line, "\t");

				while (token.hasMoreTokens()) {
					name = token.nextToken();
					position = token.nextToken();
					team = token.nextToken();
					played = Integer.parseInt(token.nextToken());
					scored =Integer.parseInt(token.nextToken());
					assists = Integer.parseInt(token.nextToken());
					minutes = Integer.parseInt(token.nextToken());
					shots = Integer.parseInt(token.nextToken());
					wins = Integer.parseInt(token.nextToken());
					player = new PlayerRecord (name, position,team,played,scored,assists,minutes,shots,wins);
					stats.addStats(player);
				}
					
			} 
				
		} 		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//display information
		System.out.println("\nNHL Results Summary ");
		System.out.println("\nPlayers with highest points and their teams: ");
		System.out.println(stats.mostPoints());
			
		System.out.println("\nMost agressive players,their team and their position");
		System.out.println(stats.mostAggressive());
			
		System.out.println("\nMost valuable players and their teams:");
		System.out.println(stats.MVP());
			
		System.out.println("\nMost promising players and their teams:");
		System.out.println(stats.mostPromising());
			
		System.out.println("\nTeams that had the most number of penalty minutes: ");
		System.out.println(stats.mostPenalty());
			
		System.out.println("\nTeams that had the most number of game winning goals:");
		System.out.println(stats.mostGoals());
	}
}