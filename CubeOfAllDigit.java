import java.util.Scanner ;
class CubeOfAllDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		int sum = 0 ;
		while (num > 0)
		{
			int rem = num % 10 ;
			int power = 1 ;
			for (int i = 1; i <= 3; i++)
			{
				power *= rem ;
			}
			sum += power ;
			num /= 10 ;
		}
		System.out.println("The cube of digits of given number :" + sum) ;

	}
}
