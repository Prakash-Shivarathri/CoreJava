package Collections;
import java.util.*;
// linkedhastset which is inherited from the hashset, it will be implements the collectons
// and it will implements the all the avaiable methods in the hashset
//but one advantage in the linkedhashset is it print the output in insertion order this is due to  it internally maintain the doublelinkedlist unlike the hashset..
public class LinkedHashSets {
    public static void main(String[] args){
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(20);
        list.add(20);
      //  for(Integer i : list){
            System.out.println(list+" ");
      // }
    }
}
