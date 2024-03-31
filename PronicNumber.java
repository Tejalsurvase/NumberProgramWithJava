import java.util.Scanner ;
class PronicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		int res = 0 ;

		for (int i = 1; i <= num; )
		{
			res = i * ++i ;
			if (res == num)
			{
				System.out.println("The given number is Pronic Number.") ;
				break ;
			}
		}
		if (res > num)
		{
			System.out.println("The given number is not a Pronic Number.") ;
 
		}

	}
}
