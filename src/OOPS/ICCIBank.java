package OOPS;

public class ICCIBank implements Bank, Bank.NetBanking{

	public String getBankName() {
		return "ICCI";
	}
	@Override
	public String getNetbankingBankName() {
		return "icci-netbanking";
	}
 
	
}
