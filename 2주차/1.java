import java.util.ArrayList;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); // ArrayList 생성
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int flag = 0;
		
		do {
			System.out.println("ToDo 리스트");
			System.out.println("1. 할 일 추가");
			System.out.println("2. 완료한 항목 체크");
			System.out.println("3. 목록 보기");
			System.out.println("4. 종료");
			System.out.print("메뉴를 선택하세요: ");
			
			menu = sc.nextInt();
			sc.nextLine();
			int i = 1; // 목록 보기의 인덱스
			int j;
			
			switch (menu)
			{
				case 1:
					System.out.print("할 일을 입력하세요: ");
					String todo = sc.nextLine();
					list.add(todo);
					System.out.println("할 일이 추가되었습니다.");
					System.out.println("");
					break;
				case 2:
					System.out.print("몇 번 항목을 완료했습니까?: ");
					j = sc.nextInt();
					list.remove(j - 1);
					System.out.println("항목이 삭제됐습니다.");
					System.out.println("");
					break;
				case 3:
					System.out.println("ToDo 리스트:");
					for (String obj : list)
					{
						System.out.println(i + ". " + obj);
						i++;
					}
					System.out.println("");
					break;
						
				default:
					flag = 1;
					break;
			}
			
		} while (flag != 1);
		
		System.out.println("프로그램이 종료되었습니다.");
	}
}
