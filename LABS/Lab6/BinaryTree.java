/*CSCI2110: LAB 6
 * This is the BinaryTree class. I have to implemented the count, height,isBalanced and do the levelOrder.
 * Linh Truong | B00708389 | Nov 10
 */
import java.util.*;

public class BinaryTree<T>{
	private T data;
	private BinaryTree<T> parent;
	private BinaryTree<T> left;
	private BinaryTree<T> right;
	
	public BinaryTree(){
		parent = left = right = null;
		data = null;
	}
	
	public void makeRoot(T data){
		if (!isEmpty()){
			System.out.println("Can't make root. Already exists");
		}
		else
			this.data = data;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public void setLeft(BinaryTree<T> tree){
		left = tree;
	}
    
	public void setRight(BinaryTree<T> tree){
		right = tree;
	}
    
	public void setParent(BinaryTree<T> tree){
		parent = tree;
	}
	
	public T getData(){
		return data;
	}
    
	public BinaryTree<T> getParent(){
		return parent;
	}
    
	public BinaryTree<T> getLeft(){
		return left;
	}
    
	public BinaryTree<T> getRight(){
		return right;
	}
		
	public void attachLeft(BinaryTree<T> tree){
		if (tree==null) return;
		else if (left!=null || tree.getParent()!=null){
			System.out.println("Can't attach");
			return;
		}
		else{
            tree.setParent(this);
            this.setLeft(tree);
		}
	}
	
	public void attachRight(BinaryTree<T> tree){
		if (tree==null) return;
		else if (right!=null || tree.getParent()!=null){
			System.out.println("Can't attach");
			return;
		}
		else{
            tree.setParent(this);
            this.setRight(tree);
		}
	}
	
	public BinaryTree<T> detachLeft(){
		if (this.isEmpty()) return null;
		BinaryTree<T> retLeft = left;
		left = null;
		if (retLeft!=null) retLeft.setParent(null);
		return retLeft;
	}
    
	public BinaryTree<T> detachRight(){
		if (this.isEmpty()) return null;
		BinaryTree<T> retRight = right;
		right =null;
		if (retRight!=null) retRight.setParent(null);
		return retRight;
	}
    
	public boolean isEmpty(){
		if (data == null)
			return true;
		else
			return false;
	}
    
	public void clear(){
		left = right = parent =null;
		data = null;
	}
	
	public BinaryTree<T> root(){
		if (parent == null)
			return this;
		else{
			BinaryTree<T> next = parent;
			while (next.getParent()!=null)
				next = next.getParent();
			return next;
		}
	}
	
	//recursive method to counts the number of nodes in a binary tree
    public static <T> int nodes(BinaryTree<T> t){
        if(t==null) { //when the tree is empty
        	return 0;
        }
        else if(t.getLeft()==null && t.getRight()==null) { //when both left and right tree is empty
        	return 1;
        }
        else { //when there are left and right in the tree (1 indicate the root)
        	return 1+nodes(t.getLeft())+nodes(t.getRight());
        }
    }

    //recursive method to find the height of a binary tree
    public static<T> int height(BinaryTree<T> t){
        if(t==null) { //no nodes
        	return -1;
        } 
        else if(t.getLeft()==null && t.getRight()==null) { //although theres a root node(which is height 0) , right and left side of the tree are empty
        	return 0;
        }
        else { //root,left and right tree
        	return 1+Math.max(height(t.getLeft()), height(t.getRight()));
        }
    }

    //determine whether the tree is balanced or not
    public static<T> boolean isBalanced(BinaryTree<T> t){
    	int left=height(t.getLeft());
    	int right= height(t.getRight());
    	
       if(t.getLeft()==null && t.getRight()==null) {
    	   return true;
       }
       else if(Math.abs(left-right)<=1 && isBalanced(t.getLeft()) && isBalanced(t.getRight())) {
    	   return true;
       }
       return false;
    }

    public static <T> void preorder(BinaryTree<T> t){
		if (t!=null){
			System.out.print(t.getData()+"\t");
			preorder(t.getLeft());	
			preorder(t.getRight());
		}
	}
	
	public static <T> void inorder(BinaryTree<T> t){
		if (t!=null){
			inorder(t.getLeft());
			System.out.print(t.getData() + "\t");
			inorder(t.getRight());
		}
	}
	
	public static <T> void postorder(BinaryTree<T> t){
		if (t!=null){
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() + "\t");
		}
	}

	//print out the level order of the tree.
	public static <T> void levelorder(BinaryTree<T> t){    
		
		if (t == null) {
			return; 
		}	
		Queue<BinaryTree> tree = new LinkedList<>(); 
		BinaryTree curr;
		tree.add(t); 		  
		while (!tree.isEmpty()) { 	  
			curr = tree.poll(); 
			if (curr.getLeft() != null) {
					tree.add(curr.getLeft()); 
			}	
			if (curr.getRight() != null) {
				tree.add(curr.getRight()); 
		    }
		    System.out.print(curr.data + "\t"); 		
		} 		   	   
	}
} //end class