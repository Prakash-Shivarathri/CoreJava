package StreamsExamples;
import java.util.*;
import java.util.stream.*;
public class StreamClass {
    public static void main(String[] args){
//        The Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
//        The features of Java stream are –
//        A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
//        Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
//                Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.

               // creating the list using the asList()
//        List<Integer> list = Arrays.asList(5,10,20,30,40,8,7);
//        // Taking the list as a source
//        // Applying stream
//        // filtering out the even numbers
//        // filtering out the numbers > 10
//        // Printing the list
//        // :: -> method refference...
//        list.stream().filter(x -> x%2==0).filter(x-> x>10).forEach(System.out::println);

        // sum of the array...
  //      int arr[] = {30,10,40,50};
//        int sum = Arrays.stream(arr).sum();
    // max value from array..
       // int max = Arrays.stream(arr).max().getAsInt();
        // Averay of array
    //    double avg = Arrays.stream(arr).average().getAsDouble();
     //   System.out.println(avg);


  // Print first n natural numbers with given digit d..

//  Stream.iterate(1,x->x+1)
//          .filter(x->x.toString().contains("5"))
//          .limit(10)
//          .forEach(System.out::println);

        //Print String that begin with "a" and end with "c", in lexicographic order.
//        String arr[] = {"abc","cde","acd","ace","xyy"};
//        Arrays.stream(arr)
//                .filter(x->x.startsWith("a"))
//                .filter(x->x.endsWith("c"))
//                .sorted()
//                .forEach(System.out::println);
        Student arr[] = {
                new Student(110,"PRAKASH",70),
                new Student(111,"Prshanth",70),
                new Student(112,"Venkatest",90),
        };
//        double result = Arrays.stream(arr)
//                .mapToInt(x->x.getMarks()) //maptoint is used for the convert the non-premitive data into premitive data
//                .average()
//                .getAsDouble();
//        System.out.println(result);

//        Map<Integer,String> m = Arrays.stream(arr)
//                .collect(Collectors.toMap(
//                        Student::getRoll,
//                        Student::getName
//                ));
//        System.out.println(m); // out.put ->{112=Venkatest, 110=PRAKASH, 111=Prshanth}

        Map<Integer,List<Student>> m =
                Arrays.stream(arr)
                        .collect(Collectors.groupingBy(
                                Student::getMarks
                        ));
        for(Map.Entry<Integer,List<Student>> ent: m.entrySet())
        {
            List<Student> ls= ent.getValue();
            System.out.print(ent.getKey()+": ");

            ls.stream()
                    .forEach(x -> System.out.print("{"+x.getRoll()+", "+x.getName()+", "+x.getMarks()+"} "));

            System.out.println();
        }

   }
}
