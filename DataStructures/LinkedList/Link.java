package lab.lab3;

public class Link {
	public String name;
	public double avg;
	public Link next;

	public Link(String name, double avg) {
		super();
		this.name = name;
		this.avg = avg;
		this.next = null;
	}

	public void displayDetails() {
		System.out.println("Name: " + this.name + " || Avarage: " + this.avg);
	}
}
