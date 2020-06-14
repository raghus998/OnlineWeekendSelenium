package popups;

import java.util.Date;

public class javadate {
	public static void main(String[] args) 
	{
		//To print current date
		Date date = new Date();
		System.out.println(date);
		
		//Convert date to string
		String stringdate = date.toString();
		System.out.println(stringdate);
		
		//Split sting
		String[] datearray = stringdate.split(" ");
		
		
		System.out.println(datearray[0]);
		System.out.println(datearray[1]);
		System.out.println(datearray[2]);
		System.out.println(datearray[3]);
		System.out.println(datearray[4]);
	}

}
