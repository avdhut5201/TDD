package Test;

public class MyStack {
    private boolean isEmpty=true;
    private  int []element=new int[2];
    private  int size=-1;


    public boolean isEmpty() {
        return  size == -1;
    }

    public void push(int element) {
        size++;
        this.element[size]=element;


    }

    public int pop() {
        if (isEmpty())
            throw  new Underflow();
        return element[size--];
    }

    public  class Underflow  extends  RuntimeException{
    }
}
