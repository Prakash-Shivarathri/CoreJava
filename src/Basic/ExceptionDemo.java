package Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            // below statement may throw an FileNotException
            Scanner sc = new Scanner(new File("testfile.in"));
            //if everything goes will below the statement would be executed
            // if an exception is occured in previous statement,
            // below statement would not be executed
            System.out.println("Exist main()");
        }
        // error handling separated from the main logic
        catch(FileNotFoundException E){
            System.out.println("File Not Found caught ....");
            /*
             if the file cannot be found , the exception is caught in the catch-block.
            In some situation, you may need to perform some clean-up operation,
            or open another file instead.
             */
        }
        //Optional
        // always run regardless of exception status...
        finally {
            System.out.println("finally-block run regardless of the state of exception");
        }

    //RuntimeException Demo
    //unchecked..
    int a,b,sum;
        try{
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            sum = a+b;
            System.out.println("Addition is "+sum);

        }catch (ArrayIndexOutOfBoundsException E){
            System.out.println("Insufficient nos.");
        }

    }
}
