class Circle {
	public int radius;
	public String color;
	public int x, y;

	// 생성자를 이용해 필드 초기화
	public Circle() {
		radius = 100;
		color = "빨간색";
	}
	public Circle(int r, String s) {
		radius = r;
		color = s;
	}
	public Circle(String s) {
		radius = 50;
		color = s;
	}
	
	// move() 메서드를 이용해 원을 좌표를 이동 
	public void move() {
		this.x = (int)(Math.random() * 50) + 1;
		this.y = (int)(Math.random() * 50) + 1;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Circle c1, c2, c3;
		c1 = new Circle();
		c2 = new Circle(10, "파란색");
		c3 = new Circle("노란색");

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 이동");
			c1.move();
			System.out.printf("원 #1(반지름: %3d, 색상: %s)은 (%2d, %2d으로 이동하였음)\n", c1.radius, c1.color, c1.x, c1.y);
			c2.move();
			System.out.printf("원 #2(반지름: %3d, 색상: %s)은 (%2d, %2d으로 이동하였음)\n", c2.radius, c2.color, c2.x, c2.y);
			c3.move();
			System.out.printf("원 #3(반지름: %3d, 색상: %s)은 (%2d, %2d으로 이동하였음)\n", c3.radius, c3.color, c3.x, c3.y);
		}
	}
}
