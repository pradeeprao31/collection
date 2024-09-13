package collection;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		
		Stack s=new Stack(); 
		  s.push("pradeep"); 
		  s.push("kumar"); 
		  s.push("rao"); 
		  System.out.println(s);
		  System.out.println(s.pop()); 
		  System.out.println(s); 
		  System.out.println(s.peek()); 
		  System.out.println(s.empty());
		

	}

}
