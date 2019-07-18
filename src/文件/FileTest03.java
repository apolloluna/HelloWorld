package 文件;

import java.io.*;

public class FileTest03 {
	//文件加密
	//
	public static void main(String[] args) {
		/*FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("D:/lol.txt");
			fos = new FileOutputStream("D:/123.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int c=0;
			while((c = bis.read())!=-1) {
				char ch = (char)c;
				bos.write(ch);
				
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*File f= new File("D:/lol.txt");
		File f1 = new File("D:/abc.txt");
		encodeFile(f,f1);
		
		
	}

	private static void encodeFile(File f, File f1) {
		try (FileReader filein = new FileReader(f);
			FileWriter fileOut = new FileWriter(f1);){			
			
			char[] cin = new char[(int)f.length()];
			filein.read(cin);
			System.out.println(cin);
			for(int i = 0;i<cin.length;i++) {
				char ch = cin[i];
				if(ch<='9'&&ch>='0') {
					if(ch=='9') {
						ch='0';
					}
					else {
						ch++;
					}
				}
				if(ch>='a'&&ch<='z') {
					if(ch=='z') {
						ch='a';
					}
					else {
						ch++;
					}
				}
				if(ch>='A'&&ch<='Z') {
					if(ch=='Z') {
						ch='Z';
					}
					else {
						ch++;
					}
				}
				cin[i]=ch;	
			}
			System.out.println(cin);
			fileOut.write(cin);
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		// TODO 自动生成的方法存根
		
	}

}
