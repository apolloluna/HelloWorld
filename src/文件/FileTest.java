package 文件;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		File f = new File("D:/java/暑期实训/java001.txt");
		File[] aFiles = f.listRoots();
		System.out.println(Arrays.toString(aFiles));
		f.delete();
		//f.mkdirs();
		
		
		/*String[] strings = f.list();
		System.out.println(Arrays.toString(strings));
		File[] f1 = f.listFiles();
		System.out.println(Arrays.toString(f1));
		String parentStr = f.getParent();
		System.out.println(parentStr);
		*/
		
		
		/*File  f1=new File("D:/filetest");
		System.out.println(f1.getAbsolutePath());
		File f2=new File("java001.txt");
		System.out.println(f2.getAbsolutePath());
		File f3 = new File(f1,"java002.txt");
		System.out.println(f3.getAbsolutePath());
		
		File f= new File("D:\\java\\暑期实训\\java001.txt");
		System.out.println("当前文件是"+f);
		System.out.println("判断是否存在"+f.exists());
		System.out.println("判断是否是文件夹"+f.isDirectory());
		System.out.println("判断是否是文件"+f.isFile());
		System.out.println("文件长度"+f.length());
		long time = f.lastModified();
		Date date = new Date(time);
		System.out.println(date);
		f.setLastModified(0);
		
		File fn=new File("D:\\java\\暑期实训\\java001.txt");
		f.renameTo(fn);*/

	}

}
