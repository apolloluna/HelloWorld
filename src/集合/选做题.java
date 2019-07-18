package 集合;

import java.util.*;


class Cust{
	private int ID;
	private String name;
	private double money;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Cust(int id,String name,double money) {
		this.ID = id;
		this.name = name ;
		this.money = money;
		
	}
	
}


public class 选做题 {
	

	public static void main(String[] args) {			
		Scanner  s=new Scanner(System.in);
		String  str=s.nextLine();
		s.close();
		String[] st=str.split(" ");
		//Arrays.asList(st);
		List<String> lis=Arrays.asList(st);
		Collections.sort(lis,new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareToIgnoreCase(o2);
		}
		});
		System.out.print(lis);
		
		
		
		
		
		/*Map map = new HashMap();
		ArrayList list = new ArrayList();
		Cust cust1 = new Cust(001, "kiku", 100000);
		Cust cust2 = new Cust(002,"cxk", 1);
		Cust cust3 = new Cust(003, "xuxu", 3000);
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		Iterator<Cust> iterator = list.iterator();
		while(iterator.hasNext()) {
			Cust cust = iterator.next();
			map.put(cust.getID(), cust);
		}
		Iterator<Map.Entry<Integer, Cust>> it = map.entrySet().iterator();
	    while (it.hasNext()) {
	      Entry<Integer, Cust> entry = it.next();
	      System.out.println(entry.getValue().getName() + ":" + entry.getValue().getMoney());
	    }*/
	
	}
	/*public void testIterator(Map map) {
	    Iterator<Map.Entry<Integer, Cust>> it = map.entrySet().iterator();
	    while (it.hasNext()) {
	      Entry<Integer, Cust> entry = it.next();
	      System.out.println(entry.getKey() + ":" + entry.getValue());
	      // it.remove(); 删除元素
	    }
	}*/

}
