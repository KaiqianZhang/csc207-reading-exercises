
public class Tree<T extends Comparable<T>> {
	private class Node<T> {
		private T data;
		private Node<T> left;
		private Node<T> right; //more than two children, a list of Node<T>
		
		public Node (T data, Node<T> left, Node<T> right) { //wrong if we wrote Node<T>() for constructor 
			this.data = data;	
			this.left = left;
			this.right = right;
		}
		
		public Node(T data) {
			this(data, null, null);
		}
	}
	
	// Tree Field
	private Node<T> root;
	
	// Tree constructor
	public Tree() {
		root = null;
	}
	
	// recursive tree : 1. empty 2. node with two subtrees
	// binary search trees: 1. empty 2. two subtrees with constraints left subtree < ...
	//                                                                right subtree >= ...
	
	
	
	
	
	// Function size()
	// Recursion for size() in Tree class:
	// -the size of a leaf is 0
	// -the size of a node is 1 + the size of left sub-tree + the size of right sub-tree
	private int sizeH (Node<T> cur) {
		if (cur == null) {
			return 0;
		} else {
			return 1 + sizeH(cur.left) + sizeH(cur.right);
		}		
	}
	
	public int size() {
		return sizeH(root);
	}
	
	// Function insertion()
	private Node<T> insertionH(T value, Node<T> cur) {
		if (cur == null) {
			return new Node(value);
		} else {
			if (value.compareTo(cur.data) < 0) {
				cur.left = insertionH(value, cur.left);
			} else {
				cur.right = insertionH(value, cur.right);
			}
			return cur;
		}
	}
	
	public void insertion(T value) {
		root = insertionH(value, root);
	}
	
	private void printInorderH (Node<T> cur) {
		if (cur == null) {
			System.out.println("");
		} else {
			printInorderH(cur.left);
			System.out.println(cur.data);
			printInorderH(cur.right);
		}
	}
	
	public void printInorder() {
		printInorderH(root);
	}
	
	public static void main(String[] args) {
		Tree<Integer> myTree = new Tree();
		myTree.insertion(5);
		myTree.insertion(8);
		myTree.insertion(2);
		myTree.insertion(10);
		myTree.insertion(7);
		myTree.insertion(3);
		myTree.printInorder();		
	}
	


}
