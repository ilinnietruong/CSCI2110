/*CSCI2110: LAB 6
 * Exercise 1, where users input to create a complete tree. Output is the height, inorder,preorder,postorder , height, count of nodes and level order
 * Linh Truong |B00708389
 */

import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BinaryTree<String> tree = new BinaryTree<String>();
		BinaryTree<String> curr = tree;
		
		System.out.print("Enter name or done: ");
		String input = kb.next();
		if(!input.equalsIgnoreCase("done")){

			System.out.print("Enter name or done: ");
			input = kb.next();
			
			//loop is done when the user input "done"
			while(!input.equalsIgnoreCase("done") ){
				//when the left side of the tree is empty
				if(curr.getLeft()==null) {	
					curr.attachLeft(new BinaryTree<String>());
					curr.setData(input);
				}
		
				else { //if right side of the tree is null
					curr.attachRight(new BinaryTree<String>());
					curr = curr.getLeft();
					curr.setData(input);
				}		
				
				System.out.print("Enter name or done: ");
				input = kb.next();
			}
			
			//output the information
			System.out.println();
			System.out.print("Height of tree is: ");
			System.out.println(curr.height(tree));
			System.out.print("Number of nodes in the tree is: ");
			System.out.println(curr.nodes(tree));
			System.out.println();
				
			System.out.print("Inorder:  ");
			BinaryTree.inorder(tree);
			System.out.println();
			
			System.out.print("Preorder:  ");
			BinaryTree.preorder(tree);
			System.out.println();
			
			System.out.print("Postorder:  ");
			BinaryTree.postorder(tree);
			System.out.println();
			
			System.out.print("Level order:  ");
			BinaryTree.levelorder(tree);
		}
	}
}