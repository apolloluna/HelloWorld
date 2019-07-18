package 反射;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*class Service1{
	public void do1() {
		System.out.println("1");
	}
}*/
class Service2{
	public void do2(){
		System.out.println("2");
	}
}


public class TEST02 {

	public static void main(String[] args) {
//		new Service1().do1();
//		new Service2().do2();

		/*try {
			File file = new File("D:\\java\\暑期实训\\a.txt");
			Properties p = new Properties();
			p.load(new FileInputStream(file));
			System.out.println(p);
			String classname = (String)p.get("Class");
			String methodname = (String)p.get("Method");
			
			
			Class clazz = Class.forName(classname); 
			Method m = clazz.getMethod(methodname);
			Constructor c  = clazz.getConstructor();
			Object service = c.newInstance();
			m.invoke(service);
		} catch (IOException | ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}*/

	}

}
