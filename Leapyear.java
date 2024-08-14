//4.write a java program to check the given year is leap year or not.
import java.io.*; 
import java.util.Scanner;
class Leapyear
{
public static void main(String args[]) throws IOException
{
Scanner a=new Scanner(System.in);
System.out.printf("Enter a year:");
int year=a.nextInt();
if(year%400==0 || ((year%4==0) && (year%100!=0)))
{
	System.out.println(year+ " is leap year\n");
}
else
{
	System.out.println(year+ " is not leap year\n");
}
}
}
