package d0411.java6;

import java.awt.Frame;
import java.awt.Label;
public class LabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Login");
		f.setSize(300,200);
		f.setLayout(null);
	
		Label id = new Label ("ID : ");
		id.setBounds(50,50,30,10);
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(50,65,100,10);
		
		f.add(id);
		f.add(pwd);
		f.setVisible(true);
	
	}

}
