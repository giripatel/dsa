package linear_data_structures.Stacks;

import java.util.* ;
import java.io.*;

public class TwoStack {

    int[] array;
    int top1;
    int top2;
    // Initialize TwoStack.
    public TwoStack(int s) {
        // Write your code here
        this.array = new int[s];
        this.top1 = 0;
        this.top2 = array.length -1;
    }

    // Push in stack 1.
    public void push1(int num) {
        // Write your code here
        if(top1 > top2){
            return;
        }
        array[top1] = num;
        top1++;
    }

    // Push in stack 2.
    public void push2(int num) {
        // Write your code here
        if(top1 > top2){
            return;
        }

        array[top2] = num;
        top2--;
    }

    // Pop from stack 1 and return popped element.
    public int pop1() {
        // Write your code here
        if(top1 <= 0) return -1;
        return array[--top1];
    }

    // Pop from stack 2 and return popped element.
    public int pop2() {
        // Write your code here
        if(top2 >= array.length -1) return -1;
        return array[++top2];
    }

}
