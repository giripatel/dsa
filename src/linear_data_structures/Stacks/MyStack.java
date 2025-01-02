package linear_data_structures.Stacks;

public class MyStack {

    int size;
    int top;
    int[] stack;
    public  MyStack(int size){
        this.size = size;
        this.stack = new int[size];
        this.top = 0;
    }

    public void push(int item){
        if (top == size){
            System.out.println("Stack is full");
            return;
        }
        stack[top] = item;
        top ++;
    }

    public int peek(){
        return stack[top -1];
    }

    public int pop(){
        if (top == 0){
            System.out.println("Stack is empty");
        }
        int item = stack[top -1];
        stack[top -1] = 0;
        return  item;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = size -1; i >= 0; i--){
            stringBuilder.append(stack[i]).append("\n");
        }

        return  stringBuilder.toString();
    }

}
