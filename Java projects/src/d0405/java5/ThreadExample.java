package d0405.java5;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for (int i = 0; i <5; i++) {
			System.out.println("��");
		try {
			Thread.sleep(500);
		}catch(Exception e) {
		}	
		}
	}

}
