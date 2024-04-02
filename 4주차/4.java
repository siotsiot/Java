import java.util.ArrayList;
import java.util.Scanner;

// Book 클래스: 도서 정보를 나타내는 클래스
class Book {
	private String title;
	private String author;
	private String publisher;
	private int price;

	public Book(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPrice() {
		return price;
	}
}
// Library 클래스: 도서를 관리하는 클래스
class Library {
	private static ArrayList<Book> books;

 // 정적 초기화 블록을 사용하여 books 필드 초기화
	static {
		books = new ArrayList<>();
	}

 // 도서 추가
	public static void addBook(Book book) {
		books.add(book);
		System.out.println("도서가 추가되었습니다.");
 }

 // 도서 삭제
	public static void removeBook(String title) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().equals(title)) {
				System.out.println("도서 삭제: " + books.get(i).getTitle());
				books.remove(i);
				return;
         }
     }
     System.out.println("해당 도서가 존재하지 않습니다.");
 }

 // 도서 검색
	public static void searchBook(String title) {
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				System.out.println("제목: " + book.getTitle() + " 저자: " + book.getAuthor() + " 출판사: " + book.getPublisher() + " 가격: " + book.getPrice());
				return;
			}
		}
     System.out.println("해당 도서를 찾을 수 없습니다.");
 	 }
}

public class Main {
	public static void main(String[] args) {
		Library list = new Library();
		
		String title, author, publisher;
		int price, menu = 0;
		
		do {
			System.out.println("===============");
			System.out.println("도서 관리 시스템");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색");
			System.out.println("4. 종료");
			System.out.print("번호를 입력하세요: ");
			
			Scanner sc = new Scanner(System.in);
			menu = sc.nextInt();
			
			switch(menu) {
				case 1: // 추가
					System.out.print("책의 제목을 입력하세요: ");
					sc.nextLine();
					title = sc.nextLine();
					System.out.print("책의 저자를 입력하세요: ");
					//sc.nextLine();
					author = sc.nextLine();
					System.out.print("책의 출판사를 입력하세요: ");
					//sc.nextLine();
					publisher = sc.nextLine();
					System.out.print("책의 가격을 입력하세요: ");
					price = sc.nextInt();
				
					Book addBook = new Book(title, author, publisher, price);
	                
	                // Library 클래스의 addBook 메서드 호출
	                Library.addBook(addBook);
					break;
					
				case 2: // 삭제
					System.out.print("삭제하려는 책의 제목을 입력하세요: ");
					sc.nextLine();
					title = sc.nextLine();
					Library.removeBook(title);
					break;
					
				case 3: // 검색
					System.out.print("검색하려는 책의 제목을 입력하세요: ");
					sc.nextLine();
					title = sc.nextLine();
					Library.searchBook(title);
					break;
					
				case 4: // 종료
					break;
				
				default:
					System.out.println("번호를 다시 입력하세요.");
					break;
				}
		} while (menu != 4);
		System.out.print("프로그램이 종료되었습니다.");
	}
}
