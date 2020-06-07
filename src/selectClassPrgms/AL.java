package selectClassPrgms;

import java.util.ArrayList;
import java.util.Collections;

public class AL 
{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("z");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("a");
		
		System.out.println("Array List Before sorting :"+al);
		
		//To sort al
		Collections.sort(al);
		
		System.out.println("Array List After sorting :"+al);
	}
}
