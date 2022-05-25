package org.constructor;

public class ICICIBank extends AxisBank {
	public ICICIBank(String name) {
		
		System.out.println("parameterized constructor");
	}
	public ICICIBank() {
this("Boopathy");	
System.out.println("Non parameterized constructor"); 
	}
public static void main(String[] args) {
	ICICIBank i=new ICICIBank();
	
	
}
}
