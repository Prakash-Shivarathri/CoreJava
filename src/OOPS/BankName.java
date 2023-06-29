package OOPS;

public enum BankName {
     
	ICICI("icici", 10, true), ICICI_NETBANKING("ICI",12,true), SBI("sbi",13,false),
	SBI_UPI("upi", 14,true);
	String val;
	
	int bankId;
	
	boolean isActivate;
	
	BankName(String val, int bankId, boolean isActivate){
		this.val=val;
		this.bankId = bankId;
		this.isActivate = isActivate;
	}
	
}

// enum is used foe the constants...
// public class BankName extends Enum internally
// objects are getting used a lot of times
// in memory, database ?