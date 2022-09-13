import java.util.Scanner;

class Q16
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Positive No.");
		int a=s.nextInt();
		
		for(int i=2;i<a||i<b;i++)  //2,3,4,5......a=60..30..15..5
		{
			while(a%i==0&&b%i==0)     //0.. 
			{
				System.out.println(i);//2..2...3
				a=a/i;
				b=b/i;	//30..15..5
			}
		}
		
		if(a>2||b>2)
		System.out.println(a);	//5
	
	}
	
}	


/*
121
1. individual dig
2. multiply and make new no. 
3.compare

a input user
temp =a store
new=0

while(temp>0) //121..12...1
dig=temp%10;   // 1..2...1
temp=temp/10;   // 12..1...0
new=new*10+dig;	 //1...10+2=12...120+1=121

1---10
2



*/