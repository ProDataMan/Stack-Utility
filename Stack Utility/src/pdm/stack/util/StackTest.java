package pdm.stack.util;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class StackTest {
	Stack stack;
	@Before
	public void setup() {
		stack = new Stack();	
	}
@Test
public void isEmptyTest(){
	
	boolean result = stack.isEmpty();
	assertTrue("True if Empty", result);
}
@Test
public void pushTest(){
	String expected = "Item 1";
	boolean actual = stack.push(expected);
	assertTrue("Shoult get " + expected, actual);
}
@Test
public void peekTest(){
	String expected = "Item 1";
	stack.push(expected);
	String actual = stack.peek();
	assertEquals(expected, actual);
}
@Test
public void popTest(){
	String expected = "Item 1";
	stack.push(expected);
	String actual = stack.pop();
	assertEquals(expected, actual);
}
@Test
public void pushPopIsEmtpyTest(){
	String expected = "Item 1";
	stack.push(expected);
	stack.pop();
	boolean result = stack.isEmpty();
	assertTrue("Shoult get false", result);
}

}
