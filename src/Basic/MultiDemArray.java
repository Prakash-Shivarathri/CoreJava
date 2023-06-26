package Basic;

import java.util.Scanner;

public class MultiDemArray {
    public static void main(String[] args){
//        int arr[][] = {{1, 2, 3},
//                {4, 5, 6}};
//
//        for(int i = 0; i < arr.length; i++)
//        {
//            for(int j = 0; j < arr[i].length; j++)
//            {
//                System.out.print(arr[i][j] + " ");
//            }
     //   }
//
//        int arr[][] = {{1, 2, 3, 8, 9},
//                {4, 5, 6}};
//
//        for(int i = 0; i < arr.length; i++)
//        {
//            for(int j = 0; j < arr[i].length; j++)
//            {
//                System.out.print(arr[i][j] + " ");
//            }
//        }


//        int m = 2, n = 3;
//
//        int arr[][] = new int[m][n];
//
//        for(int i = 0; i < arr.length; i++)
//        {
//            for(int j = 0; j < arr[i].length; j++)
//            {
//                System.out.print(arr[i][j] + " ");
//            }
//        }

//
//        int m = 2, n = 3;
//
//        int arr[][] = new int[m][n];
//
//        for(int i = 0; i < arr.length; i++)
//        {
//            for(int j = 0; j < arr[i].length; j++)
//            {
//                arr[i][j] = 10;
//
//                System.out.print(arr[i][j] + " ");
//            }
//        }


        //Jagged Array - user specified
//        int m = 3;
//
//        int arr[][] = new int[m][];
//
//        for(int i = 0; i < arr.length; i++)
//        {
//            arr[i] = new int[i + 1]; // size
//
//            for(int j = 0; j < arr[i].length; j++)
//            {
//                arr[i][j] = i;
//
//                System.out.print(arr[i][j] + " ");
//            }
//
//            System.out.println();
//        }


        // Taking the input fromt the user...

        int numItiems; // initializing the array size
        int [] items;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items : ");
        numItiems = sc.nextInt();
        items = new int[numItiems];
        if(numItiems>0)
        {
            System.out.println("Enter the value of all items (separated by spaces):");

            for(int i=0; i<numItiems; i++)
            {
                items[i] = sc.nextInt();
            }
        }
        System.out.print("The values are [");

        for(int i=0; i<numItiems; i++)
        {
            if(i==0)
            {
                System.out.print(items[0]);
            }
            else
            {
                System.out.print(", " + items[i]);
            }
        }

        System.out.println("]");
        sc.close();

        //iteration of array using the for loop
        int[] numbers = {8, 2, 6, 4, 3};
        int sum = 0, sumSq = 0;

        double mean, stdDev;

        for(int i=0; i<numbers.length; i++)
        {
            sum += numbers[i];
            sumSq += numbers[i] * numbers[i];
        }

        mean = (double)sum / numbers.length;
        stdDev = Math.sqrt( (double)sumSq / numbers.length - mean*mean);

        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);
    }
}
