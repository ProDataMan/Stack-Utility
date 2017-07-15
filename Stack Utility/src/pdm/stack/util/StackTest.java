package pdm.stack.util;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
@Test
public void isEmptyTest(){
	Stack stack = new Stack();
	boolean result = stack.isEmpty();
	assertTrue("Developer do your job!", result);
}
}
