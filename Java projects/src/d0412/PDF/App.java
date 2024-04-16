package d0412.PDF;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends Frame implements ActionListener{
	private Button b;
	private Frame f;

	
	public App() {
		setTitle("AWT App");
		setSize(300,100);
		Button b = new Button("OK");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
		
		
		
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.print(" OK ");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			App app = new App();
			app.setVisible(true);
	}

}
