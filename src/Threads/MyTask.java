package Threads;

public class MyTask implements Runnable{
    @Override // previous the we have extend from thread that is not asked to implements the run() methods

    public void run() {
     System.out.println("I am inside the Mytask run method body");
    }
}
