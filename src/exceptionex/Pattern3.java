package exceptionex;
import java.util.Scanner;
class Pattern{
	void patt(int n) {	
		int i,j;
	for(i=1;i<=n;i++) {
		for(j=1;j<=n-i;j++){
			System.out.print(" ");
		}
		for(j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}
}
public class Pattern3 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int a,b,c;
	 a=sc.nextInt();
	 b=sc.nextInt();
	 c=sc.nextInt();
	 Pattern pt=new Pattern();
	 pt.patt(a);
	 pt.patt(b);
	 pt.patt(c);
		
	}
}