package 多线程;

class TicketRunnable implements Runnable{
	private int Ticket =50;

	public int getTicket() {
		return Ticket;
	}

	public void setTicket(int ticket) {
		Ticket = ticket;
	}

	@Override
	public void run() {
		while(true) {
			if(Ticket>0) {
				System.out.println(Thread.currentThread().getName()+"剩余"+Ticket);
				Ticket--;
			}else {
				break;
			}
		}
		/*for(int i =1;i<51;i++) {
			System.out.println("窗口一卖出第"+i+"张票，"+"剩余"+(this.getTicket()-i)+"张");
		}*/
		// TODO 自动生成的方法存根
		
	}
	
}
class TicketThread extends Thread{
	private int Ticket =50;

	public int getTicket() {
		return Ticket;
	}

	public void setTicket(int ticket) {
		Ticket = ticket;
	}

	@Override
	public void run() {
		for(int i =1;i<51;i++) {
			
			System.out.println("                                                        窗口二卖出第"+i+"张票，"+"剩余"+(this.getTicket()-i)+"张");
		}
		
	}
	
}

public class test01{

	public static void main(String[] args) {
		TicketRunnable tr = new TicketRunnable();
		TicketRunnable tr1 = new TicketRunnable();
		Thread trt = new Thread(tr);
		Thread trt1 = new Thread(tr1);
		//TicketThread tt= new TicketThread();
		//tt.start();
		trt.start();
		trt1.start();
		/*for(int i =0;i<50;i++) {
			System.out.println("kiku");
		}*/
	

}
}
