package d0411.java6;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
public class CheckboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Questions");
		f.setSize(305,250);
		f.setLayout(new FlowLayout());
		
		Label q1 = new Label("1. ����� ���� �оߴ� ? (������ ���ð���)");
		Checkbox news =new Checkbox("news",true);
		Checkbox sports =new Checkbox("sports");
		Checkbox movie =new Checkbox("movie");
		Checkbox music =new Checkbox("music");
		f.add(q1);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(music);
		
		Label q2 = new Label("2. �󸶳� ���� ���忡 ���ʴϱ� ?");
		CheckboxGroup group1 = new CheckboxGroup();
		Checkbox movie1 = new Checkbox("�Ѵ޿� �ѹ� ���ϴ�",group1,true);
		Checkbox movie2 = new Checkbox("�����Ͽ� �ѹ� ���ϴ�",group1,true);
		Checkbox movie3 = new Checkbox("�����Ͽ� �ι� ���ϴ�",group1,true);
		f.add(q2);
		f.add(movie1);
		f.add(movie2);
		f.add(movie3);
		
		Label q3 = new Label("3. �Ϸ翡 �󸶳� ��ǻ�͸� ����Ͻʴϱ�?");
		CheckboxGroup group2 = new CheckboxGroup();
		Checkbox com1 = new Checkbox("5�ð� ����", group2,true);
		Checkbox com2 = new Checkbox("10�ð� ����", group2,false);
		Checkbox com3 = new Checkbox("15�ð� ����", group2,false);
		
		f.add(q3);
		f.add(com1);
		f.add(com2);
		f.add(com3);

		f.setVisible(true);
	}

}
