package pdm.stack.util;

import java.util.ArrayList;

public class Stack {
	ArrayList<String> stack; 
public Stack() {
	this.stack = new ArrayList<String>();
}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.stack.isEmpty();
	}

	public boolean push(String expected) {
		// TODO Auto-generated method stub
		return this.stack.add(expected);
	}
	public String peek() {
		// TODO Auto-generated method stub
		return stack.get(0);
	}
	public String pop() {
		// TODO Auto-generated method stub
		String result = stack.get(0);
		stack.remove(0);
		return result;
	}

}
