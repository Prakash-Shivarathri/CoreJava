package Collections;

import java.util.*;
class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    public  CustomStack(){
        this(DEFAULT_SIZE);
    }

    // intializing the constructor...
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        // if the array may be full , we are accessing the element of outofindex
        if(isfull()){
            System.out.println("Stack is empty");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws Exception {
        // if the array may be full , we are accessing the element of outofindex
        if(isempty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        // int simple terms...
        return data[ptr--];
    }
    public int peek() throws Exception {
        if(isempty()){
            throw new Exception("Cannot peep from an empty stack");
        }
        return data[ptr];
    }

    // check the stack is full or not;
    public boolean isfull(){
        return ptr == data.length-1;
    }
    // check the stack is empty or not;
    public boolean isempty(){
        return ptr == -1;
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);
        stack.push(25);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}