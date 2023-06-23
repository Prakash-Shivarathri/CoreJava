package LambdaExamples;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WithoutLambda {
       // functional interface is an interface , that interface allows the only one abstreact method
    // Predicate is predefined function in the lambda expression..
    static void printCond(Collection<Integer> C, Predicate<Integer> P){
        for(Integer x: C){
            if(P.test(x))
                System.out.print(x+" ");
        }
    }
    public static void main(String[] args){
        class MyPredicateEven implements Predicate<Integer> {
            public boolean test(Integer x){
                return x%2==0;
            }
        }
        List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
        printCond(al, new MyPredicateEven());
    }
}
