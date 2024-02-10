package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {


    @Test
    public void confirmMyStackIsEmptyTest(){
        MyStack myStack = new MyStack(2);
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void pushX_stackIsNotEmptyTest(){
        MyStack myStack = new MyStack(2);
        myStack.push("x");
        assertFalse(myStack.isEmpty());
    }

   @Test
    public void pushX_popX_stackIsEmptyTest(){
        stack.MyStack myStack = new stack.MyStack(2);
        myStack.push("x");
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void pushXY_popY_stackIsNotEmptyTest(){
        MyStack myStack = new MyStack(2);
        myStack.push("x");
        myStack.push("y");
        myStack.pop();
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void getNumberOfElementInStack(){
        MyStack myStack = new MyStack(2);
        myStack.push("X");

        assertEquals(1, myStack.count());

    }

    @Test
    public void pushXToStack_numberOfElementIsOneTest(){
        MyStack myStack = new MyStack(3);
        myStack.push("x");
        assertEquals(1,myStack.count());
    }

    @Test
    public void pushX_peekXTest(){
        MyStack myStack = new MyStack(2);
        myStack.push("X");

        assertEquals("X",myStack.peek());

    }



}