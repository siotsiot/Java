import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(); // 난수를 생성하는 객체 키워드는 Random
		
		int maxNumber = 100;
		int randomNumber = random.nextInt(maxNumber) + 1; // 0 ~ 99까지 생성되지만 1이 추가돼서 1 ~ 100 생성
		
		while(true) // 무한루프 (Java에서는 1이 true키워드와 동일, 0은 false)
		{
			System.out.println("1부터 " + maxNumber + "까지의 숫자 중 하나를 선택하세요."); // 사용자로부터 입력받기
			int num = scanner.nextInt();
			
			if (randomNumber == num) // 맞췄으면 while문 탈출
				break;
			else if (randomNumber > num) // 낮을 경우
				System.out.println("숫자가 낮습니다.");
			else if (randomNumber < num) // 높을 경우
				System.out.println("숫자가 높습니다.");
		}
		
		System.out.print("정답입니다!");
	}
}
