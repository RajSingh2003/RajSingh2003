import java.io.*;
import java.util.*;

class mynumber
{
      int data;
      void isNegative(int num)
      {
          if (num<0)
              System.out.println(num+" IS Negative number");
          else 
              System.out.println(num+" IS not negative number");
      }            
      void isPositive(int num)
      {
          if (num>0)
              System.out.println(num+" IS positive number");
          else 
              System.out.println(num+" IS not positive number");
      }      
      void isZero(int num)
      {
          if (num == 0)
              System.out.println(num+" IS zero number");
          else 
              System.out.println(num+" IS not zero number");
      }
      void isodd(int num)
      {
          if (num %2!= 0)
             System.out.println(num+" IS odd number");
          else 
              System.out.println(num+" IS  not odd number");
      }
      void iseven(int num)
      {
          if (num %2== 0)
              System.out.println(num+" IS even number");
          else 
              System.out.println(num+" IS not even number");
      }
      public static void main (String[] args)
      {
             int l;
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter number : ");
             l=sc.nextInt();
             mynumber m=new mynumber();
             m.isNegative(l);
             m.isPositive(l);
             m.isZero(l);
             m.isodd(l);
             m.iseven(l);
      }
}
