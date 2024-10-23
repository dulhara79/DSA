package lab.lab4;

public class Node {
	public String name;
	public int empNo;
	public Node leftChild, rightChilde;
	
	//display method
	public void displayNode() {
		System.out.println("Employee number: \t" + this.empNo + "\t Employee name: \t" + this.name);
	}
}
