package d0412.PDF;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App1 extends JFrame{
	public App1() {
		setTitle("Swing App");
		setSize(300,100);
		getContentPane().add(new JButton("OK"), BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
		app.setVisible(true);
	}

}
