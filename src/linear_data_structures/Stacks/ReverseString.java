package linear_data_structures.Stacks;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "Giri";
        StringBuilder reverseStr = new StringBuilder();
        for (int i = 0; i < str.length(); i ++) {
            stack.push(str.charAt(i));
        }

        System.out.println(stack);
        while (!stack.isEmpty()){
            reverseStr.append(stack.pop());
        }

        System.out.println(reverseStr);
    }
}
