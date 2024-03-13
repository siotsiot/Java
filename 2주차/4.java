import java.util.Scanner;

public class article {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("경기장은 어디입니까? ");
		String stadium = sc.next();
		System.out.print("이긴 팀은 어디입니까? ");
		String winTeam = sc.next();
		System.out.print("진 팀은 어디입니까? ");
		String loseTeam = sc.next();
		System.out.print("우수 선수는 누구입니까? ");
		String mvp = sc.next();
		System.out.print("스코어는 몇 대 몇 입니까? ");
		String score = sc.next();
		
		char winScore = score.charAt(0);
		char loseScore = score.charAt(2);
		
		System.out.println("=========================================");
		System.out.println("오늘 " + stadium + "에서 야구 경기가 열렸습니다.");
		System.out.println(winTeam + "과 " + loseTeam + "은 치열한 공방전을 펼쳤습니다.");
		System.out.println(mvp + "이(가) 맹활약을 하였습니다.");
		System.out.println("결국 " + winTeam +"이(가)" + loseTeam + " 을(를) " + winScore + ":" + loseScore + "로 이겼습니다.");
		System.out.println("=========================================");
	}
}
