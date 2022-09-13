import java.util.Scanner;

class Q17
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Positive no. to check for Palindrome");
		int n=s.nextInt();
		System.out.println();
		int check=n;
		int c=0;
		int dig=0;
		
		while(n>0)
		{
			dig=n%10;
			n=n/10;
			c=c*10+dig;
		}			
		
		if(check==c)
		{
			System.out.println("The Entered no. is Palindrome");
		}
		else
		{
			System.out.println("The Entered no. is not Palindrome");
		}	
	
	}
	
}	


/*

123
321

121
1331


151
22322



*/