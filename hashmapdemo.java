package collection;
import java.util.*;

public class hashmapdemo {
	

	public static void main(String[] args) {
		
		HashMap<Integer,String> m=new HashMap<>();
		
		m.put(100,"pradeep");
		System.out.println(m);
		
		m.put(23,"pradeep");
		m.put(13,"pradeep");
		System.out.println(m);
		System.out.println("Size of map is: " + m.size());

		
	}

}
