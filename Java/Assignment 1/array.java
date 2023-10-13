import java.io.*;
import java.util.*;

public class array
{
      public static void main (String[] args)
      {
              Scanner sc=new Scanner(System.in);  
              int size;
              System.out.println("Enter the size of array : ");
              size=sc.nextInt();
              int[] arr=new int[size];
              System.out.println("Enter the array elements : ");
              for (int i=0;i<size;++i)
              {  
                   System.out.println("Enter  array element at index  : "+i);
                   arr[i]=sc.nextInt();
              }
              System.out.println("The array elements in reversed order  : ");
              for (int i=size-1;i>=0;--i)
                   System.out.println(": "+arr[i]);
       }     
}
