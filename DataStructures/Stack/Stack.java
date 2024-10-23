package stack_01;

public class Stack {
	private int top;
	private int maxSize;
	private char[] stackArray;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return top == this.maxSize - 1;
	}

	public void push(char character) {
		if (!this.isFull()) {
			stackArray[++top] = character;
		} else {
			System.out.println("Stack is Full!!");
		}
	}

	public char pop() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty!!");
			return 'E';
		} else {
			return this.stackArray[top--];
		}
	}

	public char peek() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty!!");
			return 'E';
		}

		return this.stackArray[top];
	}
}
