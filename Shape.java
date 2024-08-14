import java.io.*;
import java.util.*;
class Shape
{
	void numberOfSides()
	{
	System.out.println("sides of Different shapes");
	}		
}
class Triangle extends Shape
{
	void numberOfSides()
	{
	System.out.println("sides in Triangle is 3");
	}
}
class Hexagon extends Shape
{
	void numberOfSides()
	{
	System.out.println("sides in  is Hexagon 6");
	}
}
class Trapezoid extends Shape
{
	void numberOfSides()
	{
	System.out.println("sides in  is Trapezoid 4");
	}
}
class Demo
{
	public static void main(String args[])
	{
	Shape s;
	s=new Triangle();
	s.numberOfSides();
	s=new Trapezoid();
	s.numberOfSides();
	s=new Hexagon();
	s.numberOfSides();
	}
}
