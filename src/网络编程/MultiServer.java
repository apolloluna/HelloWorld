
package 网络编程;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

	public MultiServer() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("监听在端口号6666");
			Socket s=ss.accept();
			new SendThread(s).start();
			new RecieveThread(s).start();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}// TODO 自动生成的方法存根

	}

}
