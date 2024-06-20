package threadprogram;

class Thread3 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);

		}

	}
}
class Process implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.println("even number " + i);
			}
		}
	}
}
class Thread4 implements Runnable{

	@Override
	public void run() {
		int n=5,i,j;
		int count=1;
		for(i=n;i<0;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=count;j++) {
				System.out.print(count+" ");
			}
			System.out.println();
			count++;
		}
	}
	
}
public class ThreadUsingInterface {

	public static void main(String[] args) {
	    Thread3 t3=new Thread3();
	    Thread t=new Thread(t3);
        t.start();
        Process p=new Process();
        Thread t1=new Thread(p);
        t1.start(); 
        Thread4 t4=new Thread4();
        Thread t2=new Thread(t4);
        t2.start();
        
}
}

