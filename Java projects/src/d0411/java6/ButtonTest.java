package d0411.java6;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);

		Button b = new Button("Ȯ��");
		b.setSize(100, 50);
		b.setLocation(100, 75);

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle("����");
			}
		});

		f.add(b);
		f.setVisible(true);
	}
}