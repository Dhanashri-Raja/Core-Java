package com.demo;
public class Pattern1 {
		    void printT(int n) {
		        for(int i=1;i<=n;i++) {         //rows
		            for(int j=1;j<=i;j++) {     //col
		                //System.out.print("* ");
		               // System.out.print(i+" ");
		                System.out.print(j+" ");
		            }
		            System.out.println();
		        }
		    }
		    public static void main(String[] args) {
		        Pattern1 p=new Pattern1();
		        
		        p.printT(2);
		        System.out.println("****");
		        p.printT(3);
		        System.out.println("****");
		        p.printT(4);
		    }
		}

