package 员工打卡系统;

import java.util.*;

public class Company {
	
	ArrayList<Employee> empList = new ArrayList<Employee>();
	ArrayList<DakaInfo> dakalist = new ArrayList<DakaInfo>();
	
	public void addEmployee(Employee e) {
		empList.add(e);	
		DakaInfo info = new DakaInfo(e, null, null);
		dakalist.add(info);
		System.out.println("添加员工"+e.toString()+"成功");
	}

	public void delEmployee(int id) {
		Iterator<Employee> iterator = empList.iterator();
		while (iterator.hasNext()) {
			Employee e = iterator.next();
			if (e.getID() == id) {
				int index = empList.indexOf(e);
				iterator.remove();
				System.out.println("删除员工" + e.toString() + "成功");
			}
		}

	}
	public void seekEmployee(int id) {
		Iterator<Employee> iterator = empList.iterator();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(e.getID() == id) {
				System.out.println("该员工为:"+e.getName());
			}
		}
	}
	public void showInfo() {
		Iterator<Employee> i = empList.iterator();
		System.out.println("所有员工的信息为");
		while(i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}
	/*public void Signin() {
		DakaInfo info = new DakaInfo();
		int id = new Scanner(System.in).nextInt();
		Iterator<Employee> iterator = empList.iterator();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(e.getID() == id) {
				info.setEmployee(e);
				info.qiandao();
			}
		}
		dakalist.add(info);
		
	}
	public void SignOut() {
		DakaInfo info = new DakaInfo();
		int id = new Scanner(System.in).nextInt();
		Iterator<Employee> iterator = empList.iterator();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(e.getID() == id) {
				info.setEmployee(e);
				info.qiantui();
			}
		}
		dakalist.add(info);
		
	}*/

}
