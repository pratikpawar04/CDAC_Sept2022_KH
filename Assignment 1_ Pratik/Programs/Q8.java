import java.util.Scanner;

class Q8
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a No.");
		int a=s.nextInt();
		System.out.println("The Digits of entered no. is:");
		while(a>0||a<0)    //....128..12....1...0false
		{
			if(a<0)
			{
			System.out.println((a%10)*(-1)); //....8....2....1
			a=a/10;	//12...1....0
			}
			else
			{
			System.out.println(a%10); //....8....2....1
			a=a/10;	//12...1....0
			}
		}	
	}
	
}	

/*
In the Gregorian calendar, a normal year consists of 365 days. 
Because the actual length of a sidereal year (the time required 
for the Earth to revolve once about the Sun) is actually 365.2425
 days, a "leap year" of 366 days is used once every four years to 
 eliminate the error caused by three normal (but short) years.
 Any year that is evenly divisible by 4 is a leap year:
 for example, 1988, 1992, and 1996 are leap years.

However, there is still a small error that must be accounted for. 
To eliminate this error, the Gregorian calendar stipulates that a 
year that is evenly divisible by 100 (for example, 1900) is a leap
year only if it is also evenly divisible by 400.

For this reason, the following years are not leap years:

1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600

This is because they are evenly divisible by 100 but not by 400.

The following years are leap years: 1600, 2000, 2400

This is because they are evenly divisible by both 100 and 400.

*/

//4
//100and400
//100 and not 400

//%4&&%100&&%400

