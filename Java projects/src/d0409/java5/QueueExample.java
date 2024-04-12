package d0409.java5;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSMS","���ڹ�"));
		messageQueue.offer(new Message("sendKaKaoTalk","ȫ�β�"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.getMessage()) {
			case "sendMail":
				System.out.println(message.getName() +"�Կ��� ������ �����ϴ�.");
				break;
				
			case "sendSMS":
				System.out.println(message.getName() +"�Կ��� SMS�� �����ϴ�.");
				break;
				
			case "sendKaKaoTalk":
				System.out.println(message.getName() +"�Կ��� īī������ �����ϴ�.");
				break;
				
			}
		}


	}

}
