package collectionEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.ListIterator;
public class LinkList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
	    ll.add(10);
	    ll.addFirst(23);
	    ll.add(6);
	    //ll.offerLast(50);
	    ll.addLast(40);
	    System.out.println("Element in Lined List : "+ll);
	    System.out.println("Element in peek (Reterive first) : "+ll.peekFirst());
	    System.out.println("Element in peek (Reterive last) : "+ll.peekLast());
	    System.out.println("Element in Lined List : "+ll);
	    System.out.println("Element in pollfirst(remove first ) : "+ll.pollFirst());
	    System.out.println("Element in Linked List : "+ll);
	    System.out.println("Element in Linked List using Iterator :");
	    
	    //Traversing List
	    Iterator<Integer> iter = ll.iterator();
	    while (iter.hasNext()) {
	      int i = iter.next();
	       System.out.println(i);
	    }
	    System.out.println("Element in Lined List : "+ll.getFirst());
	    System.out.println("Element in peekfirst Linked List : "+ll.peekFirst());
	    
	    ll.removeLast();
	    System.out.println("Element in Lined List : "+ll);
	    System.out.println("My stack:");
	    System.out.println("My stack:");
	    Stack<Integer> s=new Stack<>();
	    System.out.println("Is empty or not:"+s.isEmpty());
	    s.push(10);//add element in stack
	    s.push(12);
	    s.push(14);
	    System.out.println("My elements:"+s);
	    s.pop();
	    System.out.println("After Pop my elements:"+s);
	    System.out.println("Top of the elment:"+s.peek());//top of elemnt
	    System.out.println(s.isEmpty());
	    System.out.println("List Iterator");
	    
	   
	}

}
