package 网络编程;

import java.io.IOException;
import java.net.Socket;

public class Client1 {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1",6666);
			System.out.println(s);
			s.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		// TODO 自动生成的方法存根

	}

}
