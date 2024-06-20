package com.demo;
class Amster{
	public int countAn(String s){
		
		String str=s.toLowerCase();
		int cnt=0;
		String a[]=str.split(" ");
		for(int i=0;i<a.length;i++) {
			if(a[i].equals("am")) {
				cnt=cnt+1;
			}
		}
		return cnt;
	}
}
public class InAmsterdan {

	public static void main(String[] args) {
		Amster an=new Amster();
		int count1=an.countAn("I Am in amsterdan am I");
		System.out.println(count1);

	}

}
