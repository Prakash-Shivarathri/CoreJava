package Collections;
import java.util.*;
public class IntersectionProblem {
    static void intersection(int a[], int b[]) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i <b.length ; i++){
            list.add(b[i]);
        }
        for(int i = 0 ;i<a.length; i++){
            if(list.contains(a[i])){
                System.out.print(a[i]+ " ");
            }
        }
    }
    public static void main(String[] args){
        int a[] = {10,15,20,25,30,50};
        int b[] = {30,5,15,80};
        intersection(a,b);
    }
}
