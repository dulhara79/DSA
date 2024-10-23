package lab.lab3;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertFirst("Prashani", 69.5);
		list.insertFirst("Aravinda", 78.0);
		list.insertFirst("Nipuna", 53.5);
		
		// display the list
		System.out.println("----------------- Student List --------------------------");
		list.displayList();
	}
}
