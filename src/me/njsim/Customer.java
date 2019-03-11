package me.njsim;

import java.util.Objects;


public class Customer extends Person {
    private String CustAddress;
    private String CustCity;
    private String CustProv;
    private String CustPhone;

    public Customer(String FirstName, String LastName, String custAddress, String custCity, String custProv, String custPhone) {
        super(FirstName, LastName);
        CustAddress = custAddress;
        CustCity = custCity;
        CustProv = custProv;
        CustPhone = custPhone;
    }

    public Customer(String custFirstName, String custLastName) {
        this(custFirstName, custLastName, "unknown", "Calgary", "AB", "not set");
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public void setCustAddress(String custAddress) {
        CustAddress = custAddress;
    }

    public String getCustCity() {
        return CustCity;
    }

    public void setCustCity(String custCity) {
        CustCity = custCity;
    }

    public String getCustProv() {
        return CustProv;
    }

    public void setCustProv(String custProv) {
        CustProv = custProv;
    }

    public String getCustPhone() {
        return CustPhone;
    }

    public void setCustPhone(String custPhone) {
        CustPhone = custPhone;
    }

/*
    @Override
    public String getFirstName() {
        String customFirstName = super.getFirstName();
        return "First Name:" + customFirstName;
    }
*/

    public String makePhonebookName(String fname, String lname)
    {
        return lname + ", " + fname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getFirstName().equals(customer.getFirstName()) &&
                getLastName().equals(customer.getLastName()) &&                          getCustAddress().equals(customer.getCustAddress()) &&
                getCustCity().equals(customer.getCustCity()) &&
                getCustProv().equals(customer.getCustProv()) &&
                getCustPhone().equals(customer.getCustPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustAddress(), getCustCity(), getCustProv(), getCustPhone());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "First Name='" + getFirstName() + '\'' +
                "Last Name='" + getLastName() + '\'' +
                "CustAddress='" + CustAddress + '\'' +
                ", CustCity='" + CustCity + '\'' +
                ", CustProv='" + CustProv + '\'' +
                ", CustPhone='" + CustPhone + '\'' +
                '}';
    }

	@Override
	public String display() {
		// TODO Auto-generated method stub
	     return "Customer{" +
         "First Name='" + getFirstName() + '\'' +
         "Last Name='" + getLastName() + '\'' +
         "CustAddress='" + CustAddress + '\'' +
         ", CustCity='" + CustCity + '\'' +
         ", CustProv='" + CustProv + '\'' +
         ", CustPhone='" + CustPhone + '\'' +
         '}';
	}
}
