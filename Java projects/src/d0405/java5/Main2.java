package d0405.java5;
import d408.java5.Board;
import java.util.List;
import java.util.Vector;

public class Main2 {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();

		list.add(new Board("力格 1", "郴侩 1"));
		list.add(new Board("力格 2", "郴侩 2"));
		list.add(new Board("力格 3", "郴侩 3"));
		list.add(new Board("力格 4", "郴侩 4"));
		list.add(new Board("力格 5", "郴侩 5"));
		
		list.remove(2);
		list.remove(3);
		
		for (int i =0; i < list.size();i++) {
		Board board = list.get(i);
		System.out.println(board.subject + "\t"+ board.content);
	}
	}

}
