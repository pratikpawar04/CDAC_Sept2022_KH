class P1Q5
{
	public static void main(String args[])
	{
 
		for(int i=1;i<=5;i++) //row
		{
			for(int j=5;j>i;j--) //column
			{
				System.out.print(" ");
			}				
			
			for(int j=1;j<=i;j++) //column
			{
				System.out.print("*");
			}				
			
			for(int j=1;j<i;j++) //column
			{
				System.out.print("*");
			}				
			
			System.out.println();
		}
	}
}	




/*
Output

    *
   ***
  *****
 *******
*********

*/