package stack_01;

public class StackApp {

	public static void main(String[] args) {
		Stack myStack = new Stack(5);

//		System.out.println(myStack.peek());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.isEmpty());
//		System.out.println(myStack.isFull());
		myStack.push('A');
//		System.out.println(myStack.peek());
		myStack.push('B');
//		System.out.println(myStack.isEmpty());
		myStack.push('C');
//		System.out.println(myStack.isFull());
		myStack.push('D');
		myStack.push('E');

		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		System.out.println();
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.isFull());
	}

}
