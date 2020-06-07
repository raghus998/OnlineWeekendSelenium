package selectClassPrgms;

import java.util.HashSet;

public class HS {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<>();
	hs.add("z");
	hs.add("a");
	hs.add("c");
	hs.add("b");
	hs.add("z");
	hs.add("a");
	hs.add("c");
	hs.add("b");
	System.out.println(hs);
	}
}
