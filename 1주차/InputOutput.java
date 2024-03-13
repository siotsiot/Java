import java.util.Scanner; // import는 클래스를 지정하는 키워드

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // new는 객체를 생성하는 키워드, sc는 객체 이름
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine(); // 문자열(nextLine)을 받는 문장
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt(); // 정수(nextInt)를 받는 문장

		System.out.println("이름: " + name + ", 나이: " + age);
	}
}
