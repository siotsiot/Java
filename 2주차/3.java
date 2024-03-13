import java.util.Scanner;

public class calcultation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		
		System.out.print("연산을 입력하세요: ");
		String op = sc.next();
		
		System.out.print("피연산자를 입력하세요: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double result = 0.0;
		
		switch(op)
		{
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default:
				break;
		}
		System.out.println(num1 + op + num2 + " = " + result);
	}
}
