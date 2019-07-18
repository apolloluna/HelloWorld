package 员工打卡系统;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Company company = new Company();
		
		
		
		
		
		
		
		System.out.println("****员工管理******");

		boolean flag = true;
		while (flag) {

			System.out.printf("新增人员\t1\n删除人员\t2\n查找人员\t3\n显示员工信息\t4\n退出系统\t0\n");
			int cmd = new Scanner(System.in).nextInt();
			switch (cmd) {
			case 1:
				System.out.print("请输入要添加的员工工号:");
				int id = new Scanner(System.in).nextInt();
				System.out.print("请输入要添加的员工姓名:");
				String nameString = new Scanner(System.in).nextLine();
				company.addEmployee(new Employee(id, nameString));
				break;
			case 2:
				try{
					System.out.println("请输入要删除的员工账号");
					int id1 = new Scanner(System.in).nextInt();
			        company.delEmployee(id1);
			        }
				catch (ConcurrentModificationException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				int id2 = new Scanner(System.in).nextInt();
				company.seekEmployee(id2);
				break;
			case 4:
				company.showInfo();
				break;
			case 0:
				flag = false;
				break;
			default:
				break;
			}
		}

		System.out.println("----员工打卡系统- - - -");

		boolean temp = true;
		while (temp) {

			System.out.println("输入0--------退出");
			System.out.println("输入1--------签到");
			System.out.println("输入2--------签退");
			System.out.println("输入3--------查看签到签退信息");
			System.out.println("输入4--------存储信息");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			switch (x) {
			case 0:
				temp = false;
				System.out.println("system exit!");
				break;
			case 1:
				System.out.println("请输入签到员工ID：");
				int id = new Scanner(System.in).nextInt();
				// 获得签到时间
				Date date = new Date();
				Calendar c1 = Calendar.getInstance();
				Calendar c2 = Calendar.getInstance();
				c1.setTime(date);
				Iterator<DakaInfo> ite = company.dakalist.iterator();

				boolean r = true;
				if (r) {
					while (ite.hasNext()) {

						DakaInfo info1 = ite.next();
						if (info1.check) {
							if (info1.employee.getID() == id) {
								info1.qiandao();
								info1.flag = true;
								System.out.println("卡号" + info1.employee.getID() + "签到成功");
								info1.check = false;
							}
						} else {
							c2.setTime(info1.getdakaTime());
							if ((c1.get(c1.DATE) - c2.get(c2.DATE)) < 1) {
								System.out.println("同一天不能多次签到");
							} else {
								if (info1.employee.getID() == id) {
									info1.qiandao();
									info1.flag = true;
									System.out.println("卡号" + info1.employee.getID() + "签到成功");
								}
							}
						}

					}

				} else {
					System.out.println("没有此员工");
				}

				break;
			case 2:
				System.out.println("请输入签退员工ID：");
				int id1 = new Scanner(System.in).nextInt();
				Iterator<DakaInfo> ite1 = company.dakalist.iterator();
				while (ite1.hasNext()) {
					DakaInfo info2 = ite1.next();
					if (info2.employee.getID() == id1) {
						if (info2.flag) {
							info2.qiantui();
							System.out.println("卡号" + info2.employee.getID() + "签退成功");
						} else {
							System.out.println("请先进行签到！");
						}
						break;
					}
				}

				break;
			case 3:
				Iterator<DakaInfo> ite2 = company.dakalist.iterator();
				while (ite2.hasNext()) {
					System.out.println(ite2.next().toString());
				}
				break;
			case 4 :
				File file = new File("D:/abc.txt");
				Iterator<DakaInfo> ite3 = company.dakalist.iterator();
				FileWriter fWriter = null;
				try {
					fWriter = new FileWriter(file);
					while(ite3.hasNext()) {
						fWriter.write(ite3.next().toString());
						
					}
					
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				finally {
					try {
						fWriter.flush();
						fWriter.close();
						System.out.println("sucess");
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
				

			default:
				break;
			}

		}

	}

}
