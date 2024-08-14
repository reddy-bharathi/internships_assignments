import java.io.*;
import java.util.*;
class Autherone
{
	String name,email;
	char gender;
	Autherone(String name,String email,char gender)
	{
	this.name=name;
	this.email=email;
	this.gender=gender;
	}
	String getName()
	{
	return name;
	}
	String getEmail()
	{
	return email;
	}
	char getGender()
	{
	return gender;
	}
	void setEmail(String email)
	{
	this.email=email;
	}
	/*public String toString();
	{
		return name","+email+","+gender;
	}*/
}
class Demo
{
	public static void main(String args[])
	{
	Autherone a=new Autherone("Aysha","thanveer@gamil.com",'f');
	System.out.println(a.getName());
	System.out.println(a.getGender());
	a.setEmail("abbu@gmail.com");
	System.out.println(a.getEmail());
	//System.out.println(a.toString());
	}
}
