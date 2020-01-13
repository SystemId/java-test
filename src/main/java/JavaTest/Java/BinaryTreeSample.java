package JavaTest.Java;



public class BinaryTreeSample {

	//https://www.youtube.com/watch?v=M6lYob8STMI
	Node root;

	public void addNode(int key, String name) {

		// Create a new Node and initialize it

		Node newNode = new Node(key, name);
		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			while (true) {

				parent = focusNode;

				if (key < focusNode.key) {

					focusNode = focusNode.leftChild;

					if (focusNode == null) {

						// then place the new node on the left of it

						parent.leftChild = newNode;

						return; // All Done

					}

				} else { // If we get here put the node on the right

					focusNode = focusNode.rightChild;

					if (focusNode == null) {

						// then place the new node on the right of it

						parent.rightChild = newNode;

						return; // All Done

					}

				}

			}

		}

	}

	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			inOrderTraverseTree(focusNode.leftChild);

			System.out.println(focusNode);

			inOrderTraverseTree(focusNode.rightChild);

		}

	}

	public void preorderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			System.out.println(focusNode);

			preorderTraverseTree(focusNode.leftChild);

			preorderTraverseTree(focusNode.rightChild);

		}

	}

	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);

			postOrderTraverseTree(focusNode.rightChild);

			System.out.println(focusNode);

		}

	}

	public Node findNode(int key) {

		Node focusNode = root;

		while (focusNode.key != key) {
			if (key < focusNode.key) {

				focusNode = focusNode.leftChild;

			} else {

				focusNode = focusNode.rightChild;

			}

			if (focusNode == null)

				return null;

		}

		return focusNode;

	}

	public static void main(String[] args) {
		BinaryTreeSample theTree = new BinaryTreeSample();

		theTree.addNode(50, "Boss");

		theTree.addNode(25, "Vice President");

		theTree.addNode(15, "Office Manager");

		theTree.addNode(30, "Secretary");

		theTree.addNode(75, "Sales Manager");

		theTree.addNode(85, "Salesman 1");

		// Different ways to traverse binary trees

		// theTree.inOrderTraverseTree(theTree.root);

		// theTree.preorderTraverseTree(theTree.root);

		// theTree.postOrderTraverseTree(theTree.root);

		// Find the node with key 75

		System.out.println("\nNode with the key 75");

		System.out.println(theTree.findNode(75));

	}

}

class Node {

	int key;

	String name;

	Node leftChild;

	Node rightChild;

	Node(int key, String name) {
		this.key = key;

		this.name = name;

	}

	public String toString() {

		return name + " has the key " + key;

	}

}
