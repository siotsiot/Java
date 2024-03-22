class Circle {
	public int radius;
	public String color;
	public int x, y;
	
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
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

public class CircleTest {
	public static void main(String[] args) {
		Circle c1, c2, c3, m;
		c1 = new Circle();
		c2 = new Circle(10, "파란색");
		c3 = new Circle("노란색");
		
		int move_x, move_y;
		
		for (int i = 1; i <= 100; i++) {
			int randomNum = (int)(Math.random() * 3) + 1;
			switch(randomNum) {
			case 1:
				move_x = (int)(Math.random() * 50) + 1;
				move_y = (int)(Math.random() * 50) + 1;
				m = new Circle(move_x, move_y);
				System.out.println(i + ". 원 #1(반지름" + c1.radius + ", 색상: " + c1.color + ")은 (" + m.x + ", " + m.y + "으로 이동하였음)");
				break;
				
			case 2:
				move_x = (int)(Math.random() * 50) + 1;
				move_y = (int)(Math.random() * 50) + 1;
				m = new Circle(move_x, move_y);
				System.out.println(i + ". 원 #2(반지름" + c2.radius + ", 색상: " + c2.color + ")은 (" + m.x + ", " + m.y + "으로 이동하였음)");
			
			case 3:
				move_x = (int)(Math.random() * 50) + 1;
				move_y = (int)(Math.random() * 50) + 1;
				m = new Circle(move_x, move_y);
				System.out.println(i + ". 원 #3(반지름" + c3.radius + ", 색상: " + c3.color + ")은 (" + m.x + ", " + m.y + "으로 이동하였음)");
			}
		}
	}
}
