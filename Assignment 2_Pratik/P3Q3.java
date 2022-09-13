class P3Q3
{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--) //row
		{
			for(int j=i;j>1;j--) //column
			{
				System.out.print(" ");
			}				
			
			for(int j=9;j>=i;j--) //column
			{
				System.out.print("* ");
			}				
			
			System.out.println();
		}
		
	}
}	



/*
Output

        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *

*/