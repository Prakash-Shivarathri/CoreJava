package OOPS;

public interface BankDetails2 {
	
	

	static String getFuncBody() {
		return "Inside interface method body";
	}
	default String getFuncDefaultBodys() {
		return "Inside Default interface method body";
	}
}
