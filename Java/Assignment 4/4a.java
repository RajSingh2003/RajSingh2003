import java.util.*;
import java.io.*;
class patient 
{
      String name;
      int id;
      int hrct;
      int oxy_level;
      
      patient(int id,String name,int hrct,int oxy_level)
      {
          this.id=id;
          this.name=name;
          this.hrct=hrct;
          this.oxy_level=oxy_level;
      }
}
class a1
{
      public static void main(String []args)
      {   
             Scanner sc=new Scanner(System.in); 
             System.out.println(" Enter no of patient : ");
             int n=sc.nextInt();
             patient p[]=new patient[n];
             for (i=0;i<n;++i)
             {
                  System.out.println(" Enter Id of patient : ");
                  int Id=sc.nextInt();
                  System.out.println(" Enter name of patient : ");
                  String  name=sc.next();
                  System.out.println(" Enter HRCT report of patient : ");
                  int hrct=sc.nextInt();
                  System.out.println(" Enter Oxygen level of patient : ");
                  int oxy_level=sc.nextInt();
                  p[i]=new patient(Id,name,hrct,oxy_level); 
             }
             for (i=0;i<n;++i)
             {
                 if ( oxy_level < 95 && hrct > 10 )
                 {
                     try
                     {
                     
                     
                     }
                     catch(Exception e)
                     {
                        System.out.print(" \n Patient is covid positive");                    
                     }
                 }
                 else
                 {
                     System.out.print(" \n Patient ID : "+Id);                    
                     System.out.print(" \n Patient Name : "+name);                    
                     System.out.print(" \n Patient's HRCT  : "+hrct);                    
                     System.out.print(" \n Patient's oxygen level : "+osy_level);                    
                 }  
                       
              }
         }
}

 
