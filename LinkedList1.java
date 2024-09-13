package collection;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		
		
		LinkedList l=new LinkedList(); 
		  l.add("pradeep"); 
		  l.add(3); 
		  l.add(null); 
		  l.add("kumar"); 
		  System.out.println(l);
		  l.set(0,"RAO"); 
		  System.out.println(l); 
		  l.set(0,"pradeep"); 
		  System.out.println(l);
		  l.removeLast(); 
		  System.out.println(l);
		  l.addFirst("raj"); 
		  System.out.println(l);

	}

}
