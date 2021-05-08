/*CSCI2110: Assignment 3
 * This is the huffman class. This contains multiple of methods to create the huffman tree.
 * Linh Truong | B00708389 | Nov 16th,2019
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Huffman {
	
 //add the pairs into the list
    public static ArrayList<Pair> addPairs(char[] c){   
    	ArrayList<Pair> l = new ArrayList<Pair>();
        l.add(new Pair(c[0]));   
        boolean inList;
        
        for(int i=0; i<c.length; i++){
            inList = false;
            Pair p = new Pair(c[i]);     
            for(int j=0 ; j<l.size(); j++){
                if(l.get(j).isEqual(p)){
                    l.get(j);
                    inList = true;
                    break;
                }
            }
            if(inList != true){
                l.add(p);
            }
        }
        for(int i=0; i<l.size(); i++){
            l.get(i).setProb(i);
        }
        return l;
    }

    //sort the binarytree inside  the arrayList
    public static ArrayList<BinaryTree<Pair>> sortPairs (ArrayList<Pair> l){
        ArrayList<BinaryTree<Pair>> s = new ArrayList<BinaryTree<Pair>>();
        Collections.sort(l);
        for(int i=0; i<l.size(); i++){
            BinaryTree<Pair> p = new BinaryTree<Pair>();
            p.makeRoot(l.get(i));
            s.add(p);
        }
        return s;
    }

    //building the huffman code
    public static BinaryTree<Pair> huffmanTree(ArrayList<BinaryTree<Pair>> tree){
    	ArrayList<BinaryTree<Pair>> huffman = new ArrayList<BinaryTree<Pair>>();
     	BinaryTree<Pair> a = new BinaryTree<Pair>();
    	BinaryTree<Pair> b = new BinaryTree<Pair>();
    	double prob=0;
    	while(!tree.isEmpty()){
    		if(huffman.isEmpty() || !huffman.isEmpty()){
    			a = tree.remove(0);	
    			b = tree.remove(0);
    		}
    	
    		prob = a.getData().getProb() + b.getData().getProb();
    		Pair root = new Pair('0', prob);
    		BinaryTree<Pair> code = new BinaryTree<Pair>();
    		
    		//creating the tree
    		code.makeRoot(root);
    		code.attachLeft(a);
    		code.attachRight(b);
    		huffman.add(code);
    	}

    	while(huffman.size()>1){
    		a = huffman.remove(0);
    		b = huffman.remove(0);
    		prob = a.getData().getProb() + b.getData().getProb();
    		Pair root = new Pair('0', prob);
    		BinaryTree<Pair> code = new BinaryTree<Pair>();
    		code.makeRoot(root);
    		code.attachLeft(a);
    		code.attachRight(b);
    		huffman.add(code);
    	} 	
    	return huffman.get(0);
    }

    //Encoding method
    public static void findEncoding(BinaryTree<Pair> bt, String[] a, String prefix){
    	// test is node/tree is a leaf
    	if (bt.getLeft()==null && bt.getRight()==null){
    		a[bt.getData().getValue()] = prefix;
    	}
    	// recursive calls
    	else{
    		findEncoding(bt.getLeft(), a, prefix+"0");
    		findEncoding(bt.getRight(), a, prefix+"1");
    	}
    }

    //encode
    public static String[] findEncoding(BinaryTree<Pair> bt){
        String[] result = new String[256];
        findEncoding(bt, result, "");
        return result;
    }

    //Find probability for certain char
    public static double findProb(ArrayList<Pair> prob, char key){
        double result= 0;
        for(int i=0; i<prob.size(); i++){
            if(prob.get(i).getValue() == key)
                result = prob.get(i).getProb();
        }
        return result;
    }

    //output the huffman's Code
    public static String huffmanCode(String[] encode, ArrayList<Pair> code) throws FileNotFoundException{
        String result = "";
        result += String.format("%-17s%-12s%-12s\n","Symbol Prob.", "Huffman", "Code");
       
        for(int i=0; i<encode.length;i++){
            if(encode[i] != null)
                result += String.format("%-17s%-12s%-12s\n", (char)i, findProb(code, (char)i) ,encode[i]);         
        }
        
        PrintWriter newFile=new PrintWriter("Huffman.txt"); 
        newFile.format(result);
        newFile.close();
        System.out.println("Printing codes to Huffman.txt");
        encode("Huffman.txt",encode,"Encoded.txt");
        System.out.println("Printing codes to Encoded.txt");   
        return result;
    }

    //Encode the file and write it into output file
    public static void encode(String huffmantxt, String[] encode, String encodedtxt) throws FileNotFoundException{
    	String s = "";
        char[] c = readFile(huffmantxt);

        for(int i=0; i<c.length;i++){
        	if(c[i] == '\n'){
                s += '\n';
            }
        	else if(c[i] == ' '){
                s += ' ';
            }
           
            for(int j=0; j<encode.length;j++){
                if((char)j == c[i] && encode[j] != null  ){
                    s += encode[j];
                }
            }
        }
        
    	PrintWriter output=new PrintWriter("Encoded.txt"); 
    	output.format(s);
    	output.close(); 	
    }
    
    //read the file and then replaced them into characters
    public static char[] readFile(String filename) throws FileNotFoundException{
        File file = new File(filename);
        String str = new Scanner(file).useDelimiter("\\A").next();
        str = str.replace(" ", "");
        str = str.replace("\n", "");
        char[] ch = str.toCharArray();
        return ch;
    }

    //Decode the file and write it into output file
    public static void decode(String[] encode) throws FileNotFoundException{
    	
    	Scanner kb=new Scanner(System.in);
    	System.out.print("Enter the filename to read from/decode: ");
	    String decode= kb.nextLine();
	    System.out.print("Enter the filename of document containing Huffman codes: ");
	    String huffman=kb.nextLine();
	    String code="";
    	Scanner ls = new Scanner(huffman);
    	String s="";
    	PrintWriter output= new PrintWriter("Decoded.txt");
    	// consume/discard header row and blank line
    	//ls.nextLine();
    	ls.nextLine();
    	while(ls.hasNextLine()){
    		char c = ls.next().charAt(0);
    		ls.next(); // consume/discard probability
    		s = ls.next();
    		ArrayList<Pair> p= new ArrayList<Pair>();
    		p.add(new Pair(c));
    	}
        output.println(s);
        output.close();
        System.out.println("Printing decoded text to Decoded.txt");
    }
}