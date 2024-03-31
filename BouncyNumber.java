import java.util.Scanner ;
class BouncyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		boolean inc = false, dec = false ;

		while (num > 9)
		{
			int var1 = num % 10 ;
			num /= 10 ;
			int var2 = num % 10 ;

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
			System.out.println("The given number is Bouncing number.") ;
		}
		else
		{
			System.out.println("The given number is not a Bouncing number.") ;
		}
	}
}
