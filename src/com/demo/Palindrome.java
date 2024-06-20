package com.demo;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
			do{
			System.out.println("Enter 1 for Sting ");
			System.out.println("Enter 2 for Value ");
			System.out.println("Enter 3 for Exit");
			System.out.println("Enter you choose");
			int ch=s.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter any string : ");
			    String str = s.next();
			    String rev = "";
			    
			    for(int i=str.length()-1;i>=0;i--)
			    {
			        rev=rev+str.charAt(i);
			    }
			   
			    if(str.equals(rev))
			    {
			        System.out.println("given string is palindrome.");
			    }
			    else 
			    {
			        System.out.println("string is not palindrome.");
			    }
			    break;
			case 2:
				 System.out.println("Enter any number : ");
			     int a=s.nextInt();
			     int num=a;           
			     int lastd=0,rev1=0;
			     while(num>0)
			     {
			         lastd=num%10;
			         rev1=rev1*10+lastd;
			         num=num/10;
			     }
			    
			     if(a==rev1)
			     {
			         System.out.println("given number is palindrome.");
			     }
			     else 
			     {
			         System.out.println("given number is not palindrome.");
			     }
			     break;
			case 3: System.exit(0);
			     
			}
      }while(true);
		}
	}



	
