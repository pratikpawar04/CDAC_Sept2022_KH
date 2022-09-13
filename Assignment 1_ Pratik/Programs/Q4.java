import java.util.Scanner;

class Q4
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st No.:");
		int a=s.nextInt();  // 10
		System.out.print("Enter 2nd No.:");
		int b=s.nextInt();  // 15
		System.out.println();
		
		a=a+b;  // a=10+15=25
		b=a-b;  // b=25-15=10
		a=a-b;  // a=25-10=15
		
		
		System.out.println("After Swapping:");
		System.out.println();
		System.out.println("1st No. is: "+a);
		System.out.println("2nd No. is: "+b);
		
	}
	
}	


//temp
//a and b
//temp=a
//a=b
//b=temp