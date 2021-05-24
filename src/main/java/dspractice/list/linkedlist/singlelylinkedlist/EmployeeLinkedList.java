package dspractice.list.linkedlist.singlelylinkedlist;

/**
 * @author deven
 *
 */
// Class represent head

public class EmployeeLinkedList {
	private EmployeeNode head;

	public void addToFront(Employee employee) {
		// New Node create
		// new Object will be added to Head
		EmployeeNode node = new EmployeeNode(employee);
		// Setting address of current head in new node's next
		node.setNext(head);
		// Making new Node as Head
		head = node;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD --> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" --> ");
			current = current.getNext();
		}
		System.out.print("null");
	}
}
