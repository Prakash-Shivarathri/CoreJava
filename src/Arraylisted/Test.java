package Arraylisted;
import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException
	{
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		System.out.println(al);

//		int n = 5;
//		ArrayList<Integer> arr = new ArrayList<Integer>(n);
//		for(int i = 0; i <= n; i++)
//			arr.add(i);
//
//         System.out.println(arr);
//		 arr.remove(3);
//		 System.out.println(arr);
//
//		 for(int i=0 ; i < arr.size(); i++){
//			 System.out.print(arr.get(i)+ " ");
//		 }

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		System.out.println(l1);

		// creating the another list
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		System.out.println(l2);
		l1.addAll(1,l2);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		// replace or update the values in the list
		l1.set(3,4);
		l1.set(4,5);
		System.out.println(l1);
	}

}
