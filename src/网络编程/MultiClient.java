package 网络编程;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiClient {

	public MultiClient() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		try {
			Socket s=new Socket("127.0.0.1",8888);
			new SendThread(s).start();
			new RecieveThread(s).start();
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}// TODO 自动生成的方法存根

	}

}
