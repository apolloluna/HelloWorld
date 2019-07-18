package 工具类;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class test01 {

	public static void main(String[] args) {
		
		/*float f1= 4.1f;
		float f2= 4.8f;
		System.out.println(Math.abs(f1-f2));
		System.out.println(Math.max(f1, f2));*/
		/*Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double p = (a+b+c)/2;
		System.out.println(p);
		double s = Area(a, b, c, p);
		System.out.println(s);
		/*
		Scanner scanner = new Scanner(System.in);
		String  num = scanner.nextLine();
		StringBuilder s = new StringBuilder(num);
		s.delete(3, 7);
		s.insert(3,"****");
		String phonenumber = num.substring(0,3)+"****"+num.substring(7,s.length());
		System.out.println(s);
		System.out.println(phonenumber);
		*/
		/*String s = numberToString(num);
		System.out.println(s);*/
		/*String str1 = "David";
		String str2 = new String("David");
		System.out.println(str1);
		System.out.println(str2);
		char[] sc = new char[] {'k','j','m'};
		String str3= new String(sc);
		String str4 = new String(sc,0,2);
		System.out.println(str3);
		System.out.println(str4);*/
		Scanner in = new Scanner(System.in);
		String date1= in.nextLine();
		String date2= in.nextLine();
		Date maxDate = Max(date1,date2);
		System.out.println(maxDate);
	}

	private static Date Max(String date1, String date2) {
		Date maxDate = null;
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int result = date1.compareTo(date2);
		if(result>0) {
			try {
				maxDate=sdFormat.parse(date1);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			System.out.println(sdFormat);
		}
		else if (result == 0 ) {
			try {
				maxDate=sdFormat.parse(date1);
			} catch (ParseException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		else{
			try {
				maxDate=sdFormat.parse(date2);
			} catch (ParseException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
		// TODO 自动生成的方法存根
		return maxDate;
	}
	
	public  static double Area(double a,double b,double c,double p) {
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}

	

	/*private static String numberToString(int num) {
		String s = String.valueOf(num);
		if(num<10) {
			s = "00"+s;
		}
		else if(num<100){
			s= "0"+s;
		}
		else {
			
		}
		return s;
	}*/
}
