class Armstrong
{
	public static void main(String args[])
	{
		int n=153,d,sum=0;
		int temp=n;
		while(n>0)
		{
			d=n%10;
			sum=sum+(d*d*d);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("yes it is a Armstrong number");
		else
			System.out.println("No it is not a Armstrong number");
	}
}
