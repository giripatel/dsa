package linear_data_structures.Stacks;

import java.util.* ;
import java.io.*;

public class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> s) {
        //Write your code here
        if(s.isEmpty()){
            return s;
        }

        int num = s.pop();
        sortStack(s);
        insertAtBottom(s,num);

        return s;
    }

    public static Stack<Integer> insertAtBottom(Stack<Integer> s, int x){
        if(s.isEmpty()){
            s.push(x);
            return s;
        }
        if(s.peek() <= x){
            s.push(x);
            return s;
        }

        int num = s.pop();
        insertAtBottom(s,x);
        s.push(num);

        return s;
    }
}


