import java.util.Scanner ;
class Age
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Your age : ") ;
		int age = sc.nextInt() ;
		if (age > 0 && age <= 11)
		{
			System.out.println("You are Child");
		}
		else if (age > 11 && age <= 18)
		{
			System.out.println("You are teenage");
		}
		else if (age > 18 && age <= 29)
		{
			System.out.println("You are Young");
		}
		else if (age > 29 && age <= 50)
		{
			System.out.println("You are Adult");
		}
		else if (age > 50)
		{
			System.out.println("You are Old");
		}
		else
		{
			System.out.println("Please enter valid age!");
		}
		
	}
}
