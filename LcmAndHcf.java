import java.util.Scanner ;
class LcmAndHcf 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		int multiply = 1 ;
		System.out.println("Please enter 1 for finding LCM....!") ;
		System.out.println("Please enter 2 for finding HCF....!") ;
		int option = sc.nextInt() ;
		
		switch (option)
		{
		case 1:
			{
				System.out.println("Please enter 1 for finding LCM of two numbers :") ;
				System.out.println("Please enter 2 for finding LCM of three numbers :") ;
				System.out.println("Please enter 3 for finding LCM of four numbers :") ;
                int opt = sc.nextInt() ;
				switch (opt)
				{
				case 1:
					{
						System.out.println("Enter first number :") ;
						int num1 = sc.nextInt() ;

                        System.out.println("Enter second number :") ;
						int num2 = sc.nextInt() ;

						int large = num1 > num2 ? num1 : num2 ;

						while (true)
						{
							int lcm = large * multiply ;
							if (lcm % num1 == 0 && lcm % num2 == 0)
							{
								System.out.println("LCM of " + num1 + "and " + num2 + "is " + lcm) ;
								break ;
							}
							multiply++ ;
						}
						break ;
					}
				
				case 2:
					{
						System.out.println("Enter first number :") ;
						int num1 = sc.nextInt() ;

                        System.out.println("Enter second number :") ;
						int num2 = sc.nextInt() ;

						System.out.println("Enter third number :") ;
						int num3 = sc.nextInt() ;

						int large = num1 > num2 ? num1 : (num2 > num3 ? num2 : num3) ;

						while (true)
						{
							int lcm = large * multiply ;
							if (lcm % num1 == 0 && lcm % num2 == 0 && lcm % num3 == 0)
							{
								System.out.println("LCM of " + num1 + "and " + num2 + "and " + num3 + "is " + lcm) ;
								break ;
							}
							multiply++ ;
						}
						break ;
					}

				case 3:
					{
						System.out.println("Enter first number :") ;
						int num1 = sc.nextInt() ;

                        System.out.println("Enter second number :") ;
						int num2 = sc.nextInt() ;

						System.out.println("Enter third number :") ;
						int num3 = sc.nextInt() ;

						System.out.println("Enter forth number :") ;
						int num4 = sc.nextInt() ;

						int large = num1 > num2 ? num1 : (num2 > num3 ? num2 : (num3 > num4 ? num3 : num4)) ;

						while (true)
						{
							int lcm = large * multiply ;
							if (lcm % num1 == 0 && lcm % num2 == 0 && lcm % num3 == 0 && lcm % num4 == 0)
							{
								System.out.println("LCM of " + num1 + "and " + num2 + "and " + num3 + "and " + num4 + "is " + lcm) ;
								break ;
							}
							multiply++ ;
						}
						break ;
					}

					default :
					{
						System.out.println("Please enter the valid option...!") ;
					}
				
				}
				break ;
			}

		case 2:
			{
			    System.out.println("Please enter 1 for finding HCF of two numbers :") ;
				System.out.println("Please enter 2 for finding HCF of three numbers :") ;
				System.out.println("Please enter 3 for finding HCF of four numbers :") ;
                int opt1 = sc.nextInt() ;
				switch (opt1)
				{
					case 1:
					{
						System.out.println("Enter first number :") ;
				        int num1 = sc.nextInt() ;

                        System.out.println("Enter second number :") ;
			            int num2 = sc.nextInt() ;

				        int small = num1 < num2 ? num1 : num2 ;

			            while (true)
					       {
						       if (num1 % small == 0 && num2 % small == 0)
						       {
							       System.out.println("HCF of " + num1 + "and " + num2 + "is " + small) ;
							       break ;
						       }
						       small-- ;
					       }
				         break ;
					 }

					 case 2:
					{
						System.out.println("Enter first number :") ;
						int num1 = sc.nextInt() ;

                        System.out.println("Enter second number :") ;
						int num2 = sc.nextInt() ;

						System.out.println("Enter third number :") ;
						int num3 = sc.nextInt() ;

						int small = num1 < num2 ? num1 : (num2 < num3 ? num2 : num3) ;

						while (true)
						{
							if (num1 % small == 0 && num2 % small == 0 && num3 % small == 0)
							{
								System.out.println("HCF of " + num1 + "and " + num2 + "and " + num3 + "is " + small) ;
								break ;
							}
							small-- ;
						}
						break ;
					}

					case 3:
					{
						System.out.println("Enter first number :") ;
						int num1 = sc.nextInt() ;

                        System.out.println("Enter second number :") ;
						int num2 = sc.nextInt() ;

						System.out.println("Enter third number :") ;
						int num3 = sc.nextInt() ;

						System.out.println("Enter forth number :") ;
						int num4 = sc.nextInt() ;

						int small = num1 < num2 ? num1 : (num2 < num3 ? num2 : (num3 < num4 ? num3 : num4)) ;

						while (true)
						{
							if (num1 % small == 0 && num2 % small == 0 && num3 % small == 0 && num4 % small == 0)
							{
								System.out.println("HCF of " + num1 + "and " + num2 + "and " + num3 + "and " + num4 + "is " + small) ;
								break ;
							}
							small-- ;
						}
						break ;
					}

					default:
					{
						System.out.println("Please enter valid option....!") ;
					}

				}
			}
			default :
			{
				System.out.println("Please enter valid option....!") ;
			}
		
		}

	}
}
