import java.util.Scanner ;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the starting point :") ;
		int num1 = sc.nextInt() ;

		System.out.println("Enter the ending point :") ;
		int num2 = sc.nextInt() ;
        
		System.out.println("The Neon Numbers are :") ;
		for (int i = num1; i < num2; i++)
		{
			int square = i * i ;
			int sum = 0;
			for (int j = square; j != 0; j /= 10)
			{
				int rem = j % 10 ;
				sum += rem ;
				if (sum == num1)
				{
					System.out.println(i) ;
					break ;
				}
			}
		}
	}
}
