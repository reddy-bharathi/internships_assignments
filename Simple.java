import java.io.*;
import java.util.*;
 class Simple
    {
      Simple(int a,int b)
    {
      System.out.println("This is parameter constructor");
      System.out.println(" sum is " + (a+b));
    }
    
    }
class Demo
   {
     public static void main(String args[])
   {
     Simple s= new Simple(10,20);
   }
  
   }
