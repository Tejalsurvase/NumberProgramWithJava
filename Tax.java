import java.util.Scanner ;
class Tax
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter your income :") ;
		double money = sc.nextDouble() ;
		if (money > 10000 && money <= 20000)
		{
			System.out.println("You have to fill rupees 2000 as a tax");
		}
		else if (money > 20000 && money <= 40000)
		{
			System.out.println("You have to fill rupees 4000 as a tax");
		}
		else if (money > 40000 && money <= 60000)
		{
			System.out.println("You have to fill rupees 6000 as a tax");
		}
		else if (money > 60000 && money <= 80000)
		{
			System.out.println("You have to fill rupees 8000 as a tax");
		}
		else if (money > 80000 && money <= 100000)
		{
			System.out.println("You have to fill rupees 10000 as a tax");
		}
		else if (money > 100000)
		{
			System.out.println("You have to fill rupees 20000 as a tax");
		}
		else
		{
			System.out.println("Please enter valid value for money!");
		}
	}
}
