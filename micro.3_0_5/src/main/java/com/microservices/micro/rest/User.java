package com.microservices.micro.rest;

public class User {

	Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	String FirstName=null;
    public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String validate() {
		return "Not yet implemented";
	}
	
	public String toString() {
		StringBuffer usertoString=new StringBuffer();
		usertoString.append(" Id " +this.id +" " );
		usertoString.append(" FirstName " +this.FirstName +" " );
		usertoString.append(" LastName " +this.LastName +" " );
	 return usertoString.toString();	
	}

	String LastName=null;
    String PhoneNumber=null;
    String Address=null;
	
}
