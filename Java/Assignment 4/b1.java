import java.util.*;
import java.io.*;
class EmailId
{
      String user;
      String pass;
      
      EmailId ()
      {
              user="NULL";     
              pass="NULL";
      }
      EmailId (String user,String pass)
      {
              this.user=user;
              this.pass=pass;
      }
}
class b1
{     
      public static void main(String []args)
      {      
             int i; 
             Scanner sc=new Scanner(System.in); 
             EmailId a=new EmailId();
             if (args.length>0)
             {
                  String user=sc.next(args[0]);
                  String pass=sc.next(args[1]);
                  a=new  EmailId(user,pass);
             }
              System.out.print(" User  : "+a.user);
              System.out.print(" Pass  : "+a.pass);
      }
}








