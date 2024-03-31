import java.util.Scanner ;
class WeekDays 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter number of day :");
		int day = sc.nextInt() ;

		if (day == 1)
		{
			System.out.println("It's Monday....!") ;
		}
		else if (day == 2)
		{
			System.out.println("It's Tuesday....!") ;
		}
		else if (day == 3)
		{
			System.out.println("It's Wednesday....!") ;
		}
		else if (day == 4)
		{
			System.out.println("It's Thrusday....!") ;
		}
		else if (day == 5)
		{
			System.out.println("It's Friday....!") ;
		}
		else if (day == 6)
		{
			System.out.println("It's Saturday....!") ;
		}
		else if (day == 7)
		{
			System.out.println("It's Sunday....!") ;
		}
		else
		{
			System.out.println("Please enter valid number of day....!") ;
		}
	}
}
