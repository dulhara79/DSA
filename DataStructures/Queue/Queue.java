package lab.lab2;

public class Queue {
	private int[] QueueArr;
	private int maxSize;
	private int reare;
	private int front;
	private int nItem;

	// constructor
	public Queue(int s) {
		this.maxSize = s;
		this.front = 0;
		this.reare = -1;
		this.nItem = 0;
		this.QueueArr = new int[maxSize];
	}

	// insert
	public void insert(int j) {
		// check queue full or not
		if (this.reare == this.maxSize - 1) {
			System.out.println("Queue if full");
		} else {
			this.QueueArr[++reare] = j;
			this.nItem++;
		}
	}

	// remove
	public int remove() {
		if (this.nItem == 0) {
			System.out.println("Queue is empty");
			return -99;
		} else {
			this.nItem--;
			return this.QueueArr[this.front++];
		}
	}

	// isEmpty
	public boolean isEmpty() {
		return (this.nItem == 0);
	}

	// isFull
	public boolean isFull() {
		return (this.reare == this.maxSize - 1);
	}
	
	// display the queue
	public void display() {
		System.out.print("YOUR QUEUE IS: ");
		for (int i = 0; i < this.maxSize; i++) {
			System.out.print(this.QueueArr[i] + ", ");
		}
	}
}
