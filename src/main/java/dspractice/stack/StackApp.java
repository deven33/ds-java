package dspractice.stack;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(10);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		while(!stack.isEmpty()) {
			long value = stack.pop();
			System.out.println(value);
		}
		
		//reverse a string using Stack
		reverseString("devendra");
		
		
	}

	public static void reverseString(String string) {
		String rev = null;
		int size = string.length();
		Stack stack = new Stack(size);
		for(int i=0; i< size ;i++) {
			char ch = string.charAt(i);
			stack.push(ch);
		}
		
		while(! stack.isEmpty()) {
			char ch=(char) stack.pop();
			System.out.print(ch);
		}
		
	}
}
