package org.task1;

public class AxisBank {
	public AxisBank() {
System.out.println("Axis Bank");
	}
	public AxisBank(String name) {
		this();
		System.out.println("Client name is:"+name);
	}
	public AxisBank(int id) {
		this("yaroo");
		System.out.println("Client id is:"+id);
	}
	
	public AxisBank(String name, int id) {
		this(1234567);
System.out.println("Client name is:"+name+"\n"+"Client id is:"+id);
	}
	public AxisBank(double phone) {
		this("Alagi", 345678);
		System.out.println("Client phone is:"+phone);
	}

}
