import java.util.Scanner;

class Q9
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a No.");
		int a=s.nextInt();
		int n=1;
		if(a<=0)
		{
			System.out.println("Enter Positive No. and try again... ");
		}
		else
		{	
			System.out.println("The Factors of Given No. are...");
			while(n<=a)    
			{
			  if(a%n==0)
			  {	
			      System.out.println(n);
			  }
			  n++;
			}
		}	
	}
	
}	


/*
8
1,8
half of 8 = 4
5,6,7

13
1,13
half of 13=6
2,3,4,5,6
7,8,9,10,11,12


5
*/