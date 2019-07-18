package 集合;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
	/*List l;
	public ListTest() {
		l= new LinkedList();
	}
	public boolean isEmpty() {
		if(l.isEmpty()) {
			return true;
			
		}
		else {
			return false;
			
		}
		
	}
	public  void put(Object o) {
		l.add(o);
	}
	public Object  get() {
		Object object = l.get(0);
		l.remove(0);
		return object;
	}*/

	public static void main(String[] args) {
		/*HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 1;i<51;i++) {
			set.add(new Integer(i));
		}*/
		/*Iterator<Integer> integer = set.iterator();
		while(integer.hasNext()) {
			Integer j = (Integer)integer.next();
			System.out.print(j+" ");
			//integer.remove();
		}
		System.out.println("");
		System.out.println(set);*/
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<6;i++) {
			list.add(new Integer(i));
		}
		
		ListIterator<Integer> listIterator =  list.listIterator();
		for(int i = 0;i<list.size();i++) {
			listIterator.next();
		}
		System.out.println(listIterator.hasPrevious());
		while(listIterator.hasPrevious()) {
			Integer j = (Integer)listIterator.previous();
			System.out.print(j+" ");
		}
		
		System.out.println("");
		System.out.println(list);
		
		/*ListTest listTest = new ListTest();
		listTest.put("kiku");
		System.out.println(listTest.get());
		System.out.println(listTest.isEmpty());*/

	
	
		
		// TODO 自动生成的方法存根

	}
	
	

}
