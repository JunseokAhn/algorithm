package dataStructure_algorithm;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree2 tree = new Tree2();
		Node n5 = tree.createNode(5, null, null);
		Node n4 = tree.createNode(4, null, null);
		Node n3 = tree.createNode(3, null, null);
		Node n2 = tree.createNode(2, n4, n5);
		Node n1 = tree.createNode(1, n2, n3);
		
		tree.setRoot(n1);
		System.out.print("중위순회 : ");
		tree.inOrder(tree.getRoot());
		
		System.out.println();
		System.out.print("전위순회 : ");
		tree.preOrder(tree.getRoot());
		
		System.out.println();
		System.out.print("후위순회 : ");
		tree.postOrder(tree.getRoot());
	}

}

class Tree2 {
	public Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node node) {
		this.root = node;
	}

	public Node createNode(int data, Node left, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;

		return node;
	}

	// 중위순회 inOrder = left > root > right
	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data);
			inOrder(node.right);
		}
	}

	// 전위순회 preOrder = root > left > right
	public void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	// 후위순회 postOrder = left > right > root
	public void postOrder(Node node) {
		if (node != null) {
			preOrder(node.left);
			preOrder(node.right);
			System.out.print(node.data);
		}
	}
		
}
