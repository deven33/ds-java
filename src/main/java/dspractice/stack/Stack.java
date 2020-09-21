package dspractice.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new long[maxSize];
		//index position of last item
		this.top = -1;
	}
	
	public void push(long j) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
			top++;
			stackArray[top] = j;
		}
	}
	
	public long pop() {
		if(isEmpty()) {
			System.out.println("Already Empty");
			return -1;
		}else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}
	
	//return top item
	public long peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize == top+1 );
	}
	
	
	
	
	
}
