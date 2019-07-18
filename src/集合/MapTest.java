package 集合;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map  m1 = new HashMap();
		m1.put("one", new Integer(1));
		m1.put("two", new Integer(2));
		m1.put("three", new Integer(3));
		Iterable<Object> iterable = m1.keySet();
		
		
		
		/*System.out.println(m1.size());
		System.out.println(m1);
		System.out.println(m1.containsKey("one"));
		System.out.println(m1.containsValue(1));
		
		 
		Map m2 = new HashMap<>();
		m2.put("two", 2);
		m2.put("three",3);
		Map m3 = new HashMap(m1);
		System.out.println(m3);
		m2.putAll(m1);
		System.out.println(m2);*/
		// TODO 自动生成的方法存根

	}

}
