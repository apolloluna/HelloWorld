package guiTest;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class GridLayout1 extends JFrame {
	/*private JButton
	b1 = new JButton("诺克萨斯"),
	b2 = new JButton("德玛西亚");
	private JTextField txt = new JTextField(10);
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String name =((JButton)e.getSource()).getText();
			txt.setText(name);	
		}
		
	}
	private ButtonListener bl = new ButtonListener();
	public Button2() {
		b1.addActionListener(bl);
		b2.addActionListener(bl);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(txt);
	}*/
	public GridLayout1() {
		setLayout(new GridLayout(7,3));
		for(int i = 0;i<=20;i++) {
			add(new JButton("Button "+i));
		}
	}
	public static void run(final JFrame j,final int width,final int height) {
		j.setTitle(j.getClass().getSimpleName());
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(width, height);
		j.setVisible(true);
	}
	public static void main(String[] args) {
		
		run(new GridLayout1(), 300, 300);
	}

}

