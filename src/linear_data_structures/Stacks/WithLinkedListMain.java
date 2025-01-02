package linear_data_structures.Stacks;

import java.util.LinkedList;

public class WithLinkedListMain {
    public static void main(String[] args) {
       /* WithLinkedList stack = new WithLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        System.out.println(stack.isEmtpy());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack); */

        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.push(7);
        list.pop();

        System.out.println(list);
    }
}
