package org.bank;

public class AxisBank extends Bankinfo{
	public void deposit() {
		super.deposit();
		System.out.println("Axis Bank Deposit info");
	}
	
	public static void main(String[] args) {
		AxisBank ab= new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();
	}
}
