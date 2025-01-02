package linear_data_structures.Stacks;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);

//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        System.out.println(stack);

    }
}
