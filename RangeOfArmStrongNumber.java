import java.util.Scanner ;
class RangeOfArmStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Starting Number :") ;
		int start = sc.nextInt() ;
        
		System.out.println("Enter the Ending Number :") ;
		int end = sc.nextInt() ;

		int sum = 0, count = 0 ;
		
		System.out.println("The ArmStrong numbers are :") ;

		for(int num = start; num <=end ; num++)
		{
			for (int i = num; i > 0; i /= 10)
		    {
			    count++ ;
		    }
			for (int j = num; j > 0; j /= 10)
			{
				int rem = j % 10 ;
				int power = 1 ;

				for (int i = 0; i < count; i++)
				{
					power *= rem ;
				}

				sum += power ;
			}
			if (num == sum)
		    {
			    System.out.println(num) ;
		    }
		}
	}
}
