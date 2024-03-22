class Counter {
	private int counter;
	
	public Counter(int counter) { // 매개 변수가 있는 생성자
		this.counter = counter;
	}
	
	void setUp() { counter++; }
	void setDown() { counter--; }
	void getReset() { counter = 0; }
	int getCount() { return counter;}
}

public class CounterTest {
	public static void main(String[] args) {
		Counter obj = new Counter(0);
		System.out.println("객체 생성 후 Counter value: " + obj.getCount());
		obj.setUp();
		System.out.println("up() 메소드 호출 후 Counter value: " + obj.getCount());
		obj.setUp();
		System.out.println("up() 메소드 호출 후 Counter value: " + obj.getCount());
		obj.setDown();
		System.out.println("down() 메소드 호출 후 Counter value: " + obj.getCount());
	}
}
