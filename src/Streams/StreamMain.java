package Streams;

public class StreamMain {

	public static void main(String[] args) {
		FunctionalInterfaceEx fun = new FunctionalInterfaceEx(){
		 
			@Override
			public void abstractMethod() {
				System.out.print("i am inside body");
			}
		
		}; // () this brackets represents the we are calling the method..
		FunctionalInterfaceEx fun1 =() -> System.out.println("i am inside body of");
		fun1.abstractMethod();// here we are calling method...
	}
}
