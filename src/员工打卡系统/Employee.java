package 员工打卡系统;

public class Employee {
	private int ID;
	private String name;
	public Employee() {}
	public Employee(int ID,String name) {
		
		this.ID = ID;
		this.name=name;
	}
	
	
	
	
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
	public String toString() {
		return (this.getID()+" "+this.getName());
	}
	

}
