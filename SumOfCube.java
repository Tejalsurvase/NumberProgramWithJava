import java.util.Scanner ;
class SumOfCube 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the starting :");
		int num1 = sc.nextInt() ;

		System.out.println("Enter the starting :");
		int num2 = sc.nextInt() ;

		int cube = 1 ;
		for (int i = num1; i <= num2; i /= 10)
		{
			int rem = i % 10 ;
			while (rem > 0)
			{
				cube = rem * rem * rem ;
				System.out.println(cube) ;
			}
			
		}
	}
}
