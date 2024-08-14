class Reverse 
{
	public static void main(String args[])
	{
		int n=123,rev=0,d;
		while(n>0)
		{
			d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}
		System.out.println(rev);
	}
}
		
