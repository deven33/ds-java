package dspractice.stack;

public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(5);
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.insert(30);
		queue.insert(40);
		System.out.println();
		System.out.println("insert done");
		queue.view();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		//queue.remove();
		System.out.println();
		System.out.println("remove done");
		queue.view();
	}

}
