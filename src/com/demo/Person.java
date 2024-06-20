package com.demo;
//encapsulation example

public class Person {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
	 Person p=new Person();
	 p.setId(1);
	 p.setName("Dhanashri");
	 System.out.println("Id is :"+p.getId()+"name is :"+p.getName());

	}

}
