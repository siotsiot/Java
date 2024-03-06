public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 29;
		boolean flag = false;
		for(int i = 2; i < num; i++)
		{
			if ((num % i) == 0)
			{
				flag = true;
				break;
			}
		}
		System.out.print("29는 소수가 맞습니다.");
	}
}
