import java.util.*;
class Lcm
{
	public static int gcd(int a,int b)
	{
		int rem;
		if(b%a==0)
			return a;
		else
		{
			rem=b%a;
			return gcd(rem,b);
			
		}
	}			
	public static void main(String args[])
	{
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the values of a and b");
		a=in.nextInt();
		b=in.nextInt();
		int res=gcd(a,b);
		int l=(a*b)/res;
		System.out.println(l);
	}
}
	
