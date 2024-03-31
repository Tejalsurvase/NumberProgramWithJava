import java.util.Scanner ;
class SumOfFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a number :") ;
		int num = sc.nextInt() ;
		int den = 1,sum = 0 ;

		while (den <= num)
		{
			if (num % den == 0)
			{
				for (int i = den; i > 0; i++ )
				{
					int rem = i % 10 ;
					sum += rem ;
					System.out.println(sum) ;
				}
			}
			den++ ;
		}

    }
}
