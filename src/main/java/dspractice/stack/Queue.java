package dspractice.stack;

public class Queue {
	private long [] queueArray;
	private int maxSize;
	private int front;//index position of element of front
	private int rear;//index position of element of back of the line
	private int nItems;//coubnter to maintain item in queue
	
	//initialize queue using constructor
	public Queue(int size) {
		queueArray = new long[size];
		maxSize = size;
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(long j) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}else if(rear == maxSize-1){
			rear = -1;
		}
		else {	
			rear++;
			queueArray[rear]=j;
			nItems++;
		}	
	}
	
	public void view() {
		
			System.out.print("[");
			for (int i = front; i <= rear; i++) {// important => i starting with front
				System.out.print(queueArray[i]+" ");
			}
			System.out.print("]");
		
	}
	
	//remove item form queue
	public long remove() {
		if(isEmpty()) {
			System.out.println("Queue is already empty");
			return -1;
		}else {
			long temp = queueArray[front];
			front++;
			if(front == maxSize) {
				front = 0; //we can set front back to the 0th index so we can utilized entire array again
				rear=-1;
			}
			nItems--;
			return temp;
		}
	}
	
	public boolean isEmpty() {
		return rear==-1;
	}
	
	public boolean isFull() {
		return nItems== maxSize;
	}
	
}
