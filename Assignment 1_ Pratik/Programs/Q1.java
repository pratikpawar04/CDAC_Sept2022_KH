import java.util.Scanner;

class Q1
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an Integer no. to check for Odd and Even");
		int a=s.nextInt();
	
		if (a%2==0)
		{
			System.out.println("Entered no. is Even");
		}
		else
		{
			System.out.println("Entered no. is Odd");
		}	
		
	}
	
}	