import java.util.Scanner ;
class PositiveNegative 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter number");
		int num = sc.nextInt() ;

        if (num > 0)
        {
			System.out.println("It is a positive number.") ;
        }
		else if (num < 0)
		{
			System.out.println("It is negative number.") ;
		}
	    /*else if (num = 0)
		{
			System.out.println("It is a zero.") ;
		}*/ //CTE
		else
		{
			System.out.println("Please enter valid number.") ;
		}
	}
}
