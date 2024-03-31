import java.util.Scanner ;
class ProductOfSquare 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		int product = 1, n1 = 0, n2 = 1;
		while (num > 0)
		{
			int rem = num % 10 ;
			int square = rem * rem ;
			product *= square ;
			num /= 10 ;
		}
		System.out.println("The product of square of each digit of given number is :" + product) ;
		while (true)
		{
			int res = n1 + n2 ;
			if (n1 == product)
		    {
			   System.out.println("It is a fibonacci number.") ;
			   break ;
		    }
		    else if (n1 > product)
		    {
               System.out.println("It is not a fibonacci number.") ;
			   break ;
		    }
			n1 = n2 ;
			n2 = res ;
		}

	}
}
