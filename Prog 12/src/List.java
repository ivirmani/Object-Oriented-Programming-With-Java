import java.util.*;

public class List {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Avaneesh");
		l.add(" ");
		l.add("Bhol");
		l.add(" ");
		l.add("Chirag");
		Iterator<String> i = l.iterator();
		while (i.hasNext()) {
			String s = i.next().toString();
			if (s.length() > 5)
				System.out.println(s);
		}
	}
}
