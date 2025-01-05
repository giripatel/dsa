package linear_data_structures.Stacks;

import java.util.Stack;

public class MinStackON {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStackON(){
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int item){
        stack.push(item);
        if (minStack.isEmpty()){
            minStack.push(item);
            return;
        }
        if (minStack.peek() > item){
            minStack.push(item);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public int getMin(){
        if (stack.isEmpty()){
            return -1;
        }
        return minStack.peek();
    }

    public int pop(){
        if (stack.isEmpty()){
            return -1;
        }
        minStack.pop();
        return stack.pop();
    }

    public int peek(){
        return stack.peek();
    }

    public String toString(){
        return stack.toString();
    }
}
