package Streams;
//import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// working of streams and lambda
public class StreamExample {
 
	public static void main(String[] args) {
		
		// {1,2,3,4,5,6,7,8,9,10} -> arr/list
		// filter -> even num from the list -> 2,4,6,8,10
		// square the num -> 4,16,36,64,...
		// print it or need to sum of this list
		// get the list of square of num
		
		//iterative method...
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = 0;
		for(int i=0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				sum+= list.get(i)*list.get(i);
			}
		}
		System.out.println("sum after the iterative manner is : " +sum);
		
		
// Declarative manner -> declare first what we are trying to do
		
		// stream is nothing but it will be provide the sequence of objects..
		// Stream -> does not change anything it will be take the input and provide to functions r methods..
		//
//		List <Integer> num = list.stream().filter(( (Stream<Integer>) new Predicate<Integer>(){
//			@Override
//			public boolean test(Integer integer) {
//				return integer%2==0;
//			}
//		}).map(new Function<Integer,Integer>(){
//
//			@Override
//			public Integer apply(Integer integer) {
//				return integer*integer;
//			}
//			
//	}).collect(Collectors.toList());
				//reduce(new BinaryOperator<Integer> () {
//			@Override
//			public Integer apply(Integer integer, Integer integer2) {
//				return integer+integer2;
//			}
//		});
//				reduce(0,new BinaryOperator<Integer>() {
//			
//			@Override
//			public Integer apply(Integer integer,Integer integer2) {
//				return integer+integer2;
//			}
//		})
	  //System.out.println("sum after the declarative manner is" + num);
	}
}



// concurrency-> which gives a feeling it is happening (parallely)
// parallelism->which happens parallely..