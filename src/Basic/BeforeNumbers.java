package Basic;

import java.util.Scanner;

public class BeforeNumbers {
    public static void main(String[] args){
        System.out.println("enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1 ; i< n ; i++){
            System.out.println(i);
        }
    }
}
