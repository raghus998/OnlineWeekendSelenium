package colle;

import java.util.ArrayList;

public class Demo1 
{
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add("RS");
		al.add('A');
		al.add(true);
		al.add(null);
		al.add("RS");
		al.add(10);
		al.add("RS");
		al.add('A');
		int count = al.size();
		System.out.println(count);
		System.out.println(al);
		Object eleAtIndexOne = al.get(1);
		System.out.println(eleAtIndexOne);
		}

}
