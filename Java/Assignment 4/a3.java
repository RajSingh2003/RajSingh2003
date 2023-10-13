import java.util.*;
import java.io.*;
class a3
{
      public static void main(String []args)throws IOException
      {  
           
             File f;
             FileReader file=new FileReader("demo1.txt");
             FileWriter file2=new FileWriter("demo2.txt");  
             Scanner sc=new Scanner(file);
             String ch,ch2;
             while (sc.hasNext())
             { 
                    ch=sc.nextLine();
                    file2.write(ch);
              }
              file.close();
              file2.close();
              System.out.println(" Copy finished ");
      }
}
