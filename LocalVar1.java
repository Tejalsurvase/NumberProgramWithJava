class LocalVar1 
{
	public static void main(String[] args) 
	{
		int a = 3 ;
		System.out.println(a);  //only this one executed properly
        

		String a = "Tejal" ;    //compile time error(can't create same name variable in same block)
		System.out.println(a) ;

		int b ;
		System.out.println(b) ; //compile time error(variable must be initialize before printing it)

	}
	{
		System.out.println(a) ; //compile time error(cannot use one block's variable in another block if it is local)
	}
}
