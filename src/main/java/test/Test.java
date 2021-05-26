package test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import dspractice.list.linkedlist.singlelylinkedlist.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("de","dev","deveb","frg");
	Employee emp = new Employee("dev", "lName", 1);
	Employee emp2 = new Employee("dev2", "lName", 7);
	Employee emp3 = new Employee("dev1", "lName", 6);
	Employee emp4 = new Employee("dev6", "lName", 4);
	Set<Employee> set = new TreeSet<Employee>();
	set.add(emp);
	set.add(emp2);
	set.add(emp3);
	set.add(emp4);
	
	}

}
