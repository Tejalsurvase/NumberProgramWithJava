import java.util.Scanner ;
class PerfectSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the starting number :") ;
		int num1 = sc.nextInt() ;

		System.out.println("Enter the ending number :") ;
		int num2 = sc.nextInt() ;

		int sum = 0, den = 1, per = 0 ;

		for (int i = num1; i <= num2; i++)
		{
			for (int j = i; j > 0; j /= 10)
			{
                sum += j % 10 ;
			}
		}

		System.out.println("The sum of digits of numbers in given range is :" + sum) ;

		while (den <= sum/2)
		{
			if (sum % den == 0)
			{
				per += den ;
			}
			den++ ;
		}
		if (sum == per)
		{
			System.out.println("It is a perfect number.") ;
		}
		else
		{
			System.out.println("It is not a perfect number.") ;
		}
	}
}
