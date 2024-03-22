// 미완성
import java.util.Scanner;

class Account {
	private String ownerName;
	private double balance = 0;
	
	// 생성자
	public Account(String s, int i) {
		ownerName = s;
		balance += i;
	}
	
	// 설정자, 접근자
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

public class AccountTest {
	public static void main(String[] args) {
		
		int menu = 0;
		
		do {
			System.out.println("==== 은행 계좌 시스템 ====");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액 조회");
			System.out.println("4. 종료");
			System.out.print("기능을 선택하세요: ");
			
			Scanner sc = new Scanner(System.in);
			
			menu = sc.nextInt();
			
			switch(menu){
				case 1:
					// 입금
					System.out.print("누구에게 입금합니까? ");
					sc.nextLine();
					String name1 = sc.nextLine();
					System.out.print("얼마를 입금합니까? ");
					int money = sc.nextInt();
					Account obj = new Account(name1, money);
					System.out.println("입금이 완료됐습니다.");
					System.out.println("이름: " + obj.getOwnerName());
					System.out.println("잔액: " + obj.getBalance());
					
					break;
					
				case 2:
					// 출금
					System.out.print("누구에게 입금합니까? ");
					sc.nextLine();
					String name2 = sc.nextLine();
					System.out.print("얼마를 입금합니까? ");
					int money2 = sc.nextInt();
					Account obj2 = new Account(name2, money2);
					System.out.println("입금이 완료됐습니다.");
					System.out.println("이름: " + obj2.getOwnerName());
					System.out.println("잔액: " + obj2.getBalance());
					break;
					
				case 3:
					// 잔액 조회
					
					
					break;
			} 
		} while (menu != 4);
		System.out.println("프로그램이 종료되었습니다.");
	}
}
