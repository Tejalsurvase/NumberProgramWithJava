import java.util.Scanner ;
class RangeOfEvenFibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter start :");
		int start = sc.nextInt() ;

		System.out.println("Enter end :") ;
		int end = sc.nextInt() ;
		
		int n1 = 0, n2 = 1, res ;

		System.out.println("The numbers are :") ;

		while (true)
		{
			res = n1 + n2 ;
			if (n1 > start && n2 < end)
			{
				if (n1 % 2 == 0)
				{
					System.out.println(n1) ;
				}
			}
			else if (n1 > 50)
			{
				break ;
			}

			n1 = n2 ;
			n2 = res ;
		}
	}
}