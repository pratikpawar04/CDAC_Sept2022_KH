import java.util.Scanner;

class Q2
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Natural no. to find Factorial");
		int a=s.nextInt();
		
		int fact=1,n=1;
	
		while(n<=a)      //n=1,2,3,4
		{
			fact=fact*n;    //fact=1...2...6
			n++;
		}
		
		System.out.println("Factorial of "+a+" is "+fact);
		
		
	}
	
}	



//fact6=6*5*4*3*2*1