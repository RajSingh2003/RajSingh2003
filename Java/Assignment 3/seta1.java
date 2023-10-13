import java.util.*;

class continent
{
      public String c1;
      continent(String c1)
      {
        this.c1=c1;
      }

}
class country extends continent
{
      String c2;
      country(String c1,String c2)
      {
        super(c1);
        this.c2=c2;
      }
}
class state extends country
{
      String st;
      state(String c1,String c2,String st)
      {
        super(c1,c2);
        this.st=st;
      }
}

class place extends state
{
      String pl;
      place(String c1,String c2,String st,String pl)
      {
        super(c1,c2,st);
        this.pl=pl;
      }
}
class seta1
{
   public static void main(String args[]) 
   {
                      place p=new place("Asia","Bharat","Maharashtra","Nashik");
                      System.out.println("Continent : "+p.c1);
                      System.out.println("Country : "+p.c2);
                      System.out.println("State : "+p.st);
                      System.out.println("Place : "+p.pl);
   }
}
/*
ty55@pc44:~/Ty 55/Java/Assignment 3$ javac seta1.java
ty55@pc44:~/Ty 55/Java/Assignment 3$ java seta1
Continent : Asia
Country : Bharat
State : Maharashtra
Place : Nashik
ty55@pc44:~/Ty 55/Java/Assignment 3$ 
*/
