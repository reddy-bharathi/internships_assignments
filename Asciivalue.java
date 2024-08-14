//2. write a program to print the character ASCII values and read a different type of input from user using Buffered Reader.
import java.io.*; 
class Asciivalue 
{ 
public static void main(String args[])throws Exception 
{ 
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.printf("Enter A character :");
byte b = (byte)br.read();//char = 1byte
System.out.println("Ascii value is "+b); 
} 
}
