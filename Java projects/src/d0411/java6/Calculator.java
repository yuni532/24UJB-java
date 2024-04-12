package d0411.java6;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Panel;
import java.awt.BorderLayout;


class Calculator {
	private Frame f;
	private TextField tf;
	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	private Panel p ;
	
	public Calculator() {
		f= new Frame ("Calculator");
		f.setLayout(new FlowLayout());
		tf = new TextField("0");
		

		
		
		
		
		
	//TextField Total = new TextField(100);
		p = new Panel();
	b1= new Button("0");
	b2= new Button("1");
	b3= new Button("2");
	b4= new Button("3");
	b5= new Button("4");
	b6= new Button("5");
	b7= new Button("6");
	b8= new Button("7");
	b9= new Button("8");
	b10= new Button("9");
	b11= new Button("+");
	b12= new Button("-");
	b13= new Button("=");
	b14= new Button("*");
	b15= new Button("%");
	b16= new Button("Delete");
	b17= new Button("Clear");
	}

public void startFrame() {
	
	tf = new TextField(" ");
	
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.print("0");
		}
	});
	b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("1");
		}
	});
	b3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("2");
		}
	});
	b4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("3");
		}
	});
	b5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("4");
		}
	});
	b6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("5");
		}
	});
	b7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("6");
		}
	});
	b8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("7");
		}
	});
	b9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("8");
		}
	});
	b10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("9");
		}
	});
	b11.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("+");
		}
	});
	b12.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("-");
		}
	});
	b13.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("=");
		}
	});
	b14.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("*");
		}
	});
	b15.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("%");
		}
	});
	b16.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("Delete");
		}
	});
	b17.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("     ");
		}
	});
	

	
	f.add(tf,BorderLayout.NORTH);
	
	
	f.add(b1,BorderLayout.SOUTH);
	f.add(b2,"West");
	f.add(b3,"South");
	f.add(b4);
	f.add(b5);
	f.add(b6);
	f.add(b7);
	f.add(b8);
	f.add(b9);
	f.add(b10);
	f.add(b11);
	f.add(b12);
	f.add(b13);
	f.add(b14);
	f.add(b15);
	f.add(b16);
	f.add(b17);
	f.setSize(300,370);
	f.setVisible(true);
	
	}
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Calculator flow  = new Calculator();
	     flow.startFrame();
	
	}

}
