package dspractice.list.linkedlist.singlelylinkedlist;

public class Application {
	public static void main(String[] args) {
		Employee devameta = new Employee("Dev", "Ameta", 1);
		Employee dev2ameta = new Employee("Dev2", "Ameta2", 2);
		Employee dev3ameta = new Employee("Dev3", "Ameta3", 3);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(devameta);
		list.addToFront(dev2ameta);
		list.addToFront(dev3ameta);
		
		list.printList();
	}
}
