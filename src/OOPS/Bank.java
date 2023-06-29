package OOPS;

public interface Bank {
 // static and  public under the interface , we must declare
	
	//String getBankName();
//	public static String getBankName();
	
	static String getFuncBody() {
		return "Inside interface method body";
	}
	
	default String getFuncDefaultBody() {
		return "Inside Default interface method body";
	}
	
    // upi , netbanking
	interface UPIBankDetails{
		String getUPIBankName();
	}
	interface NetBanking{
		String getNetbankingBankName();
	}
	// inside an interface everything should be public
	

}

// after  java 8
// static and default
// interface extends -> other interface
//interface implements -> other class ->not possible