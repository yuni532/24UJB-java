package d0411.java6;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FlowTest1 extends WindowAdapter{

	private Frame frame;
	private Button button1,button2,button3;
	
	public FlowTest1() {
		frame = new Frame("adapter example");
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");
		
		}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());
		

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowTest g = new FlowTest();
		g.startFrame();
	}

}
