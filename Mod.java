class Mod
{
	private static void display(int a)
	{
		System.out.println("arguments"+a);
	}
	private static void display(int a,int b)
	{
		System.out.println("arguments"+a+"and"+b);
	}
	private static void display(int a,int b,int c)
	{
		System.out.println("arguments"+a+","+b+"and"+c);
	}
	
	public static void main(String args[])
	{
		display(1);
		display(1,4);
		display(2,6,8);
	}
}
