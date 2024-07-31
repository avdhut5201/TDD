package Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class StackTest {
    MyStack myStack;

   @BeforeEach
    public  void setUp() throws  Exception{
       myStack=new MyStack();

   }


    @Test
    public void newStack_isEmpty() throws Exception{
        assertTrue(myStack.isEmpty());

    }
    @Test
    public  void AfetrOnepush_StackIs_NotEmpty() throws Exception{
        myStack.push(10);
        assertFalse(myStack.isEmpty());
    }

    @Test
    void willThrowUnderflow_WhenEmptyStackisPopped() throws  Exception {
        assertThrows(MyStack.Underflow.class, () -> {
            myStack.pop();
        });
    }

    @Test
    public  void After_OnePush_OnePop_StackWillBe_Empty() throws  Exception{
       myStack.push(0);
       myStack.pop();
       assertTrue(myStack.isEmpty());

    }

    @Test
    public  void After_TwoPush_OnePop_StackWillBe_NotEmpty() throws  Exception{
        myStack.push(0);
        myStack.push(10);
        myStack.pop();
        assertFalse(myStack.isEmpty());

    }

    @Test
    public  void PushX_PopX() throws  Exception{
       myStack.push(99);
       assertEquals(99, myStack.pop())  ;
        myStack.push(98);
        assertEquals(98, myStack.pop())  ;

    }
    @Test
    public void pushTwice_PopTwice() throws Exception{
        myStack.push(99);
        myStack.push(98);
        assertEquals(98, myStack.pop())  ;
        assertEquals(99, myStack.pop())  ;


    }
}
