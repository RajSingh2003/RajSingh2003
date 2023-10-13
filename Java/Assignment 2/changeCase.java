import java.io.*;
import java.util.*;

public class changeCase
{
       public static void main (String[] args)
       {
              String fname,mname,lname;
              Scanner sc=new Scanner(System.in);
              System.out.print(" Enter first name of person : ");
              fname=sc.next();
              System.out.print(" Enter middle name of person : ");
              mname=sc.next();
              System.out.print(" Enter last name of person : ");
              lname=sc.next();
              // Middle name
              String finalM,f,l;
              int len=mname.length();
              f=mname.substring(0,1);
              f=f.toUpperCase();
              l=mname.substring(1,len);
              finalM=f+l;
              //output
              System.out.println(" Last name of person : "+lname);
              System.out.println(" First name of person : "+fname);
              System.out.println(" Middle name of person : "+finalM);
         }
}
/*
OUTPUT:
ty55@pc52:~/Ty 55/Java/Assignment 2$ javac changeCase.java
ty55@pc52:~/Ty 55/Java/Assignment 2$ java changeCase
 Enter first name of person : Atharv 
 Enter middle name of person : sanjay
 Enter last name of person : Upasani
 Last name of person : Upasani
 First name of person : Atharv
 Middle name of person : Sanjay
ty55@pc52:~/Ty 55/Java/Assignment 2
*/
