package com.medicine;

public class Medicine{
	public void displayLabel(){
	System.out.println("Company : 1mg Pharma");
	System.out.println("Address : New Delhi");
	}
	}
class Tablet extends Medicine{
	 
public void displayLabel(){
	System.out.println("store in a cool dry place");
	}
}
class Syrup extends Medicine{
	public void displayLabel(){
	System.out.println("Consumption as directed by thephysician");
	}
	}
class Ointment extends Medicine{
	public void displayLabel(){
	System.out.println("for external use only");
}
}