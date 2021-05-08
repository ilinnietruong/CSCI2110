/**CSCI2110: Assignment 3
 * This is the demo class
 * Linh Truong |B00708389|Nov 16
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HuffmanDemo {
	public static void main(String[] args) throws IOException{
		Huffman h=new Huffman();
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the filename to read from/encode: ");
	    String filename = kb.nextLine();
	    char[] pokemon = h.readFile(filename);

	       
	    ArrayList<Pair> pairList = h.addPairs(pokemon);
	    ArrayList<BinaryTree<Pair>> s = h.sortPairs(pairList);
	    BinaryTree<Pair> huffmanTree = h.huffmanTree(s);
	    String[] encode = h.findEncoding(huffmanTree);
	    
	    h.huffmanCode(encode, pairList);
	    System.out.println("\n* * * * *\n");
	    h.decode(encode);
	}
} //end class
