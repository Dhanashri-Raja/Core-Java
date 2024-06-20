package com.Inheritance;
class DefaultChild{
	public void display(int a) {
		System.out.println("Display of default child:"+a);
	}
}
class DefaultDemo {
	int b=30;
	public void Main() {
		System.out.println("hello:"+b);
	}
}
public class DefaultClass {

	public static void main(String[] args) {
		DefaultChild dc=new DefaultChild();
		DefaultDemo dd=new DefaultDemo();
		dc.display(60);
		dd.Main();

	}

}
