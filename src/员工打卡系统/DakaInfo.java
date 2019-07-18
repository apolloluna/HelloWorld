package 员工打卡系统;

import java.text.SimpleDateFormat;
import java.util.*;
public class DakaInfo {
	Employee employee = new Employee();
	Date signInDate=null;
	Date signOutDate=null;
	boolean flag =false;
	boolean check = true;
	public DakaInfo() {}
	public DakaInfo(Employee employee, Date signInDate, Date signOutDate) {
		super();
		this.employee = employee;
		this.signInDate = signInDate;
		this.signOutDate = signOutDate;
	}
	SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		
		this.employee = employee;
	}
	public String getSignInDate() {
		
		
		return sdf.format(signInDate);
	}
	public void setSignInDate(Date signInDate) {
		this.signInDate = signInDate;
	}
	public String getSignOutDate() {
		
		return sdf.format(signOutDate);
	}
	public void setSignOutDate(Date signOutDate) {
		
		this.signOutDate = signOutDate;
	}
	public void qiandao() {
		signInDate=new Date();
	}
	public void qiantui() {
		signOutDate = new Date();
	}
	public String toString() {
		return this.employee.getID()+" 签到时间" +this.getSignInDate()+" 签退时间"+this.getSignOutDate();
	}
	public Date getdakaTime() {
		return signInDate;
	}

}
