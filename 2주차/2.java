public class lotto {
	public static void main(String[] args) {
		boolean[] lotto = new boolean[46];
		for (int i = 0; i < lotto.length; i++) // lotto 배열을 false로 초기화
			lotto[i] = false;
		
		int j = 0;
		
		while(j < 7)
		{
			int r = (int) (Math.random() * 45) + 1;
			if (lotto[r] == true)
				continue;
			lotto[r] = true;
			j++;
		}
		System.out.println("로또 번호 생성기");
		for (int i = 0; i < lotto.length; i++)
			if (lotto[i] == true)
				System.out.print(i + " ");
	}
}
