import java.util.Scanner ;
class Var 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Your Name :") ;
		String name = sc.next() ;
		System.out.println("Your Age :") ;
        int age = sc.nextInt() ;
		System.out.println("Your Weight :") ;
		float weight = sc.nextFloat() ;
		System.out.println("Your Blood_Group :") ;
		char bgroup = 'B' ;
		System.out.println("Your MobNo :") ;
		String mobno = sc.next() ;
		System.out.println("Your Height :") ;
		double height = sc.nextDouble() ;
		System.out.println("Your is_brave :") ;
        boolean is_brave = sc.nextBoolean() ;

		System.out.println(name) ;
		System.out.println(age) ;
		System.out.println(weight) ;
		System.out.println(bgroup) ;
		System.out.println(mobno) ;
		System.out.println(height) ;
		System.out.println(is_brave) ;
	}
}
