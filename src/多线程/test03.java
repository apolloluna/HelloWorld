package 多线程;

class Timer{
	private static int num = 0;
	public synchronized void add(String name) {
		num++;
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println(name+" is "+num+"th user");
	}
}
public class test03 implements Runnable {
	Timer timer = new Timer();
	public static void main(String[] args) {
		test03 t03= new test03();
		Thread t1 = new Thread(t03);
		Thread t2 = new Thread(t03);
		t1.setName("kiku");
		t2.setName("cxk");
		t1.start();
		t2.start();
		// TODO 自动生成的方法存根

	}
	public void run() {
		timer.add(Thread.currentThread().getName());
	}

}
