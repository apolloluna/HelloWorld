package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetTest01 {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();//获取本机的inet实例
		    System.out.println(address.getHostName());
		    System.out.println(address.getHostAddress());
		    byte[] bytes = address.getAddress();
		    System.out.println(address);
		    
		    
		    
		    
		    
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

}
