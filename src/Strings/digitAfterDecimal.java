package Strings;

public class digitAfterDecimal {
    static String digit(String no){
        int pos = no.indexOf('.');
        if(pos<0)
            return "";
        else
            return no.substring(pos+1);//after . we need numbers
    }
    public static void main(String args[]){
        String no = "12.5135";
        System.out.println(digit(no));
    }
}
