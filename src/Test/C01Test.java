package Test;

class Buyer{
	private int MyMoney;
	private int AppleCnt;
	
	public Buyer(int mymoney, int applecnt) {
		MyMoney=mymoney;
		AppleCnt=applecnt;
	}
	public void Pay(Seller seller, int money) {
		MyMoney-=money;
		int cnt = seller.Receive(money);
		AppleCnt += cnt;
	}
	public void ShowInfo() {
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 갯수 : " + AppleCnt);
	}
	
}
class Seller{
	private int MyMoney;
	private int AppleCnt;
	int Price;
	
	public Seller(int mymoney, int applecnt, int price) {
		MyMoney = mymoney;
		AppleCnt = applecnt;
		Price = price;
	}
	public int Receive(int money) {
		MyMoney+=money;
		int revcnt = money/Price;
		AppleCnt -= revcnt;
		return revcnt;
	}
	public void ShowInfo() {
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 갯수 : " + AppleCnt);
		System.out.println("개당 가격 : " + Price);
	}
	
}

public class C01Test {
	
	public static void main(String[] args) {
		
		Seller seller = new Seller(100000,100,1000);
		Buyer buyer01 = new Buyer(10000,0);
		Buyer buyer02 = new Buyer(20000,0);
		Buyer buyer03 = new Buyer(30000,0);
		buyer01.Pay(seller, 2000);
		buyer02.Pay(seller, 5000);
		buyer03.Pay(seller, 3000);
		System.out.println("------판매자 정보------");
		seller.ShowInfo();
		System.out.println("------구매자 정보------");
		System.out.println("-buyer01-");
		buyer01.ShowInfo();
		System.out.println("-buyer02-");
		buyer02.ShowInfo();
		System.out.println("-buyer03-");
		buyer03.ShowInfo();
	}
}
