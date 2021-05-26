package dspractice.tree.bst;

public class Appliaction {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(3);
		tree.insert(10);
		tree.insert(-22);
		tree.insert(5);
		tree.insert(2);
		
		tree.traverseInOrder();
	}

}
