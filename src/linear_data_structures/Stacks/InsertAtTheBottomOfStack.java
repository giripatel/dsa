package linear_data_structures.Stacks;


import java.util.* ;
import java.io.*;

public class InsertAtTheBottomOfStack
{
    public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x)
    {
   /* Stack<Integer> tempStack = new Stack<>();

    while(!myStack.isEmpty()){
      tempStack.push(myStack.pop());
    }
    tempStack.push(x);
    while(!tempStack.isEmpty()){
      myStack.push(tempStack.pop());
    }

    return myStack; */
        if(myStack.isEmpty()){
            myStack.push(x);
            return myStack;
        }
        int num = myStack.pop();
        pushAtBottom(myStack,x);
        myStack.push(num);

        return myStack;
    }
}
