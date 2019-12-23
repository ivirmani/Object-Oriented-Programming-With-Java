import java.util.ArrayList;

public class Queues {

	public static void main(String[] args) {
		ArrayList<String> q = new ArrayList<String>();
		q.add("A");
		q.add("B");
		q.add("C");
		for (int i = 0; i < q.size(); i++)
			System.out.println(q.get(i));
		if (q.size() != 0) {
			q.remove(0);
		}
		System.out.println("------------------------Removing an element from queue-------------------------");
		for (int i = 0; i < q.size(); i++)
			System.out.println(q.get(i));

	}

}
