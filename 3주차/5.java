import javax.swing.*;

public class FrameTest2 {
	public static void main(String[] args) {
		int s1 = 0, s2 = 0;
		int randomNum1, randomNum2;
		JFrame f = new JFrame("경주마 1"); // 윈도우 제목 설정.
		JFrame g = new JFrame("경주마 2");
		
		System.out.println("s1의 위치: " + s1 + " | s2의 위치: " + s2);
		
		while(s1 <= 1500 && s2 <= 1500) {
			randomNum1 = (int)(Math.random() * 100) + 1;
			f.setSize(300, 200); // 윈도우 크기 설정
			f.setLocation(s1 += randomNum1, 20); // 윈도우 위치 설정
			f.setVisible(true); // // 윈도우를 화면에 표시
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우를 닫을 때 프로그램이 종료되도록 설정
			
			randomNum2 = (int)(Math.random() * 100) + 1;
			g.setSize(300, 200);
			g.setLocation(s2 += randomNum2, 300);
			g.setVisible(true);
			g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			System.out.println("s1의 위치: " + s1 + " | s2의 위치: " + s2);
		}
		if (s1 > s2)
			System.out.println("경주마 1 승리");
		else
			System.out.println("경주마 2 승리");
	}
}
