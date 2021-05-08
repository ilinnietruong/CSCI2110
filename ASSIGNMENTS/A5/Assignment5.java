/*CSCI2110: Assignment 5
 * This is the final assignment which it is about graphs. We input a file and should create an adj matrix and traversing the nodes of 
 * undirected, unweighted graph by using the algorithm BFS.
 * Linh Truong | B00708389 | December 8th,2019
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment5 {
	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);
		ArrayList<String> graph= new ArrayList<String>();
		ArrayList<String> leftV= new ArrayList<String>(); //left vertices
		ArrayList<String> rightV= new ArrayList<String>(); //right ver†ices
		ArrayList<String> outcome= new ArrayList<String>(); //result
		int n=0;
		
		System.out.print("Enter the filename to read from: ");
	    String filename = kb.nextLine();
	    
	    File file = new File(filename);
	    Scanner inputFile = new Scanner(file);
	    //reading the file 
	    StringTokenizer token ;
	    String line = inputFile.nextLine();
	    token = new StringTokenizer(line, "\t");
	   
	    n=Integer.parseInt(token.nextToken()); //
	   
		
	    //create the adjacent matrix with all zeros
	    int[][] adj = new int[n][n];
	    
		for(int i=0; i<n; i++){
			for(int j=0; j<n;j++){
				adj[i][j] = 0;
			}
		}
		
		String firstV, secondV; //create string vertices
	    while (inputFile.hasNext()  ){
	      line = inputFile.nextLine();
	      token = new StringTokenizer(line, "\t");
	      firstV = token.nextToken(); 
	      secondV = token.nextToken();
	      leftV.add(firstV);
	      rightV.add(secondV);
	      
	      //add the vertices in the graph
	      if(!graph.contains(firstV)) {
				graph.add(firstV);
	      }
	      if(!graph.contains(secondV)) {
				graph.add(secondV);
	      }
	      
	      //adding vertices and if the vertices connected to one another it is equal to 1
	      int v0 = firstV.charAt(0)-65;
	      int v1 = secondV.charAt(0)-65;
	      adj[v0][v1] = 1;
	      adj[v1][v0] = 1;	      
	    }
	    
	    inputFile.close();   //close the file
	    
	    //creating the adj matrices into their position
	    if(!graph.isEmpty()){
			int size = graph.size();
			String graphIndex= graph.get(0);
			int i = 0;
			for(int j= 0; j < size ; j++){
				for(int k= 0 ; k < graph.size(); k++){
					if(graph.get(k).compareTo(graphIndex ) < 0){
						graphIndex = graph.get(k);
						i = k;
					}
				}
				
				outcome.add(graph.remove(i));
				if(!graph.isEmpty()){
					i = 0;
					graphIndex = graph.get(0);
				}
			}
		}
	   
		
		//Using the Breadth-first Search (BFS) algorithm
		ArrayList<String> queue = new ArrayList<String>(); //Initialize an empty queue
		ArrayList<String> result = new ArrayList<String>(); //Initialize a result list
		String stringG="";
		
		queue.add(leftV.get(0));//enqueue the fist vertex
		while(!queue.isEmpty()){
			result.add(queue.remove(0)); //dequeue the neighbours into the result
			
			//Dequeue and list the vertex v in the result list
			for(int i=0; i<leftV.size(); i++){
				stringG = leftV.get(i);
				if( (!queue.contains(rightV.get(i))) && (!result.contains(rightV.get(i))) && (stringG.equals(result.get(result.size()-1)))) {
					queue.add(rightV.get(i));		
				}
			}
			
			//Enqueue each neighbor of v (if it is not already in the result list or not already in the queue)
			for(int i=0; i< rightV.size(); i++){
				stringG = rightV.get(i);
				if((!queue.contains(leftV.get(i))) && (!result.contains(leftV.get(i))) && (stringG.equals(result.get(result.size()-1)))){
					queue.add(leftV.get(i));	
				}
			}								
		} //end of the while loop
		 
		//Print the adj matrix
		System.out.print(" ");
		for(int i=0; i< outcome.size(); i++){
			System.out.print(" " + outcome.get(i));
		}
		
		System.out.println();
		for(int i=0; i< n; i++){
			System.out.print(outcome.get(i));
			for(int j=0; j< n;j++){
				System.out.print(" " + adj[i][j]);
			}
			System.out.println();
		}
		
		//display the vertices visited
		System.out.println("\nVertices Visited: \n");
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i)+" visited");		
		}
	}	
}//end of class

