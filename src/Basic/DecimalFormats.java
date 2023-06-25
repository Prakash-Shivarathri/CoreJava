package Basic;

import java.util.Scanner;
import java.text.DecimalFormat;
public class DecimalFormats {
    static void printInFormat(float x, float y){
        float output = x/y;
        // task to print the decimalvalues upto 3
        // one method...
        System.out.format("%.3f", output);
        //another method.....
        DecimalFormat ft = new DecimalFormat(".####");
        System.out.println( ft.format(output));
    }
    public static void main(String[] args){
        // taking the input from the user using the scanner class
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        DecimalFormats d = new DecimalFormats();
        d.printInFormat(x,y);


    }
}
