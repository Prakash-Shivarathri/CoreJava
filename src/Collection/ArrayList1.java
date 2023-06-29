package Collection;
import java.util.*;
public class ArrayList1 {

//	public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//       //add method....
//        list.add("prakash");
//        list.add("Prashanth");
//        list.add("Venkatesh");
//      //  System.out.println(list);
//        list.add(1,"Shivarathri");
//      //  System.out.println(list);
//// check whether the element is present or not
//        System.out.println(list.contains("prakash"));
//        
//        
//   // remove function using index and using the object..
//    System.out.println(list.remove(0));
//    System.out.println(list.remove("Prashanth"));
		
// get method
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(10);
// get method -> using the index
	//	System.out.println(list.get(0));
// set method -> passing the index and value...
	//	System.out.println(list.set(3, 100));
    //System.out.println(list);
	
// indexof method-> by passing the value..
// this gives the index of first occurence of element..
		//System.out.println(list.indexOf(10));
// lastIndexOf -> this method gives the last of occurence of element..
		//System.out.println(list.lastIndexOf(10));
//isEmpty -> Returns true if this list contains no elements
		//System.out.println(list.isEmpty());
// clear() func is  used to remove elements in the array
		//list.clear();
		//System.out.println(list.isEmpty());
	
		// ArrayList Traversal...
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
  // another method...
//		for(int i:list) {
//			System.out.println(i);
//		}
		
		// using the iterator -> traversal elements..
//       Iterator<Integer> iterator = list.iterator();
//       while(iterator.hasNext()) {
//    	   System.out.println(iterator.next());
//       }	
		
		//removing the  elements using the iterator method...
//		Iterator<Integer> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			int x = iterator.next();
//			if(x < 10) {
//				iterator.remove();
//			}else {
//				System.out.println(x);
//			}
//		}
//		
//		for(int i=0; i<list.size(); i++) {
//			int x = list.get(i);
//			list.set(i,x*3);
//		}System.out.println(list);
		
	// lIST OF SMALLER ELEMENTS...
//		int k = 20;
//		Iterator<Integer> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			int x = iterator.next();
//			if(x>k) {
//				iterator.remove();
//			}else {
//				System.out.println(x);
//			}
//		}
		

//	}
	static List<Integer> getSmaller(int[] arr, int k){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<k) {
				list.add(arr[i]);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		List<Integer> list = getSmaller(arr,40);
		for(Integer x : list) {
			System.out.println(x);
		}
	}

}
