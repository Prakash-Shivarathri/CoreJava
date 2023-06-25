package Basic;

import java.util.Scanner;

//Given an array A of N elements. The task is to count number of even and odd elements in the array.
public class CountEvenAndOdd {
    static void CountOddEven(int arr[], int n){
//        int EvenCount = 0;
//         int OddCount = 0;
//         for(int i =0 ; i<n;i++){
//             if(arr[i] % 2 == 1){
//                 OddCount++;
//             }else{
//                 EvenCount++;
//             }
//         }
        int EvenCount = 0;
        for(int i =0 ; i< arr.length; i++) {
            if (arr[i] % 2 == 0)
                EvenCount++;
        }System.out.print((n-EvenCount)+" "+EvenCount);
    }

    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int sizeof_array = sc.nextInt();
            int arr[] = new int[sizeof_array];
            for(int i =0 ; i< sizeof_array;i++){
                arr[i] = sc.nextInt();
            }
 // creating the object of the class...
        CountEvenAndOdd c = new CountEvenAndOdd();
            c.CountOddEven(arr,sizeof_array);

    }
}
