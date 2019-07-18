package 网络编程;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;



public class RecieveThread extends Thread{
	private Socket s;
	public RecieveThread(Socket s) {
		this.s=s;
		// TODO 自动生成的构造函数存根
	}
	public void run() {
		InputStream is=null;
		DataInputStream dis=null;
		try {
			is=s.getInputStream();
			dis=new DataInputStream(is);
			while(true) {
				String msg=dis.readUTF();
				System.out.println("接收到："+msg);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				dis.close();
				is.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
