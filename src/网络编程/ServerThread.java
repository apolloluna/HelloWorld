package 网络编程;

import java.io.*;
import java.net.*;

public class ServerThread extends Thread {
	Socket socket = null;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		InputStream iStream =null;
		InputStreamReader isReader = null;
		BufferedReader bReader = null;
		OutputStream oStream =null;
		PrintWriter pWriter =null;
		try {
			
			iStream = socket.getInputStream();
			isReader = new InputStreamReader(iStream);
			bReader = new BufferedReader(isReader);
			
				Thread.sleep(1000);
				System.out.println("线程");
				String info1 = "";
				while ((info1 = bReader.readLine()) != null) {
					System.out.println("--------");
					System.out.println("客户端说：" + info1);
				}
				socket.shutdownInput();

				oStream = socket.getOutputStream();
				pWriter = new PrintWriter(oStream);
				pWriter.write("欢迎您");
				pWriter.print(info1);
				pWriter.flush();
			
			
				}
		 catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally {
			try {
				if(null!=pWriter) {
					pWriter.close();
				}
				if(null != oStream) {
					oStream.close();
				}
				if(null != bReader) {
					bReader.close();
				}
				if(null != isReader) {
					isReader.close();
				}
				if (null != iStream) {
					iStream.close();
					
				}
				if(null != socket) {
					socket.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}

