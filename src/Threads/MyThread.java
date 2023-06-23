package Threads;

import java.util.Scanner;

public class MyThread extends Thread{

    @Override
    public void run(){
            System.out.println("Im inside the run method of thread");
            System.out.println("Enter your names : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next()); // util the user give the input this thread so into waiting..
    }
}
