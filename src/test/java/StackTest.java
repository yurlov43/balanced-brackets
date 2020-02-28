import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void size() {
        Stack stack = new Stack<Integer>();
        Assert.assertEquals(stack.size(), 0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(stack.size(), 3);
    }

    @Test
    public void pop() {
        Stack stack = new Stack<Integer>();
        Assert.assertEquals(stack.pop(), null);
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(stack.size(), 2);
        Assert.assertEquals(stack.pop(), 2);
        Assert.assertEquals(stack.pop(), 1);
        Assert.assertEquals(stack.size(), 0);
    }

    @Test
    public void push() {
        Stack stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(stack.size(), 2);
    }

    @Test
    public void peek() {
        Stack stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        Assert.assertEquals(stack.size(), 2);
        Assert.assertEquals(stack.peek(), 20);
        Assert.assertEquals(stack.size(), 2);
    }
}