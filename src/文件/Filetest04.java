package 文件;

import java.io.*;

public class Filetest04 {
public static void main(String[] args) {
			
	FileOutputStream fos = null;
	try {
	    fos = new FileOutputStream("D:/123.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Cust c1 = new Cust("kiku", 18);
		Cust c2 = new Cust("cxk", 88);
		System.out.println("----对象序列化------");
		oos.writeObject(c1);
		oos.writeObject(c2);
		oos.flush();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	finally {
		try {
			fos.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	try {
		fis = new FileInputStream("D:/123.txt");
		ois = new ObjectInputStream(fis);
		Object c = null;
		while((c = ois.readObject()) != null) {
			Cust c1 = (Cust) c;
			System.out.println(c1.getAge()+" "+c1.getName()+" "+c1.getBirth());
		}
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		// TODO: handle exception
	}catch (EOFException e) {
		System.out.println("读取完成");
		
		// TODO: handle exception
	}catch (IOException e) {
		e.printStackTrace();
		// TODO: handle exception
	}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
}
}


class Cust implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	transient String birth;
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Cust(String name,int age) {
		this.name = name;
		this.age = age;
		// TODO 自动生成的构造函数存根
	}
	public String toString() {
		return this.getName()+this.getAge();
	}
	}
