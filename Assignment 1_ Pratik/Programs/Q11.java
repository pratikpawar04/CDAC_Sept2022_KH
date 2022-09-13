import java.util.Scanner;

class Q11
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st No.");
		int a=s.nextInt();
		System.out.print("Enter 2nd No.");
		int b=s.nextInt();
		System.out.print("Enter 3rd No.");
		int c=s.nextInt();
		
		System.out.println();
		
		if(a<b&&a<c)     
		{
				System.out.println("1st No. "+a+"is Smallest");
		} 
		else if(b<c) 
		{
				System.out.println("2nd No. "+b+"is Smallest");
		}
		else
		{
				System.out.println("3rd No. "+c+"is Smallest");
		}
		
	}
	
}	


/*

a
b
c

a<b a<c....1
a>b a<c....0...skip...next part
a<b a>c....0....skip...next part 

b<a b<c...






*/