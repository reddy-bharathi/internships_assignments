import java.io.*;
import java.util.*;
class Date
{
	int day,year;
	String month;
	Date(int day,String month,int year)
	{
	this.day=day;
	this.month=month;
	this.year=year;
	}
	int getDay()
	{
	return day;
	}
	String getMonth()
	{
	return month;
	}
	int getYear()
	{
	return year;
	}
	public String toString()
	{
	return day+"/"+month+"/"+year;
	}
}
class Time
{
	int hour,min,sec;
	Time(int hour,int min,int sec)
	{
	this.hour=hour;
	this.min=min;
	this.sec=sec;
	}
	int getHour()
	{
	return hour;
	}
	int getMin()
	{
	return min;
	}
	int getSec()
	{
	return sec;
	}
	public String toString()
	{
	return hour+":"+min+":"+sec;
	}
}
class DateAndTime
{
	String date;
	String time;
	DateAndTime(String date,String time)
	{
	this.date=date;
	this.time=time;
	}
	
	String getDate()
	{
	return date;
	}
	String getTime()
	{
	return time;
	}
	public String toString()
	{
	return date+"-"+time;
	}

}
class Demo
{
	public static void  main(String args[])
	{
	Date d=new Date(12,"july",2000);
	Time t=new Time(8,30,05);
	DateAndTime dt=new DateAndTime(d.toString(),t.toString());
	System.out.println(d.toString());
	System.out.println(t.toString());
	System.out.println(dt.toString());
	}
}
