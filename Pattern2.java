class Pattern2 
{
	public static void main(String[] args) 
	{
		int num = 11 ;
		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j < num; j++)
			{
				if (i == 0 || j == 0 || i == num - 1 || j == num - 1 || i == j || j == num - 1 - i || j == num / 2 || i == num / 2)
				{
					System.out.print("*" + " ") ;
				}
				else
				{
					System.out.print(" " + " ") ;
				}
			}
			System.out.println() ;
		}
	}
}
