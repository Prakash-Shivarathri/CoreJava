package Basic;

// Application of Function
//-> Avoid code redundancy and Ease Maintenance..
//-> make code modular.. takeinput , processdata, producoutput
//-> Abstraction(for example, in library functions we do not have to worry about internal working..
//->Aoid variable name collisions..

public class FunctionEaxmple {
    public static void main(String[] args){
//        System.out.println("Before the function...");
//         fun1();// calling the function which is declare outside of the main method..
//        System.out.println("after the execution function1...");
        // Calling the Add method..
//        AddNumber();
//        AddNumber();
        // getmax value and call the func
//        int x=10, y=100;
//       System.out.println(getMax(x,y));

        //
        //primitive data type it's not referencce to some memory location,it's use the actual value
        int x = 5;
        fun(x);
        System.out.println(x);

    }
//    public static void fun1(){
//        // Creating function...
//        System.out.println("Inside function1...");
//        fun2();
//        System.out.println("after the execution of function2");
//    }
//    public static void fun2(){
//        System.out.println("Inside the function2");
//    }

    // adding the values using the func..
//    public static void AddNumber(){
//        int num1=5, num2=5;
//        System.out.println(num1+num2);
//    }

    // getMax value passing the parameters..

//    public static int getMax(int x, int y){
//        if(x > y){
//            return  x;
//        }else {
//            return  y;
//        }
//    }

    public static void fun(int x){
        x = x+5;
    }
}
