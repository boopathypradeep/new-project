package org.constructor;

public class AxisBank {
	public AxisBank(int empId) {
System.out.println("Parent parameterized constructor");	
}
	public AxisBank() {
	this(7890);
System.out.println("Parent Non parameterized constructor"); 
	}

}
