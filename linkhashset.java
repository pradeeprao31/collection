package collection;
import java.util.*;
public class linkhashset {

	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet(); 
		  h.add("Apple"); 
		  h.add("Boy"); 
		  h.add("Cat"); 
		  h.add("Dog"); 
		  h.add(null); 
		  h.add(10); 
		  
		  System.out.println(h.add("Dog")); 
		  
		  System.out.println(h);
		  

	}

}
