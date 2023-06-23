package LambdaExamples;
import java.net.CookieHandler;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AnonymousClassExample {
 // Anonymous class -> ntg but we cannot provide methods and creating classes
    static void printCond(Collection<Integer> C, Predicate<Integer> p){
        for (Integer x: C){
            if(p.test(x))
                System.out.print(x+" ");
        }
    }
    public static void main(String[] args){
        Predicate<Integer> myPredEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x%2==0;
            }
        };
        List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
        printCond(al,myPredEven);
    }
}
