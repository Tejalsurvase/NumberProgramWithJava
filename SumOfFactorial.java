import java.util.Scanner ;
class SumOfFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		int sum = 0;

        for (int i = num; i > 0; i--) {
            int fact = 1; // Reset factorial for each iteration

            for (int j = i; j > 0; j--) {
                fact *= j;
            }

            // Calculate the sum of the digits of the factorial
            int temp = fact; // Store the factorial value in a temporary variable
            while (temp != 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
        }

        System.out.println(sum);
	}
}
