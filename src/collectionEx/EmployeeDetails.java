package collectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class EmployeeList {
	int eNo;
	String eName;
	int eAge;
	double eSalary;

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public EmployeeList(int eNo, String eName, int eAge, double eSalary) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "EmployeeList [eNo=" + eNo + ", eName=" + eName + ", eAge=" + eAge + ", eSalary=" + eSalary + "]";
	}

}

public class EmployeeDetails{

	public static void main(String[] args) {
		List<EmployeeList> c=new ArrayList<EmployeeList>();
		int choice;
		Scanner sc1=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Update");
			System.out.println("4.Search");
			System.out.println("5.Delete");
			System.out.println("6.Count");
			System.out.println("7.Exit");
			System.out.println("Enter Your choice:");
			int ch1;
			choice=sc.nextInt();
			switch (choice) {
			//insertion
			case 1: {
				System.out.println("Enter the Employe no:");
				int eNo=sc1.nextInt();
				System.out.println("Enter the Employee Name:");
				String eName=sc1.next();
				System.out.println("Enter the Employee Age:");
				int eAge=sc1.nextInt();
				System.out.println("Enter the Employee Salary:");
				double eSalary=sc1.nextDouble();
				EmployeeList el=new EmployeeList(eNo, eName, eAge, eSalary);
				c.add(el);
				System.out.println("Employee Details Inserted Successfully!!!");
				System.out.println("------------------------------------------");
				break;
				}
			
			//display
			case 2:{
				System.out.println("---------------------");
                
				Iterator <EmployeeList> i = c.iterator();
                while (i.hasNext()) {
                    EmployeeList e = i.next();
                    System.out.println(e);//toString method
                }
                System.out.println("---------------------");
                break;
			}
			//update
			case 3:{
				System.out.println("Enter the Employe no:");
				int eNo=sc1.nextInt();
				System.out.println("Enter the Employee Name:");
				String eName=sc1.next();
				System.out.println("Enter the Employee Age:");
				int eAge=sc1.nextInt();
				System.out.println("Enter the Employee Salary:");
				double eSalary=sc1.nextDouble();
			}
			//search
			case 4:{
				boolean found = false;
                System.out.print("Enter Empno to Search : ");
                int empno = sc.nextInt();
                System.out.println("---------------------");
                Iterator <EmployeeList> i = c.iterator();
                while (i.hasNext()) {
                    EmployeeList e = i.next();
                    if (e.geteNo() == empno) {
                        System.out.println(e);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Record Not Found");
                }
                System.out.println("---------------------");
                break;
			}
			//Delete
			case 5:{
				boolean found=false;
				System.out.println("Enter the Employe no:");
				int eNo=sc1.nextInt();
				System.out.println("------------------------------------------");
				Iterator<EmployeeList> i=c.iterator();
				while(i.hasNext()) {
					EmployeeList e=i.next();
					if(e.geteNo() == eNo) {
						i.remove();
						found=true;
					}
				}
				if(!found){
					System.out.println("Details are not found");
				}
				else{
					System.out.println("Employee Details deleted Successfully!!!");
				}
				System.out.println("------------------------------------------");
				break;	
			}
			//Count
			case 6:{
				int count=0;
				
			}
			case 7:{
				
			}
			}
		}while(ch!=0);
	}
}
