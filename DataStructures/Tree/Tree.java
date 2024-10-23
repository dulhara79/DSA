package lab.lab4;

public class Tree {
	private Node root;
	
	public void insert(int Empno, String name) {
		Node newNode = new Node();
		newNode.empNo = Empno;
		newNode.name = name;
		
		if(root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent; // create variable in node class
			
			while(true) {
				parent = current;
				if(Empno<current.empNo) { //left childe
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else { //right childe
					current = current.rightChilde;
					if(current==null) {
						parent.rightChilde = newNode;
						return;
					}
				}
			}
		}
	}
	//inorder method
	private void inOrder(Node localRoot) {//left, root, right
		if(localRoot != null) {
			inOrder(localRoot.leftChild);//left
			localRoot.displayNode();//root
			inOrder(localRoot.rightChilde);//right
		}
	}
	//method to traverse the tree in inorder
	public void TraverseinOrder() {
		inOrder(root);
	}
	
	//preorder method
	private void preOrder(Node localRoot) {//root,left right
		if(localRoot != null) {
			localRoot.displayNode();//root
			preOrder(localRoot.leftChild);//left
			preOrder(localRoot.rightChilde);//right
		}
	}
	
	//method to traverse the tree in preOrder
	public void TraversepreOrder() {
		preOrder(root);
	}
	
	//postOrder method
	private void postOrder(Node localRoot) {
		if(localRoot != null) {
			preOrder(localRoot.leftChild);//left
			preOrder(localRoot.rightChilde);//right
			localRoot.displayNode();//root
		}
	}
	
	//method to traverse the tree in preOrder
		public void TraversepostOrder() {
			postOrder(root);
		}
		
		//findrecursive method
		private Node findRecursive(Node localRoot, int empno) {
			if(localRoot == null) {
				return null;
			} else if(localRoot.empNo == empno) {
				System.out.println(localRoot.name);
				return localRoot;
			} else if(empno<localRoot.empNo) {
				return findRecursive(localRoot.leftChild, empno);
			} else {
				return findRecursive(localRoot.rightChilde, empno);
			}
		}
		
		//method to call the recursive find method
		public Node callRecursive(int empno) {
			return findRecursive(root, empno);
		}
		
		//delete all method
		public void deleteAll() {
			root = null;
		}
}
