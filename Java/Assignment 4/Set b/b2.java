import java.util.*;
import java.io.*;
class EmailId
{
      public String username;
      public String password;
      
      EmailId ()
      {
              username="abc";     
              password="123";
      }
      EmailId (String user,String pass)
      {
              this.username=user;
              this.password=pass;
      }
}

class b2
{     
      public static void main(String []args)
      {      
             int i; 
             Scanner sc=new Scanner(System.in); 
             EmailId a=new EmailId();
             String user,pass;
            
           
             
             user=args[0];
             pass=args[1];
             
             System.out.println(" User Name   : "+a.username);
             System.out.println(" Password   : "+a.password);
             
             System.out.println(" User Name   : "+user);
             System.out.println(" Password   : "+pass);
            
            
                     try
                          { 
                                if  ( (a.username).equals(user) )
                                {
                                    System.out.println(" User is valid ");
                                    try
                                    { 
                                         if  ( (a.password).equals(pass) )
                                         {
                                             System.out.println(" Password is valid ");
                                         }
                                         else
                                             throw new Exception();
                                    }
                                    catch(Exception e)
                                    {
                                            System.out.println("Invalid  password exception caught ");
                                    }   
                                }
                                else
                                {
                                    throw new Exception();
                                 }                     
                      }
                     catch(Exception e)
                     {
                              System.out.println("Invalid  User exception caught ");
                     }
              
             
             
   }        
      
}
