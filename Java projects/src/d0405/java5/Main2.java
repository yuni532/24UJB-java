package d0405.java5;
import d408.java5.Board;
import java.util.List;
import java.util.Vector;

public class Main2 {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();

		list.add(new Board("���� 1", "���� 1"));
		list.add(new Board("���� 2", "���� 2"));
		list.add(new Board("���� 3", "���� 3"));
		list.add(new Board("���� 4", "���� 4"));
		list.add(new Board("���� 5", "���� 5"));
		
		list.remove(2);
		list.remove(3);
		
		for (int i =0; i < list.size();i++) {
		Board board = list.get(i);
		System.out.println(board.subject + "\t"+ board.content);
	}
	}

}
