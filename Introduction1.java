import java.util.Scanner ;
class Introduction1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter your name :") ;
		String name = sc.next() ;

		System.out.println("Graduation complted year :") ;
		int year = sc.nextInt() ;

		System.out.println("Enter your address :") ;
		String address = sc.next() ;

		System.out.println("Enter your eduaction :") ;
		String edu = sc.next() ;

		System.out.println("Your B.tech % :");
		double Btech = sc.nextDouble() ;

		System.out.println("Your HSC % :") ;
		double Hsc = sc.nextDouble() ;

		System.out.println("Your SSC % :") ;
		double Ssc = sc.nextDouble() ;
		
		System.out.println("Programming Languages known :") ;
		String lang = sc.next() ;

		System.out.println("Your Hobbies :") ;
		String hobby = sc.next() ;

		System.out.println("Your Strengths :") ;
		String strength = sc.next() ;

		System.out.println("My name is " + name + ".") ;
		System.out.println("I have completed my graduation in " + year + " year.") ;
		System.out.println("I am from " + address + ".") ;
		System.out.println("I have completed my " + edu + " from PAHSU.") ;
		System.out.println("I got " + Btech + "in drgee.") ;
		System.out.println("I have completed my HSC with " + Hsc + ".") ;
		System.out.println("I have completed my SSC with " + Ssc + ".") ;
		System.out.println("I have technical knowledge of " + lang + ".") ;
		System.out.println("My hobbies are " + hobby + ".") ;
		System.out.println("My strengths are " + strength + ".") ;
	}
}
