package lab.lab2;

import java.util.Scanner;

public class MainQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter queue size: ");
		int size = scn.nextInt();
		int val;
		Queue queObj = new Queue(size);

		System.out.println("Enter values to the queue: ");
		for (int i = 0; i < size; i++) {
			System.out.print("Enter value " + i + ": ");
			val = scn.nextInt();
			queObj.insert(val);
		}
		queObj.display();

		Queue evenQueue = new Queue(size);
		Queue oddQueue = new Queue(size);
		int value;

		while (!queObj.isEmpty()) {
			value = queObj.remove();
			if (value % 2 == 0) {
				evenQueue.insert(value);
			} else {
				oddQueue.insert(value);
			}
		}

		System.out.println("\nPC1: ");
		evenQueue.display();
		System.out.println();
		System.out.println("PC2: ");
		oddQueue.display();
	}

}
