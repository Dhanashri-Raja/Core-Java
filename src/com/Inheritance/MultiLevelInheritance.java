package com.Inheritance;
class Shape{
	void display(){
		System.out.println("Inside display");
	}
}
class Rectangle extends Shape{
	public void area() {
		System.out.println("Inside of area");
	}
}
class triangle extends Rectangle{
	public void volume() {
		System.out.println("Inside of Triangle");
	}
}
		
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Shape sh=new Shape();
		sh.display();
		triangle tri=new triangle();
		tri.area();
		tri.display();
		tri.volume();
	}

}
