package tress;
import java.util.*;


public class pathsum {
	private static class Node {
		 private int data;
		private Node left, right;

		 public Node(int item) {
		     this.data = item;
		     this.left = null;
		     this.right = null;
		 }
		}static Node root;
		public static boolean hasPathSum(Node root, int sum) {
	        if(root == null) return false;
	    
	        if(root.left == null && root.right == null && sum - root.data == 0) return true;
	    
	        return hasPathSum(root.left, sum - root.data) || hasPathSum(root.right, sum - root.data);
	    }
	public static void main(String[] args) {
		 pathsum tree_level = new pathsum();
	     tree_level.root = new Node(1);
	     tree_level.root.left = new Node(2);
	     tree_level.root.right = new Node(3);
	     tree_level.root.left.left = new Node(4);
	     tree_level.root.left.right = new Node(5);	
System.out.println(hasPathSum(root,7));
	}

}
