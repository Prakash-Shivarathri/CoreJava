package OOPS;

public class SBIBank implements Bank, Bank.UPIBankDetails{

	public String getBankName() {
		return BankName.SBI.name();
	}
	public String getBankName1() {
		
		return BankName.ICICI.name();
	}
	
	@Override
	public String getUPIBankName() {
		return BankName.SBI_UPI.name();
	}

}
//public class BankDetailsClass extends AbstractBank, AbstractBank2{
//
//@Override
//public String getBankName() {
//	// TODO Auto-generated method stub
//	return null;
//}
//
//@Override
//public String getAccNo() {
//	// TODO Auto-generated method stub
//	return null;
//}
//}



// class interface
// class class
// interface  class
// interface interface