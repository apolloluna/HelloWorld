package 网络编程;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8888);
			int count  =0;
			System.out.println("----------------wait---------");
			while(true) {
				Socket socket = ss.accept();
				ServerThread st = new ServerThread(socket);
				st.start();
				count++;
				
				System.out.println("客户端数量"+count);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}		
		
		// TODO 自动生成的方法存根

	}

}
