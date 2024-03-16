import java.util.Scanner;

public class draw {
	public static void main(String[] args) {
		char[][] canvas = new char[5][5];
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true; // 종료할 때 사용하는 변수
		final int SIZE = 5; // 캔버스 크기를 기호상수로 정의
		
		while (true)
		{
			System.out.println("그림 그리기 프로그램");
			System.out.println("1. 직선 그리기");
			System.out.println("2. 정사각형 그리기");
			System.out.print("원하는 그림을 선택하세요 (1-2), 종료: 0: ");
			int menu = sc.nextInt();
			
			for (int i = 0; i < SIZE; i++) // 반복할 때마다 배열을 빈 공간으로 초기화
			{
				for (int j = 0; j < SIZE; j++)
					canvas[i][j] = '_';
			}
			
			switch(menu)
			{
				case 0: // 0을 입력하면 flag값을 false로 변경해서 무한루프에서 탈출
					flag = false;
					break;
				
				case 1:
					int x1, x2, y1, y2; //
					do {
						System.out.print("첫 번재 점의 좌표: ");
						x1 = sc.nextInt();
						y1 = sc.nextInt();
						System.out.print("두 번재 점의 좌표: ");
						x2 = sc.nextInt();
						y2 = sc.nextInt();
					} while (x1 > SIZE);
					
					if (x1 == x2) // 세로로 그릴 때
					{
						int dist = Math.abs(y2 - y1); // x1과 x2는 같으므로 y1과 y2의 차이 측정
						int i = 0;
						while(i <= dist) // 차이만큼 반복해서 출력
						{
							canvas[i][x1] = '*';
							i++;
						}
					}
					
					else if (y1 == y2) // 가로로 그릴 때
					{
						int dist = Math.abs(x2 - x1);  // y1과 y2는 같으므로 x1과 x2의 차이 측정
						int i = 0;
						while(i <= dist) // 차이만큼 반복해서 출력
						{
							canvas[y1][i] = '*';
							i++;
						}
					}
					
					else if (y1 < y2) // 우하향일 때
					{
						
						for (int i = 0; i <= y2; i++)
							canvas[y1 + i][x1 + i] = '*';
					}
					
					else if (y1 > y2) // 우상향일 때
					{
						for (int i = 0; i <= y1; i++)
							canvas[y2 + i][x2 - i] = '*';
					}
					break;
					
				case 2:
					System.out.print("점의 좌표: ");
					int x = sc.nextInt();
					int y = sc.nextInt();
					int size = 0;
					do {
						System.out.print("크기: ");
						size = sc.nextInt();
						if (x + size > SIZE) // 배열 canvas의 크기가 배열 인덱스 기준 4 초과면 정사각형이 canvas 위에 전부 표시 못하므로 재입력
							System.out.println("정사각형의 크기가 너무 큽니다.");
						else if (size <= 0) // 크기를 받을 때 0이하면 생성이 안되므로 재입력
							System.out.println("정사각형의 크기가 너무 작습니다.");
					} while(x + size > SIZE || size < 0);
					
					for (int i = x; i <= x + size - 1; i++) // x위치에서 바로 별이 생성되어야 하므로 1을 빼줍니다.
					{
						for (int j = y; j <= y + size - 1; j++) // y도 Line 61과 동일
							canvas[j][i] = '*';
					}
					break;
					
				default:
					break;
			}
			
			if (flag == false)
				break;
			
			for (int i = 0; i < SIZE; i++)
			{
				for (int j = 0; j < SIZE; j++)
					System.out.print(canvas[i][j]);
				System.out.println();
				System.out.println();
			}
		}
		System.out.print("프로그램이 종료되었습니다.");
	}
}
