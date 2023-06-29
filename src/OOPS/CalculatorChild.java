package OOPS;

public class CalculatorChild extends Calculator  {

	int sum(int a, int b) {
		return a-b;
	}
	int multiply(int a, int b) {
		return a*b;
	}
	int multiply(int a, int b, int c) {
		return a*b*c;
	}
	
	public static void main(String[] args) {
		CalculatorChild c = new CalculatorChild();
		System.out.println(c.sum(10, 10));
		
		Calculator calculator = new CalculatorChild();
		System.out.println(calculator.sum(10, 10));
		
     Calculator calculator1 = new CalculatorChild(); // -> upcasting
     Calculator calculator2 = (Calculator) calculator1; // -> downcasting
	}
}

// reference Variable of parent -- object of child -- is know as the Upcasting(it called the child class method onlt)
// parent  child
// parent-reference -> parent-object-Yes
// child-reference -> child-object-Yes
// parent-reference -> child-object-Yes
// child -reference-> parent-object -no 
// -51:08