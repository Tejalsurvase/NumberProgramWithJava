import java.util.Scanner ;
class DisariumNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		int sum = 0, count = 0 ;
		
		for (int i = num; i > 0; i++)
		{
			count++ ;
		}

		for (int i = num; i > 0; i /= 10)
		{
			int rem = i % 10 ;
			int power = 1 ;
			for (int j = i; j > count; j /= 10)
			{
				power *= rem ;
			}
			sum += power ;
			count-- ;
		}

		if (sum == num)
		{
			System.out.println("The given number is Disarium Number.") ;
		}
		else
		{
			System.out.println("The given number is not an Disarium Number.") ;
		}
	}
}
