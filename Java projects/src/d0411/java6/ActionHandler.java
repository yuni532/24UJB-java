package d0411.java6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionHandler implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Button 1")) {
			System.out.println("Button 1 Click!");
		}
		if(e.getActionCommand().equals("Button 2")) {
			System.out.println("Button 2 Click!");
		}
		if(e.getActionCommand().equals("Button 3")) {
			System.out.println("Button 3 Click!");
		}
		if(e.getActionCommand().equals("Button 4")) {
			System.out.println("Button 4 Click!");
		}
		if(e.getActionCommand().equals("Button 5")) {
			System.out.println("Button 5 Click!");
		}
	}

}
