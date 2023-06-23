package LambdaExamples;
import com.sun.source.doctree.TextTree;

import javax.naming.InsufficientResourcesException;
import java.awt.desktop.SystemEventListener;
import java.util.function.*;

import java.util.*;
import java.util.Collection;
import java.util.function.Predicate;


public class LambdaExample {
//    static void printCond(Collection<Integer> C, Predicate<Integer> P){
//        for(Integer x: C){
//                if(P.test(x)){
//                    System.out.print(x+" ");
//                }
//        }
//
//    }
//    public static void main(String [] args) {
//        List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
//        printCond(al,x-> x%2==10);
//    }

    //Lambda Expression without Parameter
//    static void fun(TEST T){
//        T.print();
//    }
//    public static void main(String[] args){
//        fun(() -> System.out.print("Hello world"));
//    }

    //Lambda Expression single Parameter

//    static void fun(TEST T , Integer p){
//        T.print(p);
//    }
//    public static void  main(String[] args){
//        fun(p -> System.out.print(p),10);
//    }

    //Lambda Expression multiple Parameter
//    static void fun(TEST T, Integer p1, Integer p2){
//        T.print(p1,p2);
//    }
  //  public static void main(String[] args) {
//        fun((p1, p2) -> System.out.print(p1+p2),10,20);
//    }

        //Sorting according to the coordinates...
//    Points arr[]={new Points(10,20), new Points(5,30), new Points(30,40)};
//
//	    Arrays.sort(arr,(p1,p2) -> p1.x - p2.x);
//
//	    for(int i=0;i<arr.length; i++)
//    {
//        System.out.println(arr[i].x+" "+arr[i].y);
//    }
//
//}

        // without Method Refference.... in Lambda...
        public static void main (String[]args){
            // without Method Refference.... in Lambda...
//       List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
//       list.forEach(x -> System.out.println(x));

            // with Method Refference.... in Lambda...

            // Program using String reference Method:
//       String a[] ={"Prakash","Prashanth","Venkatesh"};
//       String b[] ={"PRAKASH","PRASHANTH","VENKATESH"};
//
//       if(Arrays.equals(a,b))
//           System.out.println("Yes");
//       else
//           System.out.print("No");

            //   Program using Static Method Reference
//       List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
//       list.forEach(LambdaExample, printSquare);
//   }
//   public static void printSequare(Integer X){
//       System.out.println(X*X);


            //Program using String Lambda Expression /
            String a[] = {"Prakash", "Prashanth", "Venkatesh"};
            String b[] = {"PRAKASH", "PRASHANTH", "VENKATESH"};

            if (Arrays.equals(a, b, (X1, X2) -> X1.compareToIgnoreCase(X2)))
                System.out.println("Yes");
            else
                System.out.print("No");
        }

    }

