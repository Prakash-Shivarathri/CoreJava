package ExceptionHandling;

public class M {

	public static void main(String[] args) {
		System.out.println("Hello world !");
		
		// without catch we can use the try block
		// using the finally key word but we cannot
		// handle the exception, it is not a compile time
		// error or run time error....
		try {
			String str = "abc";
			int num = Integer.parseInt(str);
			System.out.println(num);
			}catch(NullPointerException numberFormatException) {
				System.out.println("I'm in the null pointer exception");
			}
		   catch(NumberFormatException numberFormatException) {
				System.out.println("I'm in catch block");
			}catch(Exception e) {
				e.printStackTrace();
			}
		  finally {
				System.out.println("I'm in finally block");
			}
	}

}
