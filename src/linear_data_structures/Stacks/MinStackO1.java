package linear_data_structures.Stacks;

import java.io.FileReader;
import java.util.Stack;

public class MinStackO1 {
    Stack<Integer> stack = new Stack<>();
    int mini;
    public  MinStackO1() {
        this.stack = new Stack<>();
    }

    public void push(int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            mini = item;
        } else if (mini<item){
            stack.push(item);
        } else {
            int value = 2 * item - mini;
            stack.push(value);
            mini = item;
        }
    }


//    public
}
