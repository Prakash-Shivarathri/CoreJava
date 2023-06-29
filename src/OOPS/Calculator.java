package OOPS;

public class Calculator {

	int sum(int a, int b) {
		return a+b;
	}
	int sum(int a, int b, int c) {
		return a+b+c;
	}
	// overloading then method name should be the same but the parameters in the constructor is different...
	// what exactly it means data type of the parament should not be same in case equal of equal parameters...
	
//	String sum(int a, int b) {
//		return a+b; // here it will be throwing the error...
//		// replace by the string in int in that case it will not throw the erro
//	}
	String sum(String a, String b) {
		return a+b;
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.sum(1,2));
	}
}
