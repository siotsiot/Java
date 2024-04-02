import java.util.ArrayList;
import java.util.Scanner;

// Item 클래스: 상품 정보를 나타내는 클래스
class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

class Function {
	private static ArrayList<Item> items;
	
	// 정적 초기화 블록을 사용하여 items 필드 초기화
	static {
		items = new ArrayList<>();
	}
	
	// 상품 추가
	public static void addItem(Item item) {
		items.add(item);
		System.out.println("상품이 추가되었습니다.\n");
	}

	// 상품 삭제
	public static void removeItem(String item) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getName().equals(item)) {
				System.out.println("상품 삭제: " + items.get(i).getName());
				items.remove(i);
				return;
			}
		}
		System.out.println("해당 상품이 존재하지 않습니다.\n");
	}
	
	// 전체 상품 금액 합계
	public static void sumPrice() {
		int sum = 0;
		for (int i = 0; i < items.size(); i++) {
			sum += items.get(i).getPrice();
		}
		System.out.println("총 가격은 " + sum + "원입니다.\n");
	}
	
	// 장바구니 비우기
	public static void clear() {
		items.clear();
		System.out.println("장바구니에 담긴 모든 상품이 삭제되었습니다.\n");
	}
}

public class ShoppingCart {
	public static void main(String[] args) {
		Library list = new Library();
		
		String name;
		int price, menu = 0;
		
		do {
			System.out.println("=================");
			System.out.println("장바구니 시스템");
			System.out.println("1. 상품 추가");
			System.out.println("2. 상품 삭제");
			System.out.println("3. 총 가격 계산");
			System.out.println("4. 장바구니 비우기");
			System.out.println("5. 종료");
			System.out.print("번호를 입력하세요: ");
			
			Scanner sc = new Scanner(System.in);
			menu = sc.nextInt();
			
			switch(menu) {
				case 1: // 추가
					System.out.print("상품의 이름을 입력하세요: ");
					sc.nextLine();
					name = sc.nextLine();
					System.out.print("상품의 가격을 입력하세요: ");
					price = sc.nextInt();
				
					Item addName = new Item(name, price);
	                
	                // function 클래스의 addItem 메서드 호출
					Function.addItem(addName);
					break;
					
				case 2: // 특정 상품 삭제
					System.out.print("삭제하려는 상품의 제목을 입력하세요: ");
					sc.nextLine();
					name = sc.nextLine();
					Function.removeItem(name);
					break;
					
				case 3: // 총 가격 계산
					Function.sumPrice();
					break;
					
				case 4: // 장바구니 비우기
					Function.clear();
					break;
					
				case 5:
					break;
					
				default:
					System.out.println("번호를 다시 입력하세요.");
					break;
				}
		} while (menu != 5);
		System.out.print("프로그램이 종료되었습니다.");
	}
}
