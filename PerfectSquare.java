import java.util.Scanner ;
class PerfectSquare
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the starting number :") ;
		int num1 = sc.nextInt() ;

		System.out.println("Enter the ending number :") ;
		int num2 = sc.nextInt() ;
        int sum = 0 ;
		while (num1 >= num2)
		{
			for (int i = num1; i > 0; i /= 10)
			{
				int rem = i % 10 ;
				sum += rem ;
				if ()
				{
				}
			}
		}
	}
}