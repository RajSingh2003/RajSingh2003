import java.io.*;
import java.util.*;

class mat
{
      public static void main(String[] args)
      {
             int m,n,p,q,op=1;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter rows for matrix 1 : ");
             m=sc.nextInt();
             System.out.println("Enter no of columns for matrix 1 : ");
             n=sc.nextInt();
             
             int[][] a=new int[m][n];
             System.out.println("Enter values in matrix 1 : ");
             for (int i=0;i<m;++i)
                  for(int j=0;j<n;++j)
                      a[i][j]=sc.nextInt();           
             
             System.out.println("----------------------------------------------------------------------------");
             System.out.println("MATRIX 1 IS  : ");
             for (int i=0;i<m;++i)
             {
                  for(int j=0;j<n;++j)
                  {
                      System.out.print(" "+a[i][j]);     
                  }
                  System.out.println("");
             }
             System.out.println("----------------------------------------------------------------------------");
                  
             System.out.println("Enter no of rows for matrix 2 : ");
             p=sc.nextInt();
             System.out.println("Enter no of columns for matrix 2 : ");
             q=sc.nextInt();
             int[][] b=new int[p][q];
             
             System.out.println("Enter values in matrix 2 : ");
             for (int i=0;i<p;++i)
                  for(int j=0;j<q;++j)
                      b[i][j]=sc.nextInt();
             
             System.out.println("----------------------------------------------------------------------------");
             System.out.println("MATRIX 2 IS   : ");
             for (int i=0;i<p;++i)
             {
                  for(int j=0;j<q;++j)
                  {
                      System.out.print(" "+b[i][j]);     
                  }
                  System.out.println("");
             }
             System.out.println("----------------------------------------------------------------------------");
             
             while (op>=1 &&op<=4)
             {
                 System.out.println("1 : Addition ");
      	         System.out.println("2 : Multiplication");
                 System.out.println("3 : Transpose ");
         	 System.out.println("4 : Exit ");
                 System.out.println("Enter your choice : ");
                 op=sc.nextInt();
                 
                 switch (op)
                 {
                          case 1: if (m==p && n==q)
                                  {
                                     int[][] c=new int[m][n];
                                     System.out.println("----------------------------------------------------------------------------");
                                     System.out.println("Addition is : ");
                                      for (int i=0;i<m;++i)
                                      {
                                         for(int j=0;j<n;++j)
                                         {
                                            c[i][j]=a[i][j]+b[i][j];
                                            System.out.print(" "+c[i][j]+" ");
                                          }
                                          System.out.println("");
                                      }                                
                                     System.out.println("----------------------------------------------------------------------------");
                                  }
                                  else
                                     System.out.println("Addition is not possible Order is not same : ");                                     
                                 break;
                          case 2: if (n==p)
                                  {
                                     int[][] c=new int[m][q];
                                     System.out.println("----------------------------------------------------------------------------"); 
                                     System.out.println("Multiplication is : ");
                                      for (int i=0;i<m;++i)
                                      {
                                         for(int j=0;j<q;++j)
                                         {
                                           c[i][j]=0;
                                           for (int k=0;k<n;k++)
                                           { 
                                              c[i][j]+=a[i][k]*b[k][j];
                                           }
                                           System.out.print(" "+c[i][j]+" ");
                                        }
                                        System.out.println("");
                                      }
                                      System.out.println("----------------------------------------------------------------------------");
                                   }
                                   else
                                       System.out.println("Multiplication is not possible Order is not same : ");	
                                   break;
                          case 3:  System.out.println("----------------------------------------------------------------------------");
                                   System.out.println("Transpose of mat 1 : ");
                                   int [][] a1=new int[n][m];
                                   for (int i=0;i<n;++i)
                                   { 
                                         for (int j=0;j<m;++j)
                                         {
                                             //a1[j][i]=a[i][j];
                                             System.out.print(" "+a[j][i]+" "); 
                                         }
                                         System.out.println("");       
                                   }
                                   System.out.println("----------------------------------------------------------------------------");
                                   System.out.println("Transpose of mat 2 : ");
                                   int [][] b1=new int[q][p];
                                   for (int i=0;i<p;++i)
                                   { 
                                         for (int j=0;j<q;++j)
                                         {
                                             //b1[j][i]=b[i][j]; 
                                             System.out.print(" "+b[j][i]+" "); 
                                         }
                                         System.out.println("");       
                                   }
                                   System.out.println("----------------------------------------------------------------------------");
                                 break;
                          case 4:System.out.println("----------------------Thank you --------------------");
                                 System.out.println("----------------------------------------------------------------------------");
                                 System.exit(0);
                                 break;
               default:System.out.println("Enter a valid option... ");      
          }
       }
   }
}
