package me.njsim;

public class Agent extends Person{

	private String phoneNumber; //Did it as a string cause it could contain (, ), -
	private double commissionRate;
	
	
	public Agent(String FirstName, String LastName, String PhoneNumber, Double CommissionRate) {
		super(FirstName, LastName);
		phoneNumber = PhoneNumber;
		commissionRate = CommissionRate;
	}
	
	public String getPhoneNumber() { //Retrives the objects phone number.
		return phoneNumber;
	}
	public void setPhoneNumber(String PhoneNumber) { //Sets the objects phone number.
		phoneNumber = PhoneNumber;
	}
	
	public double getCommissionRate() { //Retrives the objects phone number.
		return commissionRate;
	}
	public void setCommissionRate(double CommissionRate) { //Sets the objects phone number.
		commissionRate = CommissionRate;
	}
	
	   @Override
	    public String toString() {
	        return "Agent{" +
	                "First Name='" + getFirstName() + '\'' +
	                "Last Name='" + getLastName() + '\'' +
	                "PhoneNumber='" + phoneNumber + '\'' +
	                 "CommisionRate='" + commissionRate + '\'' +
	                '}';
	    }
		@Override
		public String display() {
			// TODO Auto-generated method stub
		     return "Customer{" +
	         "Agent First Name='" + getFirstName() + '\'' +
	         "Agent Last Name='" + getLastName() + '\'' +
	         "Phone Number='" + phoneNumber + '\'' +
	         ", Commission='" + commissionRate + '\'' +
	         '}';
		}

}
