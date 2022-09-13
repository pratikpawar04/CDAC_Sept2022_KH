import java.util.Scanner;

class Q10
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a No.");
		int a=s.nextInt();
		int sum=0;
		int dig;
		if(a<=0)
		{
			System.out.println("Enter Positive No. and try again... ");
		}
		else
		{	
			while(a>0)    
			{
			  dig=a%10;				
			  sum=sum+dig;
			  a=a/10;
			}
			
			System.out.println("The Sum of Digits is: "+sum);
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