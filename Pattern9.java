class Pattern9 
{
	public static void main(String[] args) 
	{
		int num = 25 ;
		for (int i = 0; i < num; i++)
		{
			for (int space = 0; space < num - i - 1; space++)
			{
				System.out.print(" ") ;
			}
			for (int star = 0; star < 2 * i - 1; star++)
			{
				System.out.print("*" + " ") ;
			}
			System.out.println() ;
		}
	}
}
