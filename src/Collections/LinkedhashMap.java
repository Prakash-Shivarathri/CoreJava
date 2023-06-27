package Collections;
import java.util.*;
// map <- hashmap <- linkedHashMap
// this means all properties or methods inherited to the linkedhashmap from the both
// main advantage in linkhashmap we can predict the table of keyvalue pairs and it uses the double linkedlist internally..

public class LinkedhashMap {
   public static void main(String[] args) {
       LinkedHashMap<Integer, String> m
               = new LinkedHashMap<>();

       // Inserting the Elements
       m.put(10, "GfG");
       m.put(20, "IDE");
       m.put(15, "Courses");

       // Removes <20, "IDE">
       m.remove(20);

       // Adding the pair at last
       m.put(20, "Practice");

       // Ordered output
       System.out.println(m);
   }

}
