package org.bankinfo;

import org.t2abs.ThirupathiBank3;

public class BankInfo extends ThirupathiBank3 {

	@Override
	public void savings3() {
System.out.println("savings interest is:6%");		
	}

	@Override
	public void deposits3() {
		this.savings3();
		System.out.println("Deposits interest is:7%");		
		
	}

	@Override
	public void fixed2() {
		this.deposits3();
		System.out.println("fixed interest is:8%");		
		
	}

	@Override
	public void recuring2() {
		this.fixed2();
		System.out.println("Recuring interest is:9%");		
		
	}

	@Override
	public void current1() {
		this.recuring2();
		System.out.println("current interest is:10%");		
		
	}

	@Override
	public void savings1() {
		this.current1();
		System.out.println("savings1 interest is:11%");		
		
	}

	@Override
	public void clientName6() {
		this.savings1();
System.out.println("client Name is:Aravind");		
	}

	@Override
	public void clientId6() {
		this.clientName6();
		System.out.println("client id6 is:5679");		
	}

	@Override
	public void empName6() {
		this.clientId6();
		System.out.println("Employee Name6 is:Boopathy Pradeep");		
	}

	@Override
	public void empId6() {
		this.empName6();
		System.out.println("Employee id is:456789");		
	}

	@Override
	public void bankName5() {
		this.empId6();
		System.out.println("Bank Name is:Eddho orru Bank");		
	}

	@Override
	public void bankId5() {
		this.bankName5();
		System.out.println("Bank id is:9876456");		
	}
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.bankId5();
	}

}