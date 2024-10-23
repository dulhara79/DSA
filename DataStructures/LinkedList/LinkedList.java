package lab.lab3;

public class LinkedList {
	private Link first;
	
	public LinkedList() {
		this.first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(String name, double avg) {
		Link newLink = new Link(name, avg);
		newLink.next = first;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayDetails();
			current = current.next;
		}
	}
	
	public Link deleteLink(String name) {
		Link current = first;
		Link previous = first;
		
		if(current == null) {
			return null;
		}
		
		while (!current.name.equals(name)) {
			previous = current;
			current = current.next;
			
			if (!current.name.equals(name)) {
				return null;
			}
		}
		
		if(current == first) {
			first = first.next;
		} else  {
			previous.next = current.next;
		}
		return current;
		
	}
}
