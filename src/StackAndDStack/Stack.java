package StackAndDStack;

public class Stack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        if (top==5){
            System.out.println("stack is full");

        }
        stack[top] = data;
        top++;

    }

    public int pop()
    {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;

    }
    public boolean isEmpty() {
        return top<=0;
    }



    public void show() {
        for (int n : stack) {
            System.out.println(n);
        }
        System.out.println();
    }

    public int peak() {
        int data;
        data = stack[top - 1];
        return data;
    }
    public int size() {
    return top;
    }
}
