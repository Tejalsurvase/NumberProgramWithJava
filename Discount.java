import java.util.Scanner ;
class Discount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter your age : ") ;
		int age = sc.nextInt() ;
		if (age > 0 && age <= 10)
		{
			System.out.println("You get 10% discount") ;
		}
		else if (age > 10 && age <= 30)
		{
			System.out.println("You get 20% discount") ;
		}
		else if (age > 30 && age <= 60)
		{
			System.out.println("You get 30% discount") ;
		}
		else if (age > 60)
		{
			System.out.println("You get 40% discount") ;
		}
		else
	    {
			System.out.println("Enter valid value for age!") ;
	    }
	}
}
