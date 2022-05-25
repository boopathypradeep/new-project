package org.t2constructor;

public class DiamondBank2 extends DutcheBank1{
	public DiamondBank2() {
		super(34567);
		System.out.println("DiamondBank");
	}
	public DiamondBank2(int id) {
		this();
		System.out.println("Bank id:"+id);
			}

}
