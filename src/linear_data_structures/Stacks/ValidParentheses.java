package linear_data_structures.Stacks;

import  java.util.*;
class ValidParentheses {
//    public static void main(String[] args) {
//        isValid("()[]{}");
//    }
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            } else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((ch == ']' && top != '[') || (ch == '}' && top != '{') || (ch == ')' && top != '(')){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}