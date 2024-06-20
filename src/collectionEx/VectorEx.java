package collectionEx;

import java.util.Vector;
import java.util.Enumeration;
public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
	v.add(40);
	v.addFirst(68);
	v.addLast(10);
	v.add(32);
	System.out.println("Th vector are:"+v);
	System.out.println("Traversal using Enumeration");
    Enumeration<Integer> e = v.elements();
    while (e.hasMoreElements()) {
       System.out.print(e.nextElement()+"  ");
    }
	}

}
