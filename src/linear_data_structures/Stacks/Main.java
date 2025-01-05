package linear_data_structures.Stacks;

public class Main {
    public static void main(String[] args) {

        // MIN STACK

        MinStackON minStackON = new MinStackON();

        minStackON.push(1);
        minStackON.push(2);
        minStackON.push(3);
        minStackON.push(4);

//        System.out.println(minStackON.getMin());
//        System.out.println(minStackON.peek());
//        System.out.println(minStackON.pop());
        System.out.println(minStackON);
      /*  MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);

//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        System.out.println(stack); */

    }
}
