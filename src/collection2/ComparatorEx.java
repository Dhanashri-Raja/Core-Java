package collection2;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	 String sname;
	private int sid;
	 LocalDate sdob;
	public Student(String sname, int sid, LocalDate sdob) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sdob = sdob;
	}
	@Override
	public String toString() {
		return "Studen [sname=" + sname + ", sid=" + sid + ", sdob=" + sdob + "]";
	}
	
}
class SortName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.sname.compareTo(o2.sname);
	}
	
}
class Sortbydob implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.sdob.compareTo(o2.sdob);
	}
	
}
public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<Student> alist=new ArrayList<>();
		alist.add(new Student("Dhana",1,LocalDate.of(2004,001, 20)));
		alist.add(new Student("Shri",2,LocalDate.of(2003,003, 30)));
		alist.add(new Student("oRajan",3,LocalDate.of(2004,001, 24)));
		alist.add(new Student("Sirisha",4,LocalDate.of(2004,011, 13)));
		System.out.println("AList"+ alist);
		Collections.sort(alist,new SortName());
		Collections.sort(alist,new Sortbydob());

		for(int i=1;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
	}

}
