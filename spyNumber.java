import java.util.Scanner ;
class spyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		int sum = 0, product = 1, den ;

		while (num > 0)
		{
			sum += num % 10 ;
			product *= num % 10 ;
			num /= 10 ;
		}
		if (sum == product)
		{
			System.out.println("It is a spy number.") ;
		}
		else
		{
			System.out.println("It is not a spy number.") ;
		}
	
	}
}
