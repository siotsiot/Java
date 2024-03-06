import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int maxNumber = 100;
		int randomNumber = random.nextInt(maxNumber) + 1;
		
		while(true)
		{
			System.out.println("1부터 " + maxNumber + "까지의 숫자 중 하나를 선택하세요.");
			int num = scanner.nextInt();
			
			if (randomNumber == num)
				break;
			else if (randomNumber > num)
				System.out.println("숫자가 낮습니다.");
			else if (randomNumber < num)
				System.out.println("숫자가 높습니다.");
		}
		
		System.out.print("정답입니다!");
	}
}
