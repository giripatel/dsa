package linear_data_structures.Stacks;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

//        stack.forEach(integer -> {
//            System.out.println(integer);
//        });

        System.out.println(stack);
    }
}
