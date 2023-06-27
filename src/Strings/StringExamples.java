package Strings;

public class StringExamples {
    public static void main(String[] args){
//        //creating a string
//        String str = "prakash";
//
//        // no. of character present in the string
//        System.out.println(str.length());
//        // return the character at ith index..
//        System.out.println(str.charAt(3));
//        // substring
//        System.out.println(str.substring(2));
//        // return the substring from i to j-1 index
//        System.out.println(str.substring(2,5));

        //creating two string literals
        String str1 = "geeksforgeeks";
        String str2 = "for";

        // return the 1st occurence of s2 in s1 after index 1
        System.out.println(str1.indexOf(str2));// it only return the -1 and 0
        int result = str1.compareTo(str2);
        if(result==0)
            System.out.println("Same");
        else if (result>0) {
            System.out.println("Str2 is greater");
        } else if (result<0) {
          System.out.println("str1 is smaller");
        }
        // Whether s2 equal to s1
        System.out.println(str1.equals(str2));
        // Whether s2 is present in s1 or not
        // true
        System.out.println(str1.contains(str2));


        // Creating two string literals
//        String s1 = "geeks";
//        String s2 = "geeks";
//
//        // Checking if both point to the
//        // same object or not
//        if(s1 == s2)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//
//        // Creating a string using
//        // new operator
//        String s3 = new String("geeks");
//
//        // Checking if both point to the
//        // same object or not
//        if(s1 == s3)
//            System.out.println("Yes");
//        else
//            System.out.println("No");


        // Creating two string literals
        String s3 = "geeks";
        String s4 = s3;

        // Creates a new object "geeksforgeeks"
        // Now s3 points to this new string
        s3 = s3 + "forgeeks";
        // or
        // s3 = s3.concat("forgeeks");

        System.out.println(s3);

        // Since s4 is still pointing
        // to initial "geeks"
        // and s3 is pointing to a new
        // object "geeksforgeeks"
        System.out.println(s3 == s4);
    }
}
