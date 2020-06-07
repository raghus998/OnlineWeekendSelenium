package selectClassPrgms;

import java.util.TreeSet;

public class TS 
{
	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<>();
		hs.add("z");
		hs.add("a");
		hs.add("c");
		hs.add("b");
		hs.add("z");
		hs.add("a");
		hs.add("c");
		hs.add("b");
		hs.add("z");
		hs.add("c");
		hs.add("b");
		hs.add("z");
		hs.add("a");
		hs.add("c");
		System.out.println(hs);
	}

}
