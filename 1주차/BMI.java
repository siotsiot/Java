import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double BMI;
		
		System.out.print("체중(kg)을 입력하세요: ");
		double weight = sc.nextDouble();
		
		System.out.print("키(m)를 입력하세요: ");
		double height = sc.nextDouble();
	
		BMI = weight / (height * height);
		
		if (BMI < 18.5)
		{
			System.out.println("BMI = " + BMI);
			System.out.println("저체중입니다.");
		}
		else if (BMI >= 18.5 && BMI <= 22.9)
		{
			System.out.println("BMI = " + BMI);
			System.out.println("정상입니다.");
		}
		else if (BMI >= 23 && BMI <= 24.9)
		{
			System.out.println("BMI = " + BMI);
			System.out.println("비만전단계입니다.");
		}
		else if (BMI >= 25 && BMI <= 29.9)
		{
			System.out.println("BMI = " + BMI);
			System.out.println("1단계비만입니다.");
		}
		else if (BMI >= 30 && BMI <= 34.9)
		{
			System.out.println("BMI = " + BMI);
			System.out.println("2단계비만입니다.");
		}
		else if (BMI > 35)
		{
			System.out.println("BMI = " + BMI);
			System.out.println("3단계비만입니다.");
		}
	}
}
