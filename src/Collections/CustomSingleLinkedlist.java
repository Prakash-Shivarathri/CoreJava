package Collections;

public class CustomSingleLinkedlist {

    private Node head;
    private Node tail;
    private int size;

    public CustomSingleLinkedlist(){
        this.size = 0;
    }
    // insert the element in linkedlist
    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }
    public void insertAtLast(int val){
        if(tail == null){
            insert(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int val , int index){
        if(index ==  0){
            insert(val);
            return;
        }
        if(index == size){
            insertAtLast(val);
            return;
        }
        // here we need to create the temporay node that point to head
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    // delete the head element...
    public int  deleteHead(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    // delete the tail element...
    public int deleteTail(){
        if(size <= 1){
            return deleteHead();
        }
        Node SecondLastnode = getIndex(size-2);
        int val = tail.value;
        tail = SecondLastnode;
        tail.next = null;
        size--;
        return val;
    }
    // delete the element at particular indexes...
    public int deleteAtIndex(int index){
        if(index == 0){
            return deleteHead();
        }
        if(index == size-1){
            return deleteTail();
        }
        Node preNode = getIndex(index-1);
        int val = preNode.next.value;
        preNode.next = preNode.next.next;
        size--;

        return val;
    }
    // get the last 2nd index  for deleting the last node 
    public Node getIndex(int val){
        Node node = head;
        for(int i=0; i<val; i++){
            node = node.next;
        }
        return node;
    }
    //find the index of the give element..
    public Node findIndex(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.value+"->");
            // we need to assign temp to next object
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        int value;
        Node next;

        public  Node(int value){
            this.value = value;
        }
        public  Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String args[]) {
        CustomSingleLinkedlist list = new CustomSingleLinkedlist();
        list.insert(2);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insertAtLast(1);
        list.insertAtIndex(3,2);
        list.display();
        // list.deleteHead();
        // System.out.println(list.deleteTail());
        //System.out.println(list.deleteAtIndex(3));
        System.out.print(list.findIndex(3));
        list.display();

    }
}
