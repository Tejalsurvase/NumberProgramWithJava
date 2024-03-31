import java.util.Scanner ;
class Conditional1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter value of a :") ;
		int a = sc.nextInt() ;
		System.out.println("Enter value of b :") ;
		int b = sc.nextInt() ;
		System.out.println("Enter value of c :") ;
		int c = sc.nextInt() ;
		System.out.println("Enter value of d :") ;
		int d = sc.nextInt() ;
		//int a = 1000, b = 20000, c = 300, d = 40 ;
		int e = a > b && a > c && a > d ? a : (b > a && b > c && b > d ? b : (c > a && c > b && c > d ? c : d) ) ;
		System.out.println(e + " is largest number");
	}
}