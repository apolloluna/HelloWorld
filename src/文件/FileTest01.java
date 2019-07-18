package 文件;

import java.io.*;
import java.util.*;



public class FileTest01 {

	public static void main(String[] args) {
		File f = new File("C:/WINDOWS");
		String[] s = f.list();
		/*for(String str:s) {
			System.out.println(str);
		}*/
		File[] files =f.listFiles();
		System.out.println(Arrays.toString(files));
		ArrayList<File> list = new ArrayList<File>();
		for(File x:files) {
			System.out.println("文件名："+x.getName());
			System.out.println("文件路径："+x.getAbsolutePath());
		}
		
		
		/*for(File file:files) {
			if(file.isFile()) {
			list.add(file);
			}
		}
		
		
		
		long min = Integer.MAX_VALUE;
		long max = Integer.MIN_VALUE;
		File maxFile = null;
		File minFile = null;
		for(File x:list) {
			if(x.length()>max) {
				max= x.length();
				maxFile = x;
			}
			if(x.length()!=0&&x.length()<min) {
				min=x.length();
				minFile=x;
			}
		}
		System.out.println("最大的文件是"+maxFile.getName()+"***"+max+"字节");
		System.out.println("最小的文件是"+minFile.getName()+"***"+min+"字节");
		
		
		
		/*list.sort(null);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}*/
		 
		
		// TODO 自动生成的方法存根

	}

}
