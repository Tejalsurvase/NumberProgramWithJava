import java.util.Scanner ;
class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		int sum = 0, count = 0 ;

		for (int i = num; i > 0; i /= 10)
		{
			count++ ;
		}
		
		for (int j = num; j > 0; j /= 10)
		{
			int rem = j % 10 ;
			int power = 1 ;
			for (int i = 0; i < count; i++)
			{
				power *= rem ;
			}
			sum += power ;
		}

		if (sum == num)
		{
			System.out.println("The given number is armstrong number.") ;
		}
		else
		{
			System.out.println("The given number is not a armstrong number.") ;
		}
	}
}
