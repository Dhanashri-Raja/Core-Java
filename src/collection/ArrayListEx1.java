package collection;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;public class ArrayListEx1 {

	public static void main(String[] args) {
		        ArrayList<String> al=new ArrayList<>();
		        al.add("Deepa");
		        al.add("Logesh");
		        al.add(null);
		        al.add("Rohit");
		        al.add("M.daisy");
		        al.add(null);
		        al.add(0,"Rajan");
		        System.out.println("Array List : "+al);
		        
		        System.out.println("*****Enhance for loop");
		        for(String alist:al) {
		            System.out.println(alist);
		        }
		        
		        System.out.println("Array List size : "+al.size());
		        System.out.println("Array List Get : "+al.get(2));
		        al.set(2, "Yuvraj");//update
		        System.out.println("Array List : "+al);
		        ArrayList< String> al1=new ArrayList<>();
		        al1.add("Meera");
		        al1.addAll(al);
		        al1.add("Sneha");
		        
		        System.out.println("Array List 2 : "+al1);
		        al1.removeAll(al);
		        System.out.println("Array List2 after remove : "+al1);
		        
		        ArrayList<Integer> listNum=new ArrayList<>();
		        listNum.add(10);
		        listNum.add(3);
		        listNum.add(15);
		        System.out.println("List num : "+listNum);
		        List<String> list = Arrays.asList("Doc", "Grumpy", "Happy", 
	                    "Sleepy", "Dopey", "Bashful", "Sneezy");
	            
	            System.out.println("List to Array example in Java 8:");
	            
	            Object[] objects = list.toArray();
	            System.out.println(Arrays.toString(objects));
	            
	            String[] array = list.toArray(new String[list.size()]);
	            System.out.println(Arrays.toString(array));
		    }
		


	}


