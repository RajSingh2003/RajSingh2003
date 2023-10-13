import java.io.*;
import java.util.*;

public class menu
{
      Scanner sc=new Scanner(System.in);
      int r,h,num,fact=1;
      double a;
      void dispFact()
      {
           System.out.println("Enter number to find factorial : ");
           num=sc.nextInt();
           for(int i=num;i>0;--i)
           {
               fact=fact*i;
           }
           System.out.println(" Factorial of number : "+fact);      
      }
      void calcVolume()
      {
           System.out.println("Enter Radius of cylinder : ");
           r=sc.nextInt();
           System.out.println("Enter Height of cylinder : ");
           h=sc.nextInt();
           a=3.1415*r*r*h;
           System.out.println(" Area of cylinder : "+a);     
      }
      void check()
      {
           System.out.println("Enter (3 digit) number to check armstrong no : ");
           num=sc.nextInt();
           int og=num,sum=0,rem;
           while (num>0)
           {
                 rem=num%10;
                 sum=sum+(rem*rem*rem);
                 num=num/10;
           }
           if (og==sum)
               System.out.println(og+" is armstrong number .");
           else
               System.out.println(og+" is not armstrong number .");     
      
      }
      public static void main(String[] args)
      {
        Scanner sc1=new Scanner(System.in);  
        int choice,op=1;
        while(op>=1 && op<=4)
        {
      	System.out.println("1 : Calculate volume of cylinder ");
      	System.out.println("2 : Find factorial");
      	System.out.println("3 : check number is Armstrong ");
      	System.out.println("4 : Exit ");
        System.out.println("Enter your choice : ");
        choice=sc1.nextInt();
        menu m1=new menu();
        switch (choice)
        {
               case 1: m1.calcVolume();
                       break;
               case 2: m1.dispFact();
                       break;
               case 3: m1.check();
                       break;
               case 4:System.exit(0);
                       break;
               default:System.out.println("Enter a valid option... ");                   
         }
       }
     }
}
