package org.task1;

public class SbiBank extends SyndicateBank {
	public SbiBank() {
		super(567890d);
		System.out.println("SBI Bank");
		
	}
	public SbiBank(String name) {
		this();
		System.out.println("Employee name is:"+name);
	}
	public SbiBank(int id) {
		this("America");
		System.out.println("Employee id is:"+id);
	}
	public SbiBank(String name, int id) {
		this(456789);
		System.out.println("Employee name is:"+name+"\t"+"Employee id is:"+id);
	}
	public SbiBank(double phone) {
		this("Antartica", 456789);
		System.out.println("Employee phone no. is:"+phone); 
	}
	public static void main(String[] args) {
		SbiBank s=new SbiBank(4567878d);
	}
}
