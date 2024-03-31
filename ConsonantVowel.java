import java.util.Scanner ;
class ConsonantVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a character :");
		char ch = sc.next().charAt(0) ;


        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
        {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		    {
			    System.out.println("Given character is Vowel.") ;
		    }
		    else
		    {
			    System.out.println("Given Character is Consonant.") ;
		    }
		}
		else
		{ 
			System.out.println("Please enter valid character....!") ;
		}
	}
}
