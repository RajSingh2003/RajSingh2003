import java.io.*;
import java.util.*;

public class sortnum
{
       public static void main (String[] args)
       {
              //Scanner sc=new Scanner();
              int arr[]=new int[5];
              for (int i=0;i<5;++i)
                   arr[i]=Integer.parseInt(args[i]);
              System.out.println(" Array elements : ");     
              for (int i=0;i<5;++i)
              {
                   System.out.print("  "+arr[i]+" ");
              }
              for (int i=0;i<5;++i)
              {  
                 for (int j=i+1;j<5;++j)
                 {
                      if (arr[j]<arr[i])
                      {
                          int temp=arr[i];
                          arr[i]=arr[j];
                          arr[j]=temp;
                       }
                  }
               }
               System.out.println("");
               System.out.println(" Sorted array elements : ");
               for (int i=0;i<5;++i)
               {
                   System.out.print("  "+arr[i]+" ");
               } 
               System.out.println("");
       }
}

/*
OUTPUT:
ty55@pc52:~/Ty 55/Java/Assignment 2$ javac sortnum.java
ty55@pc52:~/Ty 55/Java/Assignment 2$ java sortnum 50 40 30 20 10
 Array elements : 
  50   40   30   20   10 
 Sorted array elements : 
  10   20   30   40   50 
ty55@pc52:~/Ty 55/Java/Assignment 2$ 
*/
