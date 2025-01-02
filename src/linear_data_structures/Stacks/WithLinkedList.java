package linear_data_structures.Stacks;

import java.util.LinkedList;

public class WithLinkedList {
    private LinkedList stack;
    private  int top;

    public WithLinkedList(){
        this.stack = new LinkedList();
    }

    public void push(int item){
        stack.push(item);
    }

    public int pop(){
        return (int)stack.pop();
    }

    public int peek(){
        return (int)stack.peek();
    }

    public boolean isEmtpy(){
        return stack.size() == 0;
    }

    public String toString(){
        return this.stack.toString();
    };
}
