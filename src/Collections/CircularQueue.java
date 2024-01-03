package Collections;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public  CircularQueue(){
        this(DEFAULT_SIZE);
    }

    // intializing the constructor...
    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front];
        front = front % data.length;
        size--;
        return removed;
    }

    public int headElement() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display(){
        if(isempty()){
            System.out.println("Queue is empty");
        }
        int i = front;
       do{
           System.out.print(data[i]+"<-");
           i++;
           i %= data.length;
       } while(i != end);
       System.out.println("END");
    }

    // check the stack is full or not;
    public boolean isfull(){
        return size == data.length;
    }
    // check the stack is empty or not;
    public boolean isempty(){
        return size == 0;
    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
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
