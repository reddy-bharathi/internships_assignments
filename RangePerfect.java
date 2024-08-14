import java.util.*;
class RangePerfect
{
	public static void main(String args[])
	{
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the range");
		a=in.nextInt();
		b=in.nextInt();
		for(int i=a;i<=b;i++)
		{
			int c=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
					c=c+j;
			}
			if(c==i)
				System.out.println(i);
		}
	}
}
