package OOPS;

public class Encapsulation {
    private String Name;
    private int PhoneNumber;
    private int Age;
    
    // if we want access the private variables 
    // we need create the getters and setters...
    
    public int getAge() {
    	return Age;
    }

	public String getName() {
		return Name;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}
	
	public void setName(String name) {
		Name = name;
	}


	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public void setAge(int age) {
		Age = age;
	}
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		// SET VALUES TO THE VARIABLES
		e.setAge(21);
		e.setName("Prakash Shivarathri");
		e.setPhoneNumber(910008210);
		//Display values of the variable
		System.out.println("My name is"+ e.getName()+", I'm"+e.getAge()+"old, my phone is "+e.getPhoneNumber());
	}
}
