package collectionEx;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Integer> even = new TreeSet<>();
       
        even.add(2);
        even.add(4);
        even.add(2);
        even.add(12);
        even.add(8);
        even.add(6);
        even.add(10);
        
        System.out.println("TreeSet1: " + even.hashCode());
        System.out.println("TreeSet1: " + even);
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("TreeSet2: " + numbers);
        // Union of two set
//      numbers.addAll(even);
//      System.out.println("Union is: " + numbers);
//      numbers.retainAll(even);
//      System.out.println("Intersection is: " + numbers);
      numbers.removeAll(even);
      System.out.println("Diffrence : " + numbers);
      even.removeAll(numbers);
      System.out.println("Diffrence : " + even);
      
      
      
    //<String> hs=new TreeSet<>();
      //No duplicates
      //Treeset-->outcome-->sorting->A to Z
      //A=65,a=97
      //HashSet
      TreeSet<String> hs=new TreeSet<>();
      hs.add("Rutika");
      hs.add("Pragati");
      hs.add("ayenshawari");
      hs.add("Lekha");
      hs.add("Zeba");
      hs.add("Pragati");
      hs.add("Lekha");
      hs.add("Anand");
      hs.add("xy");
  //    hs.add(null);  null values are not applicable
      
      
      System.out.println("Tree hashcode:"+hs.hashCode());
      System.out.println("Tree set:"+hs);
      System.out.println("*****Using Enhanced for loop********");
      
      for(String i:hs) {
          System.out.println(i);
      }
      System.out.println("*****Using Iterator************");
      
      Iterator<String> i = hs.iterator();
      while(i.hasNext()) 
          System.out.println(i.next());
      System.out.println("*****Using decreding Iterator************");
      
      Iterator<String> i1 = hs.descendingIterator();
      while(i1.hasNext()) 
          System.out.println(i1.next());

	}

}
