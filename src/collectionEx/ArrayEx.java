package collectionEx;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayEx {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
		arr.add("Dhana");
		arr.addFirst("Sri");
		arr.add(1,"thrisha");
		arr.isEmpty();
		System.out.println("Array elements are:"+arr);
		System.out.println("Array is Empty or not:"+arr.isEmpty());
		arr.clear();
		System.out.println("Array elements are:"+arr);
		 //Interator
//        ListIterator<String> lt= ArrayList.listIterator();
//        while (lt.hasNext()) {
//            System.out.println(lt.next());
//        }
	}

}
