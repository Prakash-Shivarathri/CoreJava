package Strings;
import java.util.*;

//StringBuilder -> it is a mutable class,if we are using singlethread then we use the StringBuilder
//StringBuffer ->it is a mutable and also it is a threadsafe,if we are using the multi-thread then we use the stringBuffer..
public class StringBuilderAndStringBuffer {
    public static  void main(String[] args){
//        String str1 = "prakash";
//        String str2 = str1;
//        str1=str1+"shivarathri";//like concat
//        if(str1==str2)
//            System.out.println("it is a same");
//        else
//            System.out.println("it is not a same");
//
//        //using the string builder-> single thread
//
//        StringBuilder st1= new StringBuilder("prakash");
//        StringBuilder st2= st1;
//        st1=st1.append("Shivarathri");
//        if(st1==st2)
//            System.out.println("it is a same");
//        else
//            System.out.println("it is a not same");
        // StringBuilder or StringBuffer class
        StringBuilder sb = new StringBuilder("dcba");

        // Reversing the StringBuilder
        sb.reverse();
        System.out.println(sb);

        // Appending to sb
        sb.append("efg");
        System.out.println(sb);

        // Replacing the character at 1
        // with h
        sb.setCharAt(1, 'h');
        System.out.println(sb);

        // Delete the characters at 0, 1
        sb.delete(0, 2);
        System.out.println(sb);

        // Inserts "efg" at 1
        sb.insert(1, "efg");
        System.out.println(sb);

    }
}
