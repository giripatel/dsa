package linear_data_structures.Queues;

import java.util.Stack;

public class QueueWithStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueWithStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void add(int item){
        stack1.add(item);
    }

    public int remove(){

        if (stack2.isEmpty() && stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
           return stack2.pop();
    }

//    public Stack toString(){
//        return sta
//    }
}
