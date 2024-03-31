import java.util.Scanner ;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the first number :") ;
		int num1 = sc.nextInt() ;

		System.out.println("Enter the second number :") ;
		int num2 = sc.nextInt() ;

		int multiple = 1 ;

		int large = num1 > num2 ? num1 : num2 ;

        while (true)
        {
			int lcm = large * multiple ;
			if (lcm % num1 == 0 && lcm % num2 == 0)
			{
				System.out.println("The LCM of " + num1 + " and " + num2 + " is : " + lcm) ;
				break ;
			}
			multiple++ ;
        }
	}
}
