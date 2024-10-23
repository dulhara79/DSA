package lab.lab4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t1 = new Tree();
		
		//insert 10 node
		t1.insert(149, "Anusha");
		t1.insert(167, "Kosala");
		t1.insert(47, "Dinusha");
		t1.insert(66, "Mihiri");
		t1.insert(65, "Supun");
		
		//display inorder
		System.out.println("\n Inorder (left, root, right) \n");
		t1.TraverseinOrder();
		
		//display preorder
		System.out.println("\n PreOrder (root, left, right) \n");
		t1.TraversepreOrder();
		
		//display postorder
		System.out.println("\n PostOrder (left, right, root) \n");
		t1.TraversepostOrder();
		
		//find empname
		System.out.println();
		t1.callRecursive(66);
		
		//delete all node
		System.out.println();
		t1.deleteAll();
		
		System.out.println("Delete all node");
		t1.callRecursive(65);
	}

}
