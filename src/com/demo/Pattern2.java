package com.demo;

public class Pattern2 {
	static void printPattern(int n) {
        int rowCount = 1;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("s");   //space
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
        }
	}

	public static void main(String[] args) {
			 Pattern2.printPattern(6);	
		        }
}

//public class Source {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        Source s=new Source();
//        s.printPattern(a);
//        s.printPattern(b);
//        s.printPattern(c);
//    }
//     void printPattern(int n) {
//        int i, j;
//        for (i = 1; i <= n; i++) {
//            for (j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (j = 1; j <= i; j++) {
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }
//    }
//}


