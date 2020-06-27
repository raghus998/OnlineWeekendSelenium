package enp;

public class User1 {
	public static void main(String[] args) {
		Bank1 DeepPriya = new Bank1(100);
		int Dbal = DeepPriya.getBal();
		System.out.println(Dbal);
		
		Bank1 Sandya = new Bank1(100000);
		int SBal = Sandya.getBal();
		System.out.println(SBal);
		
	}

}
