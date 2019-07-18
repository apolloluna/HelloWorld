package 文件;

import java.io.*;


public class FileTest02 {

	public static void main(String[] args) {
		File f= new File("D:/lol.txt");
		try {
			FileInputStream fis =new FileInputStream(f);
			
			} catch (IOException e) {
			// TODO: handle exception
		}
		
		
		
		/*try {
			FileWriter fw = new FileWriter(f);
			char[] c = {'@','$','*'};
			String s = "kiku";
			char[] ch = s.toCharArray();
			fw.write(c);
			fw.write(ch);
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
		
		/*try {
			FileReader fReader = new FileReader(f);
			char[] c = new char[(int)f.length()];
			fReader.read(c);
			System.out.println(c);
			System.out.println(c.length);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}*/
			
		/*try {
			FileOutputStream fos = new FileOutputStream(f);
			byte[] data = {-88,-89};
			fos.write(data);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}*/
		
		
		
//		try {
//			FileInputStream fis = new FileInputStream(f) ;
//		    byte[] b = new byte[(int)f.length()];
//		    fis.read(b);
//		    for(byte byt:b) {
//		    	System.out.print(byt+" ");
//		    }
//		    fis.close();
//		} catch (FileNotFoundException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
		

	}

}
