package Letsdoit;
import java.io.*;
import java.util.*;
/*class Point{
	int x; 
	int y;
}*/
class Hello{
	public static void main(String [] args) {
		/*
		 * System.out.println("hello prakash"); int age = 1; String name =
		 * "Shivarathri Prakash"; double height = 5.2; System.out.println(age);
		 * System.out.println(name); System.out.println(height);
		 */
		
		// variable and data types
		/*
		 * boolean isValid = true; byte marks = 90; float pi = (float) 3.14; float fiv =
		 * 15.0f/4.0f; long views = 1000000000; char gender = 'M';
		 */
		/*
		 * Point p1 = new Point(); p1.x=10; Point p2 = new Point(); p2.y=20;
		 * System.out.println(p1.x); System.out.println(p2.y);
		 */
		
		// Operators
		
		/*
		 * int x =10 , y=20; // binary operators System.out.println(x+y);
		 * System.out.println(x-y); System.out.println(x*y); System.out.println(x/y);
		 * 
		 * int z = (x+y*10);
		 * 
		 * System.out.println(z); // unary operators z = x++; System.out.println(z + " "
		 * + x); z = ++x; System.out.println(z + " " + x);
		 */
		
        // compound operators
//	    int x =10, y=5,z;
//	    x += y;
//	    System.out.println(x);
//	    x %= y;
//	    System.out.println(x);
//	    z=x=y;
//	    System.out.println(z);
  
		// logical operator
//		String user = "geeks", pwd = "GEEK";
//		Scanner sc= new Scanner(System.in);
//		
//		String iu = sc.next();
//		String ip = sc.next();
//		if(user.equals(iu)&& pwd.equals(ip)) {
//			System.out.println("Welcome");
//		} else {
//			System.out.println("Try it again");
//		}
////
//    boolean x = false, y = false;
//    System.out.println(x && y);
//    System.out.println(x || y);
//    System.out.println(!x);
		
		// short circuiting 
//		String s = "prakash";
//		if(s != null && s.length()<100) {
//			System.out.println("Invalid");
//		}else {
//			System.out.println("valid");
//		}
		
		// Relational operators
//		
//		int x =10, y=20;
//		System.out.println(x==y);
//		System.out.println(x != y);
//		System.out.println(x < y);
//		System.out.println(x > y);
//		System.out.println(x <= y);
//		System.out.println(x >= y);
    
		
		// If else 
		// Given a number n , find if the number is even or odd
//		      Scanner sc = new Scanner(System.in);
//		      System.out.println("PLEASE ENTER THE NUMBER");
//		      int n = sc.nextInt();
//		      if(n % 2 == 0) {
//		    	  System.out.println("Given number is even");
//		      }else {
//		    	 System.out.println("Given number is odd"); 
//		      }
		
 // Take a number n from user, print sum of first
// n natural numbers, if user enter a negative , throw error and exit
		
//		Scanner sc = new Scanner(System.in);
//        System.out.println("PLEASE ENTER THE NUMBER");
//	     int n = sc.nextInt();
//	     if(n<0) {
//	    	 System.out.println("Invalid Input");
//	      return ;
//	     }
//	     System.out.println(n*(n+1)/2);

		// check positive and negative no. and also find whether it is even or odd
//		 Scanner sc = new Scanner(System.in);
//         System.out.println("PLEASE ENTER THE NUMBER");
//         int n = sc.nextInt();
//         if(n>0) {
//        	 System.out.println("It is positve number");
//        	 if(n % 2 == 0) {
//        		 System.out.println("it is a even number");
//        	 }else {
//        		 System.out.println("It is a odd number");
//        	 }
//         }else if(n < 0){
//        	 System.out.println("It is a negative number");
//        	 if(n % 2==0) {
//        		 System.out.println("It is a even number");
//        	 }else {
//        		 System.out.println("It is odd number");
//        	 }
 //        }
         
//		int x =10, y=0;
//		System.out.println("Enter a move");
//		Scanner sc = new Scanner(System.in);
//		char move = sc.next().charAt(0);
//		switch(move){
//		case 'L':
//			x--;
//			break;
//		case 'R':
//			x++;
//			break;
//		case 'U':
//			y++;
//			break;
//		case 'D':
//			y--;
//			break;
//		default:
//			System.out.println("INVALID");
//			
//		}
//   	 System.out.println(x+" "+y);
		
	// Looping 
//		for(int i=0; i<5;i++) {
//			System.out.println("PRAKASH");
//		}
		
	//	int i =0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
//		do {
//			System.out.println(i);
//		}while(i <10);
//		
//		
//		for(int i=0; i<5;i++) {
//			if(i==3) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		int i;
//		for( i=0; i<5;i++) {
//			if(i==3) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println(i);
		
//		for(int i =0; i<2; i++) {
//			for(int j =0; j<2; j++) {
//				if(j==1)
//					break;
//				System.out.println(j);
//			}
//		}
//		for(int i =0; i<2; i++) {
//			for(int j =0; j<2; j++) {
//				if(j==1)
//					continue;
//				System.out.println(j);
//			}
//		}
	}
}