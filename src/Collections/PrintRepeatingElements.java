package Collections;
import java.util.*;
public class PrintRepeatingElements {
    static void printrepeating(int arr[]){
        HashSet<Integer> list = new HashSet<>();
        for(int i =0 ; i< arr.length; i++){
            if(list.contains(arr[i]) == true){
                System.out.print(arr[i]+" ");
            }else{
                list.add(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int arr[] = { 10,5,7,10,8,7,8,5};
        printrepeating(arr);
    }
}
