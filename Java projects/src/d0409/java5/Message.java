package d0409.java5;

public class Message {
	private String value;
	private String name;
	public Message(String value,String name) {
		this.value=value;
		this.name=name;
	}
	public String getMessage() {
		return value;
	}
	public String getName() {
		return name;
	}
}
