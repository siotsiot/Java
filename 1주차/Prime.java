import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 객체 생성
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt(); // 사용자로부터 정수로 입력받기
		
		boolean flag = true; // flag값을 true로 초기화
		
		for(int i = 2; i < num; i++) // 사용자로부터 입력받은 값보다 1 작은 수를 나누기
		{
			if ((num % i) == 0) // 나누어 떨어지면
			{
				flag = false; // flag를 false로 변경
				break;
			}
		}
		if (flag == true)
			System.out.print("소수가 맞습니다.");
		else
			System.out.print("소수가 아닙니다.");
	}
}
