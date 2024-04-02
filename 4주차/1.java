class Dice {
	private int face;
	
	public Dice() {
		face = 0;
	}
	
	void setValue() {
		face = (int)(Math.random() * 6) + 1;
	}
	
	int getValue() {
		return face;
	}
}

public class DiceTest {
	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int num1 = 0, num2 = 0, count = 0;
		
		while(true) {
			dice1.setValue();
			dice2.setValue();
			
			num1 = dice1.getValue();
			num2 = dice2.getValue();
			System.out.println("주사위1 = " + num1 + " 주사위2 = " + num2);
			count++;
			
			if (num1 == 1 && num2 == 1) {
				break;
			}
		}
		System.out.print("(1, 1)이 나오는데 걸린 횟수 = " + count);
	}
}
