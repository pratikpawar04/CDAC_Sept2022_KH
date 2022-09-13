import java.util.Scanner;

class Q18
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Positive No.");
		int a=s.nextInt();
		
		for(int i=2;i<=a;i++)  //i=2......a=24..12...6...3
		{
			while(a%i==0)     //0..
			{
				System.out.println(i);//2,2,2,3
				a=a/i; //
			}
		}
		
		//if(a>2)
		//System.out.println(a);	//3
	
	}
	
}	


/*

2   60
2   30
3   15
5   5
     1


2	50	120	
2   25  60	
2   25   30
3   25    15
5   25    5
5   5      1  
    1      1



1.No.=12--->a.........1,2,3,4,6,12
14.....1,2,7,14.....8,9,10,11,12,13
2.n=a/2
3.loop....i=1......n
4.check for a%i==0... 



12
1,2,3,4,5,6,7,8,9,10,11,12
* * * *   *             *

16
1,2,3,4,5,6,7,8,9,10,11,12
* *   *       *         


*/