package binaryTree;

public class treeTraversal {

	public static void main(String args[]){
		
		Node root=new Node(1);
		root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
		
		System.out.println("Inorder is ");
        inOrder(root);
        System.out.println("\nPreorder is ");
		preOrder(root);
		System.out.println("\nPostorder is ");
		postOrder(root);
		
		
		
		
	}
	
	static void inOrder(Node root){
		if(root.left!=null){ inOrder(root.left);}
		System.out.print(root.data);
		if(root.right!=null){ inOrder(root.right); }
		
	}
	
	static void preOrder(Node root){
		if(root!=null){
			System.out.print(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	
	static void postOrder(Node root){
		if(root.left!=null){ postOrder(root.left);}
		if(root.right!=null){ postOrder(root.right); }
		System.out.print(root.data);
		
	}
	
	
	
	
	
	
}
