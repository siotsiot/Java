import java.util.Scanner;

class Account {
	private double balance;
	
	// 생성자로 balance를 초기화
	public Account() {
		balance = 0;
	}
	// 접근자를 통해 balance의 값을 출력
	double getBalance() {
		return balance;
	}
	
	// 설정자를 통해 balance의 값을 변경
	void deposit(double balance) {
		this.balance += balance;
	}
	
	void withdraw(double balance) {
		this.balance -= balance;
	}
}

public class AccountTest {
	public static void main(String[] args) {
		
		int menu = 0;
		Account obj = new Account();
		
		do {
			System.out.println("==== 은행 계좌 시스템 ====");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액 조회");
			System.out.println("4. 종료");
			System.out.print("기능을 선택하세요: ");
			
			Scanner sc = new Scanner(System.in);
			
			menu = sc.nextInt();
			
			switch(menu) {
				case 1: // 입금
					int deposit;
					while(true) {
						System.out.print("얼마를 입금합니까? ");
						deposit = sc.nextInt();
						if (deposit > 0)
							break;
						else
							System.out.println("양수를 입력하세요.");
					}
					obj.deposit(deposit);
					System.out.println("입금이 완료됐습니다.");
					System.out.println("잔액: " + obj.getBalance());
					break;
					
				case 2: // 출금
					int withdraw;
					while(true) {
						System.out.print("얼마를 출금합니까? ");
						withdraw = sc.nextInt();
						if (obj.getBalance() >= withdraw)
							break;
						else
							System.out.println("잔액을 초과해서 입력했습니다.");
					}
					obj.withdraw(withdraw);
					System.out.println("출금이 완료됐습니다.");
					System.out.println("잔액: " + obj.getBalance());
					break;
					
				case 3: // 잔액 조회
					System.out.println("잔액: " + obj.getBalance());
					break;

				case 4: // 종료
					break;
					
				default:
					System.out.println("번호를 다시 입력해주세요.");
					break;
			} 
		} while (menu != 4);
		System.out.print("프로그램이 종료되었습니다.");
	}
}
