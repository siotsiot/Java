import java.util.Scanner;

class Date {
	public int year;
	public int month;
	public int day;
	public String monthToString;
	
	// 생성자 만듦
	public Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	// 메소드 생성(한국식 표기)
	void print1() {
		System.out.println(year + "." + month + "." + day);
	}
	
	// 메소드 생성(미국식 표기)
	void print2() {
		switch (month) {
			case 1:
				monthToString = "January";
				break;
			case 2:
				monthToString = "February";
				break;
			case 3:
				monthToString = "March";
				break;
			case 4:
				monthToString = "April";
				break;
			case 5:
				monthToString = "May";
				break;
			case 6:
				monthToString = "June";
				break;
			case 7:
				monthToString = "July";
				break;
			case 8:
				monthToString = "August";
				break;
			case 9:
				monthToString = "September";
				break;
			case 10:
				monthToString = "Octorbor";
				break;
			case 11:
				monthToString = "November";
				break;
			case 12:
				monthToString = "December";
				break;
		}
		System.out.println(monthToString + " " + day + ", " + year);
	}
}

public class DateTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month, day;
		
		System.out.print("연: ");
		year = sc.nextInt();
		System.out.print("달: ");
		month = sc.nextInt();
		System.out.print("일: ");
		day = sc.nextInt();
		
		Date obj = new Date(year, month, day);
		
		System.out.println("Printing date in format 1:");
		obj.print1();
		
		System.out.println("Printing date in format 2:");
		obj.print2();
	}
}
