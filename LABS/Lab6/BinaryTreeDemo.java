/*
BinaryTreeDemo
*/

/**
This class tests the code for Lab6: Exercise0. It creates a BinaryTree and
tests the methods of the  BinaryTree class.
It expands upon a framework provided by Srini (Dr. Srini Sampalli).
*/

import java.util.*;

public class BinaryTreeDemo
{
	public static void main(String[] args)
	{
        
		BinaryTree<String> A = new BinaryTree<String>();
		BinaryTree<String> B = new BinaryTree<String>();
		BinaryTree<String> C = new BinaryTree<String>();
		BinaryTree<String> D = new BinaryTree<String>();
		BinaryTree<String> E = new BinaryTree<String>();
		BinaryTree<String> F = new BinaryTree<String>();
		BinaryTree<String> G= new BinaryTree<String>();
		A.makeRoot("A");
		B.makeRoot("B");
		C.makeRoot("C");
		D.makeRoot("D");
		E.makeRoot("E");
		F.makeRoot("F");
		G.makeRoot("G");
		
		//A.attachLeft(B);
		D.attachRight(C);
		E.attachLeft(D);
		F.attachRight(E);
		G.attachLeft(F);
		C.attachRight(A);
		//D.attachLeft(F);
		
		
		
        // test statements
        System.out.printf("Height of the tree is: %d\n",
                          BinaryTree.height(G));

        System.out.printf("Number of nodes in the tree is: %d\n",
                          BinaryTree.nodes(G));

        System.out.println();
        
		System.out.print("Inorder:\t");
		BinaryTree.inorder(G);
		System.out.println();

        System.out.print("Preorder:\t");
		BinaryTree.preorder(G);
		System.out.println();
        
		System.out.print("Postorder:\t");
		BinaryTree.postorder(G);
		System.out.println();
		
		System.out.print("Level order:\t");
		BinaryTree.levelorder(G);
		System.out.println();
        System.out.println();

        System.out.printf("And is it height balanced... %s\n",
                          BinaryTree.isBalanced(G)? "Yes!": "No.");

        System.out.println();        
    }
	
}
