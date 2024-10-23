package lab.lab3;

public class Main {
	public static void main(String[] args) {
		Link nipuna = new Link("Nipuna", 53.5);
		Link aravinda = new Link("Aravinda", 78.0);
		Link prashani = new Link("Prashani", 69.5);

		nipuna.next = aravinda;
		aravinda.next = prashani;
		prashani.next = null;
		
		nipuna.displayDetails();
		aravinda.displayDetails();
		prashani.displayDetails();
	}
}
