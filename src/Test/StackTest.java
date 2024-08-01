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


    @Test // This one is from video
    public void newStack_isEmpty() throws Exception{
        assertTrue(myStack.isEmpty());

    }
    @Test // This too
    public  void AfetrOnepush_StackIs_NotEmpty() throws Exception{
        myStack.push(10);
        assertFalse(myStack.isEmpty());
    }

    @Test //This too
    void willThrowUnderflow_WhenEmptyStackisPopped() throws  Exception {
        assertThrows(MyStack.Underflow.class, () -> {
            myStack.pop();
        });
    }

    @Test //This too
    public  void After_OnePush_OnePop_StackWillBe_Empty() throws  Exception{
       myStack.push(0);
       myStack.pop();
       assertTrue(myStack.isEmpty());

    }

    @Test //This too
    public  void After_TwoPush_OnePop_StackWillBe_NotEmpty() throws  Exception{
        myStack.push(0);
        myStack.push(10);
        myStack.pop();
        assertFalse(myStack.isEmpty());

    }

    @Test //This too
    public  void PushX_PopX() throws  Exception{
       myStack.push(99);
       assertEquals(99, myStack.pop())  ;
        myStack.push(98);
        assertEquals(98, myStack.pop())  ;

    }
    @Test // This one I have wrote it myself, In last two tests we did achieved the LIFO ,
         // but it was partial in this one I have completely achieved it  //
    public void pushTwice_PopTwice() throws Exception{
        myStack.push(99);
        myStack.push(98);
        assertEquals(98, myStack.pop())  ;
        assertEquals(99, myStack.pop())  ;


    }


    @Test //This one is also designed by me although I feel redundant
    void willThrowUnderflow_WhenEmptyStackisPeeked() throws  Exception {
        assertThrows(MyStack.Underflow.class, () -> {
            myStack.peek();
        });
    }

    @Test // This too is designed by me
    void Peek_the_top_element() throws  Exception {
       myStack.push(10);
       myStack.push(20);
       assertEquals(20,myStack.peek());
    }


}
