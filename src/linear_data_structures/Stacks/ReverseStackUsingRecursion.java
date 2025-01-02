package linear_data_structures.Stacks;

import java.util.Stack;

public class ReverseStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Before reverse : " + stack);

        reverseStack(stack);

        System.out.println("After reverse : " + stack);

    }

    private static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int num = stack.pop();
        System.out.println(num);
        reverseStack(stack);
        insertAtBottom(stack,num);
    }

    private static Stack<Integer> insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()){
            stack.push(x);
            return  stack;
        }

        int top = stack.pop();
        insertAtBottom(stack,x);
        stack.push(top);

        return  stack;
    }
}
