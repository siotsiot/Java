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
		
		System.out.println("BMI = " + BMI);
	}
}
