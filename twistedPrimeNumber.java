import java.util.Scanner ;
class TwistedPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the start :") ;
		int start = sc.nextInt() ;

        int i = 2 ;
		for (; i < start; i++)
		{
			if (start % i == 0)
			{
				break ;
			}
		}
		if (start == i)
		{
			int rev = 0 ;
		    for (int j = start; j > 0; j /= 10)
		    {
			   rev = (rev * 10) + (j % 10) ;
		    }
		    
			int den = 2 ;
			for (; den < rev; den++)
			{
				if (rev % den == 0)
				{
					break ;
				}
			}
			if (den == rev)
			{
				System.out.println("Twisted Primt") ;
			}
			else
			{
				System.out.println("Not Twisted Prime") ;
			}
		}
		else
		{
			System.out.println("Given number is not a prime number.") ;
		}
        
	}
}

