import java.util.Scanner ;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		int sum = 0 ;
        int den = 1 ;
		while (den <= num/2)
		{
			if (num % den == 0)
			{
				sum += den ;
			}
			den++ ;
		}
		if (sum == num)
		{
			System.out.println("The given number is perfect number.") ;
		}
		else
		{
			System.out.println("The given number is not a perfect number.") ;
		}

	}
}
