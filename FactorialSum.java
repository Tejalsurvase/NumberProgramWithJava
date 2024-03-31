import java.util.Scanner ;
class FactorialSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		int fact = 1 ;

		while (num > 0)
		{
			fact *= num ;
			num-- ;
		}
		System.out.println("The factorial of given numer is : " + fact) ;
		int sum = 0 ;
		while (fact > 0)
		{
			sum += fact ;
			fact /= 10 ;
		}
		int den = 2 ;
		while (den <= sum/2)
		{
			if (sum % den == 0)
			{
				break ;
			}
			den++ ;
		}
		if (sum == den)
		{
			System.out.println("The sum is Prime number.") ;
		}
		else
		{
			System.out.println("The sum is not a Prime number.") ;
		}
	}
}
