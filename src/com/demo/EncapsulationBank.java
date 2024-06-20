package com.demo;

class BankAcc{
	private double accBal;
	private int accNum;
	private String holderName;
	
	  //1.Create paramerterized constructor
	  //2.Generate getter method
	
	public BankAcc(double accBal, int accNum, String holderName) {
		super();
		this.accBal = accBal;
		this.accNum = accNum;
		this.holderName = holderName;
	}

	 public void deposit(double amount) {
			 accBal=accBal+amount;	
}
	 public double withdraw(double amount)
	 {
		 if(accBal<amount) {
			 return 0;
		 }
		 accBal=accBal-amount;
		 return amount;
	 }

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public int getAccNum() {
		return accNum;
	}
	
	public String getHolderName() {
		return holderName;
	}
		   
	 }
	 
public class EncapsulationBank {

	public static void main(String[] args) {
		BankAcc ba=new BankAcc(9500,3421, "Dhanashri");
		ba.deposit(3000);
		System.out.println(ba.getAccBal());
		ba.withdraw(14000);
		System.out.println(ba.getAccBal());
		
	}

}
