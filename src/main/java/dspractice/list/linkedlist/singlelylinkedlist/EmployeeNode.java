package dspractice.list.linkedlist.singlelylinkedlist;

/**
 * @author deven
 *
 */
//Node contains Object and next reference
public class EmployeeNode {

	private Employee employee;
	// Store reference of next node in list
	private EmployeeNode next;

	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	// Printing employee.toString()    
	
	@Override
	public String toString() {
		return employee.toString();
	}
	
	

}
