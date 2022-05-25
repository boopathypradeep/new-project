package org.t2constructor;

import org.t2class.AmmadiBank3;

public class DutcheBank1 extends AmmadiBank3 {
	public DutcheBank1() {
		super.clientId3(23456);
		System.out.println("DutcheBank");
	}
	public DutcheBank1(int id) {
		this();
		System.out.println("Client id:"+id);
	}

}
