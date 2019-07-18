package 集合;

import java.util.ArrayList;
import java.util.Iterator;

public class 必做题 {

	public static void main(String[] args)  {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("grape");
		list.add("banana");
		list.add("pear");
		list.sort(null);
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
