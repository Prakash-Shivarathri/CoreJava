package Basic;
import java.util.*;
import static java.time.Clock.system;

public class main {
    public static void main(String[] args) {
//            addtition add = new addtition();
//            int s = add.addtwonum(2,3);
//            System.out.println(add);

//        addtition add = new addtition();
//
//        // calling addTwoInt() method to add two integer using instance created
//        // in above step.
//        int s = add.addTwoInt(1,2);
//        System.out.println("Sum of two integer values :"+ add);

//        ArrayStudent[] arr = new ArrayStudent[2];
//        arr[0] = new ArrayStudent(1,"prakash");
//        arr[1] = new ArrayStudent(2,"divya");
//
//        for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i].roll_number+" "+arr[i].name);
//        }

//        int arr[] = {1,2,3};
//        sum(arr);

//        String str = "Prakash";
//        System.out.println(str);
//        String str1 = new String("prakash");
//        System.out.println(str1);

        String str1 = new String("prakash");
        String str2 = new String("Prakash");
        String str3 = new String("PrakashShivarathri");
        String str4 = new String("Prakash");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(Objects.equals(str2, str4));




    }
//    public static void sum(int[] arr){
//        int sum = 0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }
//        System.out.println("sum of the array : "+ sum);
//
//    }
}
