package linear_data_structures.Stacks;

import java.util.Stack;

public class FindCelebrity {

    public static void main(String[] args) {
        int[][] m = {{0,1,0,1},{0,0,0,1},{0,1,0,1},{0,0,0,0}};
        System.out.println(findCeleb(m));
    }

    private static int findCeleb(int[][] m) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < m.length; i++){
            stack.push(i);
        }
        while (stack.size() != 1) {
            int a = stack.pop();
            int b = stack.pop();
            if (m[a][b] != 1) {
                stack.push(a);
            }else {
                stack.push(b);
            }
        }
        System.out.println(stack);
        int possibleCeleb = stack.peek();
        for(int i = 0; i < m.length; i ++){
            if (m[possibleCeleb][i] == 1) {
                return -1;
            }
        }
        for(int i = 0; i < m.length; i ++){
            if (m[i][possibleCeleb] == 0 && possibleCeleb != i) {
                return -1;
            }
        }

        return stack.peek();
    }
}
