import java.util.Scanner ;
class DaysOfMonth 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Month Number :") ;
		int month = sc.nextInt() ;

		System.out.println("Enter the year :") ;
		int year = sc.nextInt() ;

		String monthName ;

		switch (month)
		{
		case 1 :
			{
			    monthName = "January" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 31.") ;
				break ;
			}
		case 2 :
			{
			    monthName = "February" ;
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
					System.out.println("The number of days of " + monthName + ","+ year + " is 29.") ;
				}
				else
				{
					System.out.println("The number of days of " + monthName + ","+ year + " is 28.") ;
				}
				break ;
			}
		case 3 :
			{
			    monthName = "March" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 31.") ;
				break ;
			}
		case 4 :
			{
			    monthName = "April" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 30.") ;
			}
		case 5 :
			{
			    monthName = "May" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 31.") ;
				break ;
			}

		case 6 :
			{
			    monthName = "June" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 30.") ;
				break ;
			}

		case 7 :
			{
			    monthName = "July" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 31.") ;
				break ;
			}

		case 8 :
			{
			    monthName = "August" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 31.") ;
				break ;
			}

		case 9 :
			{
			    monthName = "September" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 30.") ;
				break ;
			}

		case 10 :
			{
			    monthName = "October" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 31.") ;
				break ;
			}

		case 11 :
			{
			    monthName = "November" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 30.") ;
				break ;
			}

		case 12 :
			{
			    monthName = "December" ;
				System.out.println("The number of days of " + monthName + ","+ year + " is 31.") ;
				break ;
			}
		
		default :
			{
				System.out.println("Please enter valid month number....!") ;
			}
		
		}
	}
}
