import java.util.Scanner ;
class Conditional 
{
	public static void main(String[] args) 
	{
		int a = 20 ;
		int b = 30 ;
		String c = a < b ? a + " is smaller" : b + " is smaller" ;
		System.out.println(c);

		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the first character : ") ;
		char d = sc.next().charAt() ;
		System.out.println("Enter the second character : ") ;
		char e = sc.next().charAt() ;
		String f = d > e ? d + " is greater" : e + " is greater" ;
		System.out.println(f) ;
		String g = d < e ? d + " is smaller" : e + " is smaller" ;
		System.out.println(g) ;

		int h = 40 ;
		String i = a > b && a > h ? a + " is greater" : ( b > a && b > h ? b + " is greater" : h + " is greater") ;
		System.out.println(i) ;
		
		String j = a < b && a < h ? a + " is smaller" : ( b < a && b < h ? b + " is smaller" : h + " is smaller") ;
		System.out.println(j) ;
	}
}
