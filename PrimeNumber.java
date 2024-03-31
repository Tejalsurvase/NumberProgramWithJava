import java.util.Scanner ;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;
		int den = 2 ;
		for (den; den < num ; den++)
		{
			if (num % den == 0)
			{
				break ;
			}
		}
		if (num == den)
		{
			System.out.println("It is a Prime number.") ;
		}
		else
		{
			System.out.println("It is not a Prime number.") ;
		}
	}
}
