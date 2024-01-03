//package Threads;
//import java.util.*;
//import java.util.concurrent.*;
//
//public class ExecutorServicreDemo {
//    public static void main(String[] args) throws  InterruptedException{
//        long startTime = System.currentTimeMillis();
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//       // ExecutorService executorService1 = Executors.newSingleThreadExecutor();
//        ExecutorService executorService2 = Executors.newCachedThreadPool();
//        //something task which get executed after certain time
//        ScheduledExecutorService executorService3 = Executors.newScheduledThreadPool(1);
//        // to execute -> run method
//        // 1 task -> with for loop i have 20 tasks
//        for(int i=0; i<6; i++){
//            executorService.submit(() ->{
//              System.out.println("Task Running in : "+Thread.currentThread().getName());
//              try{
//                  Thread.sleep(10);
//              }catch (InterruptedException e){
//                  throw  new RuntimeException(String.valueOf(0));
//              }
//            });
//        }
//        executorService3.schedule({
//        public void run(){
//                    System.out.println("i want to get executed after 1 sec");
//        }
//        }; 1, TimeUnit.SECONDS);
//        // impr method
//        // shutdown() -> it is type of signal to executorservice that please don't take other task
//        executorService.shutdown();
//        //executorService.shutdownNow(); // -> it will immediately shutdown before task done
//      //  executorService.awaitTermination(TimeUnit.SECONDS);
//        System.out.println("done");
//        Long endTime = System.currentTimeMillis();
//        System.out.println("the complete time of execution was : "+( endTime-startTime));
//      //  executorService.submit(() -> System.out.println("try to have the onemore task"));
//    }
//}
