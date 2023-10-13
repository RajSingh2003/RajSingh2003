
import java.io.*;
import java.util.*;

public class stud
{
       static int rno;
       static String name;
       static float per;
       
       stud (int r,String name1,float p)
       {
            this.rno=r;
            this.name=name1;
            this.per=p;
       }
       float getper()
       {
             return per;
       }
       public  static  void sort(stud s[],int n)
       {
            for (int i=n-1;i>=0;i--)
            {    
                for (int j=i+1;j<n;j++)
                {
                    if (s[j].getper() < s[i].getper())
                    {
                        stud temp=s[i];
                        s[i]=s[j];
                        s[j]=temp;
                    }
                }  
             }
             System.out.println("");
             System.out.print("Roll_no   Name   Percentage");
             for (int k=0;k<n;k++)
             {
                 
                 System.out.println("\n "+s[k].rno+"\t "+s[k].name+"\t "+s[k].per+"\n");
             }
                System.out.println(" "); 
       }      
     /* public static void display(stud s[],int n)
       {
            System.out.print("Roll_no   Name   Percentage");
             for (int i=0;i<n;i++)
             {
                 
                 System.out.print("\n "+s[i].rno+"\t "+s[i].name+"\t "+s[i].per+"\n");
             }
                System.out.println(" "); 
       }*/
       public static void main (String[] args)
       {
              Scanner sc=new Scanner(System.in);
              System.out.print(" Enter no of students : ");
              int n=sc.nextInt();
              stud s[]=new stud[n];
              for (int i=0;i<n;i++)
              {
                   System.out.println("Enter data for Student : "+(i+1));
                   System.out.print(" Enter Roll_no of student : ");
                   int r=sc.nextInt();
                   System.out.print(" Enter Name of student : ");
                   String name1=sc.next();
                   System.out.print(" Enter Percentage of student : ");
                   float p=sc.nextFloat();
                   s[i]= new stud(r,name1,p);
              }
              stud.sort(s,n);
             // stud.display(s,n);
       }
}
