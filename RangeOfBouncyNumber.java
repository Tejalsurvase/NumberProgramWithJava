import java.util.Scanner ;
class RangeOfBouncyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the starting number :") ;
		int start = sc.nextInt() ;

		System.out.println("Enter the ending number :") ;
		int end = sc.nextInt() ;

		boolean inc = false, dec = false ;

		System.out.println("The Bouncy Numbers from given range are :") ;

		for (int num = start; num < end; num++)
		{
			for (int i = num; i > 9; i /= 10)
			{
				int var1 = i % 10 ;
				i /= 10 ;
				int var2 = i % 10 ;

				if (var1 > var2)
				{
					inc = true ;
				}
				else if (var1 < var2)
				{
					dec = true ;
				}

				if (inc == dec)
				{
					break ;
				}
			}
			if (inc && dec)
		    {
			    System.out.println(num) ;
		    }
		}
	}
}
