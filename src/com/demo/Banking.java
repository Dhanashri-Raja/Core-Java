package com.demo;
import java.util.Scanner;
		class Bank
		{
			private int accno;
			private String name;
			private int pswd;
			private String conc;
			private double balance;
			
			public Bank(int a1,String n1,int p1,String c1,double b1)
			{
				accno=a1;
				name=n1;
				pswd=p1;
				conc=c1;
				balance=b1;
			}
			public int getAccNo()
			{
				return accno;   
			}
			public String getName()
			{
				return name;
			}
			public void setName(String n1)
			{
				 name=n1;
			}
			public int getPswd()
			{
				return pswd;
			}
			public void setPswd(int p1)
			{
				pswd=p1;
			}
			public String getConc()
			{
				return conc;
			}
			public void setConc(String c1)
			{
			   conc=c1;
			}
			public double getBalance()
			{
				return balance;
			}
			public void setBalance(double b1)
			{
				balance=b1;
			}

		 public double withdraw()
		 {
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter your account no.:");
			 int ac=sc.nextInt();

			 if(ac==accno)
			 {
				System.out.println("enter the password:");
				int pass=sc.nextInt();

				if(pswd==pass)
				{
				 System.out.println("enter amount to withdraw:");
				 int wd=sc.nextInt();
				  if(balance>=wd)
				  {
				 	balance=balance-wd;
				 	System.out.println("Remaining balance is:"+balance);
				  }
				  else 
				  {
				 	System.out.println("enter valid amount");
				  }
				}
				else 
				System.out.println("Enter valid Password");
			  }
			  else 
			  {
			  	System.out.println("enter valid account number");
			  }
			  return balance;
			}

		public double deposite()
		 {
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter your account no.:");
			 int ac=sc.nextInt();

			 if(ac==accno)
			 {
				System.out.println("enter amount to deposite:");
				 int ds=sc.nextInt();
				 balance=balance+ds;
				 System.out.println("Your total balance is:"+balance);
				  
			}
				else 
				System.out.println("Enter valid account no");
			 
			  return balance;
			}
			public double checkbalance()
		   {
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter your account no.:");
			 int ac=sc.nextInt();

			 if(ac==accno)
			 {
			  System.out.println("Your current balance is:"+balance);
			 }
				else 
				System.out.println("Enter valid account no");
			 
			  return balance;
			}

			public int changepswd()
		   {
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter your account no.:");
			 int ac=sc.nextInt();

			 if(ac==accno)
			 {
		      System.out.println("Enter your old password:");
			  int pass=sc.nextInt();

			   if(pass==pswd)
			   {
			   System.out.println("Enter your new password:");
			   int npswd=sc.nextInt();
			   pswd=npswd;
			   System.out.println("Your new password is:"+pswd);
			   }
			   else 
			   {
			   	System.out.println("Enter valid password");
			   }
			 }
		     else 
			   System.out.println("Enter valid account no");
			    
			 return pswd;
		  }
		}





		public class Banking {

			public static void main(String[] args) {
				Bank b1=new Bank(1234,"ABC",123,"9876543218",10000);
				   //b1.withdraw();
				  	//b1.deposite();
				  	//b1.checkbalance();
				  	//b1.changepswd();
				   for( ; ; )
				   {
				    System.out.println("1.Withdraw money");
				    System.out.println("2.Deposite money");
				    System.out.println("3.Check current balance");
				    System.out.println("4.Change Password");
				    System.out.println("5.Exit");
					  Scanner sc=new Scanner(System.in);
					  System.out.println("enter your choice:");
				    int ch=sc.nextInt();

				    switch(ch)
				    {
				      case 1:
				    	     b1.withdraw();
				    	     System.out.println();
				    	break;
				    	case 2:
				    	     b1.deposite();
				    	     System.out.println();
				    	break;
				    	case 3:
				    	     b1.checkbalance();
				    	     System.out.println();
				    	break;
				    	case 4:
				    	     b1.changepswd();
				    	     System.out.println();
				    	break;
				    	case 5:System.out.println("Exit...."); 
		        	    System.exit(0);
				    }
				    }
				  }
		}