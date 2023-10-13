import java.io.*;
import java.util.*;

public class employee
{
       static int id=1;
       static String name="Atharv";
       static String dep="cs";
       static int sal=100000;
       employee ()
       {
                this.id=id;
                this.name=name;
                this.dep=dep;
                this.sal=sal;
       } 
       employee (int i1,String n,String d,int s)
       {
                this.id=i1;
                this.name=n;
                this.dep=d;
                this.sal=s;
       }
       public static void display()
       {
               System.out.println(" Id : "+id);
               System.out.println(" Name : "+name);
               System.out.println(" Department : "+dep);
               System.out.println(" Salary : "+sal);
       }
       public static void main (String[] args)
       {
              employee e1=new employee();
              e1.display();
              employee e2=new employee(2,"xyz","cs",100000);
              e1.display();
      }
}
              
 /*
 OUTPUT:
 ty55@pc52:~/Ty 55/Java/Assignment 2$ javac employee.java
ty55@pc52:~/Ty 55/Java/Assignment 2$ java employee
 Id : 1
 Name : Atharv
 Department : cs
 Salary : 100000
 Id : 2
 Name : xyz
 Department : cs
 Salary : 100000
*/
