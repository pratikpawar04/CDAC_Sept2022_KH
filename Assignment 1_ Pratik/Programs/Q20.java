import java.util.Scanner;

class Q20
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no. of terms to be printed in odd series");
		int n=s.nextInt();
		System.out.println();
		int odd=1;
		for(int i=1;i<=n;i++)  //1,2,3,4,13
		{
		  System.out.print(odd+" ");	
		  odd=odd+2;
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