package threadprogram;
class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread "+i);
		}
	}
}
class evenno extends Thread{
	public void run() {
		for(int i=0;i<=30;i++) {
			if(i%2==0) {
				System.out.println("even number  "+i);
			}
		}
	}
}
//class Even extends Thread{
//    int num;
//    public Even(int num) {
//        this.num=num;
//    }
//    public void run() {
//        if(num%2==0) {
//            System.out.println("the number is even");
//        }
//        else {
//            System.out.println("the number is odd");
//        }
//    }
//}
class Factorial extends Thread{
  
  public void run() {
	  int fact=1, n=5;
      for(int i=1;i<=n;i++) {
    	  fact=fact*i;
      }
      System.out.println("factorial is "+fact);
  }
}
public class ThreadUsingInheritance {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		t1.setName("First Thread");
		System.out.println("Thread name is :"+t1.getName());
		t1.setPriority(5);
		System.out.println("priority is "+t1.getPriority());
		System.out.println();
		evenno en=new evenno();
		en.start();
		System.out.println();
		Factorial f=new Factorial();
		f.start();
	}

}
