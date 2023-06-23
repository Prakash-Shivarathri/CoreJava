package Threads;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setName("Thread-0");
        myThread.start();// start method itself called as run method..
        // daemon threads -> java runs by self->lowest priority -> garbage collector
        // Operation doing by user thread -> high priority  / normal priority
        // Operation doing by the garabage collection thread -> lowest priority -> background

        // Relation between main function and main thread

        // this is the 2nd way of the creating the thread using the runnable interface...
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();//we can start thread only once otherwise it will be throw the exception because the it deals with OS..
       // thread.start();

        // join method->
        myThread.join();
        //main class -> myThread and myTask until they get completed..
        // means in myThread class 1st myTask is should be completed then after mythread shoud have to completed
        // it should not be possible because they should have the internal relationship between them like parent and child relationship..

        System.out.println("done from thread "+ Thread.currentThread());

    }
}
