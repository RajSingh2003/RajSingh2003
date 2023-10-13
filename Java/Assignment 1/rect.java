import java.io.*;
import java.util.*;

public class rect
{
      public static void main (String[] args)
      {
             int l,b;
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter length and breadth : ");
             l=sc.nextInt();
             b=sc.nextInt();
             int a=l*b,p=2*(l+b);
             System.out.println("Area of rectangle  : "+a);
             System.out.println("Perimeter of rectangle  : "+p);
      }
}
