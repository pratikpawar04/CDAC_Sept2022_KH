import java.util.Scanner;

class Q6
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Year No. in YYYY format:");
		int a=s.nextInt();
		
		if(a%4==0)    //2004%4==0
		{
			if(a%400==0)   //nested if
			{
				System.out.println("Year "+a+" is a Leap Year");
			}				
			else if(a%100==0)
			{
				System.out.println("Year "+a+" is Not a Leap Year");
			}	
			else
			{
				System.out.println("Year "+a+" is a Leap Year");
			}				
		}
		else
		{
			System.out.println("Year "+a+" is Not a Leap Year");
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

