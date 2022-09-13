class P3Q6
{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--) //row
		{
			for(int j=9;j>i;j--) //column
			{
				System.out.print(" ");
			}				
			
			for(int j=i;j>=i;j--) //column
			{
				System.out.print("* ");
			}				
			
			for(int j=i-1;j>=1;j--) //column
			{
				System.out.print("* ");
			}				
			
			System.out.println();
		}
		
	}
}	



/*
Output

* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *

*/