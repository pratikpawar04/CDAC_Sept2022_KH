class P3Q7
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
				System.out.print(i+" ");
			}				
			
			for(int j=i-1;j>=1;j--) //column
			{
				System.out.print(i+" ");
			}				
			
			System.out.println();
		}
		
	}
}	



/*
Output

9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1
*/