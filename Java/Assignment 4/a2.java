import java.util.*;
import java.io.*;
class a2
{
      public static void main(String []args)
      {  
           
             File f;
             FileReader file=new FileReader(demo.txt);
             Scanner sc=new Scanner(f);
             String ch1,ch2;
             while (sc.hasNext())
             { 
                    StringBuilder ch1=new StringBuilder();   
                    ch=sc.next();
                    ch2=ch1.toUpperCase();
                    ch1.append(ch2);
                    ch1.reverse();
                    System.out.println(ch1);
             } 
             f.close();
      }     
}
