import java.util.Scanner ;
class IsFabonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;
		int n1 = 0, n2 = 1, res ;

		while(true)
		{
			res = n1 + n2 ;
			if (res == num)
			{
				System.out.println("It present in fabonacci series.") ;
				break ;
			}
			else if (res > num)
			{
				System.out.println("Not in a fabonacci series.") ;
			}
		}
		n1 = n2 ;
		n2 = res ;
	}
}
