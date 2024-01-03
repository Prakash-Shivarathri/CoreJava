package Collections;

import java.util.*;
class CustomQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    public  CustomQueue(){
        this(DEFAULT_SIZE);
    }

    // intializing the constructor...
    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }
    public int remove() throws Exception {
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        // shift the elements to left
        for(int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int headElement() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for(int i=0 ; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }

    // check the stack is full or not;
    public boolean isfull(){
        return end == data.length;
    }
    // check the stack is empty or not;
    public boolean isempty(){
        return end == 0;
    }

    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(21);
        queue.insert(22);
        queue.insert(23);
        queue.insert(24);
        queue.insert(25);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}