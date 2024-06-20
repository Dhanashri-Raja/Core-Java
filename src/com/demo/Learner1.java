package com.demo;

public class Learner1 {
	String sname;
	int sroll;
	public Learner1() {   //Default constructor
		sname="dhanashri";
		sroll=20;
		System.out.println("Default parameter:");
		System.out.println("student roll no:"+sroll);
		System.out.println("student name:"+sname);
	}
	public Learner1(int sroll, String sname){  //parametrized contructor
		 this.sname=sname;
		this.sroll=sroll;
		System.out.println("parameterized parameter:");
		System.out.println("student roll no:"+sroll);
		System.out.println("student name:"+sname);
	}
	public Learner1(Learner1 l) //copy constructor
	{
		sroll=l.sroll;
		sname=l.sname;
		
		System.out.println("copy constructor parameter:");
		System.out.println("student roll no:"+sroll);
		System.out.println("student name:"+sname);
	}
	  
	    public static void main(String[] args) {
	    	Learner1 l=new Learner1();
	    	Learner1 li = new Learner1();
			Learner1 l3 = new Learner1();
		
	    }
}
	    
	     

		

	


