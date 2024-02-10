package stack;

public class MyStack {

    private int numberOfElements;
    private int size;
    private String[] container;

    public MyStack(int size){
        //this.size = size;
        container = new String[size];

    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void push(String element) {
        container[numberOfElements] = element;
        numberOfElements++;
    }


    public String pop() {
        String lastElement = peek();
        --numberOfElements;
        return lastElement;
    }

    public int count() {
        return numberOfElements;
    }

   public String peek() {
       return container[count() - 1];
   }


   public int capacity(){
        return size;
   }
}
