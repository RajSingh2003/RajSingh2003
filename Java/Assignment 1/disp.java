import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class disp
{
       public static void main (String[] args)
       {  
              Date date=new Date();
              SimpleDateFormat df=new  SimpleDateFormat("dd/mm/yyyy");
              System.out.println("Current date is : "+df.format(date));
              SimpleDateFormat df1=new  SimpleDateFormat("EEEEEE MMMM dd yyyy");
              System.out.println("Current date is : "+df1.format(date));
              SimpleDateFormat df2=new  SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
              System.out.print("Current date is : "+df2.format(date));
              SimpleDateFormat df3=new  SimpleDateFormat("dd/mm/yy HH:mm:ss a z");
              System.out.println("Current date is : "+df3.format(date));
              SimpleDateFormat df4=new  SimpleDateFormat("hh:mm:ss");
              System.out.println("Current time is : "+df4.format(date));
              SimpleDateFormat df5=new  SimpleDateFormat("w");
              System.out.println("Current weak of year is : "+df5.format(date));
              SimpleDateFormat df6=new  SimpleDateFormat("W");
              System.out.println("Current weak of month is : "+df6.format(date));
              SimpleDateFormat df7=new  SimpleDateFormat("D");
              System.out.println("Current day of year is : "+df7.format(date));
       }
}
