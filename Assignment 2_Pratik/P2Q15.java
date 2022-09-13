class P2Q14
{
	public static void main(String args[])
	{
 
		for(int i=1;i<=5;i++) //row
		{
			
			for(int j=5;j>=i;j--) //column
			{
				System.out.print(j+" ");
			}				
			System.out.println();
		}
	}
}	



/*
Output

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5


*/