import java.util.*;
import java.io.*;
class patient 
{
      String name;
      int id;
      int age;
      int hrct;
      int oxy_level;
      
      patient(int id,int age,String name,int hrct,int oxy_level)
      {
          this.id=id;
          this.age=age;
          this.name=name;
          this.hrct=hrct;
          this.oxy_level=oxy_level;
      }
}
class a1
{
      public static void main(String []args)
      {      
             int i; 
             Scanner sc=new Scanner(System.in); 
             System.out.println(" Enter no of patient : ");
             int n=sc.nextInt();
             patient p[]=new patient[n];
             for (i=0;i<n;++i)
             {
                  System.out.print(" Enter Id of patient : ");
                  int Id=sc.nextInt();
                  System.out.print(" Enter age of patient : ");
                  int age=sc.nextInt();
                  System.out.print(" Enter name of patient : ");
                  String  name=sc.next();
                  System.out.print(" Enter HRCT report of patient : ");
                  int hrct=sc.nextInt();
                  System.out.print(" Enter Oxygen level of patient : ");
                  int oxy_level=sc.nextInt();
                  p[i]=new patient(Id,age,name,hrct,oxy_level); 
             }
             for (i=0;i<n;++i)
             {
                 if ( p[i].oxy_level < 95 && p[i].hrct > 10 )
                 {
                     try
                     {
                         throw new NullPointerException();
                     
                     }
                     catch(Exception e)
                     {
                         
                        System.out.print(" \n Patient is covid positive\n ");                    
                     }
                 }
                 else
                 {
                     System.out.print(" \n Patient ID : "+p[i].id);                    
                     System.out.print(" \n Patient Age : "+p[i].age);                    
                     System.out.print(" \n Patient Name : "+p[i].name);                    
                     System.out.print(" \n Patient's HRCT  : "+p[i].hrct);                    
                     System.out.print(" \n Patient's oxygen level : "+p[i].oxy_level);                    
                 }  
                       
              }
         }
}

 
