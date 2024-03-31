import java.util.Scanner ;
class Revision 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;

        for (int i = 0; i < count(ip) - 1; i++)
        {
			System.out.println(rotate(ip) + " ") ;
			ip = rotate(ip) ;

        }
	}


	public static int count(int num)
	{
		int count = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			count++ ;
		}
		return count ;
	}

	public static int power(int base, int raise)
	{
		int pow = 1 ;
		for (int i = 0; i < raise; i++)
		{
			pow *= base ;
		}
		return pow ;
	}

	public static int rotate(int num)
	{
		int last = num % 10 ;
		num /= 10 ;
		int count = count(num) ;
		int ans = last * power(10, count) + num ;
		return ans ;
	}
}
