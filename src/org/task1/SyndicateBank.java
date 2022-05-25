package org.task1;

public class SyndicateBank extends AxisBank{
	public SyndicateBank() {
super(1234567d);
		System.out.println("Syndicate Bank");

	}

	public SyndicateBank(String name) {
		this();
		System.out.println("Employee name is:" + name);
	}

	public SyndicateBank(int id) {
		this("Pradeep");
		System.out.println("Employee id is:" + id);
	}

	public SyndicateBank(String name, int id) {
		this(67890);
		System.out.println("Employee name is:" + name + "\t" + "Employee id is:" + id);
	}

	public SyndicateBank(double phone) {
		this("Boopathy", 45678);
		System.out.println("Employee phone no. is:" + phone);
	}
}
