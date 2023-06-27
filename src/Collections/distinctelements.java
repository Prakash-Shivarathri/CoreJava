package Collections;
import java.util.*;
public class distinctelements {
    static void printDist(int arr[]) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i]) == false) {
                System.out.print(arr[i]+" ");
                list.add(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {10,8,10,10,7};
        printDist(arr);
    }
}
