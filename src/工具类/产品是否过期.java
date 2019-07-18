package 工具类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class 产品是否过期 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品的生产日期：(yyyy-MM-dd)");
		String birth_date = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthDate;
		try {
			birthDate=sdf.parse(birth_date);
			System.out.println("请输入该物品的保质期（天）：");
			int day = sc.nextInt();
			Date dateNowDate = new Date();
			System.out.println("今天的日期为"+sdf.format(dateNowDate));
			Calendar c = Calendar.getInstance();
			c.setTime(birthDate);
			c.add(c.DATE, day);
			Date releaseDate = c.getTime();
			
			long days = (releaseDate.getTime()-dateNowDate.getTime())/(24*60*60*1000);		
			if (days <0) {
				System.out.println("商品已经过期！");
				
			}
			else {
				System.out.println("还有"+days+"天过期");
			}
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		// TODO 自动生成的方法存根

	}

}
