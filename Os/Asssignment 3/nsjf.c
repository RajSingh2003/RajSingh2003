#include<stdio.h>
#include<math.h>
#include<stdlib.h>

void main()
{

     int i,n,j;
     printf("\n Enter number of processses : ");
     scanf("%d",&n);
     
     
     
     int at[n],p[n],bt[n],wt[n],tat[n],avwt=0,avtat=0,start[n],t[n],ct[n];
     printf("\n Enter  processses : ");
     for (i=0;i<n;i++)
     {
          scanf("%d",&p[i]);
     }     
     
     
     printf("\n Enter Arrival time ");
     for (i=0;i<n;i++)
     {
          scanf("%d",&at[i]);
          t[i]=at[i];
     }
     
     printf("\n Enter Burst time ");
     for (i=0;i<n;i++)
     {
          scanf("%d",&bt[i]);
     }
     
     printf("\n Before sorting \n");
     printf("\nPro\tAt\tBt  : \n");
     for (i=0;i<n;i++)
     {
         printf("\n p[%d]\t%d\t%d\n",p[i],at[i],bt[i]);
     }
     int temp;
     for (i=0;i<n;i++)
         for(j=0;j<n-1-i;j++)
         {
            if ( (bt[j] >bt[j+1]) && (at[j]>at[j+1]) )
            { 
               temp=bt[j];
               bt[j]=bt[j+1];
               bt[j+1]=temp;
               
               temp=p[j];
               p[j]=p[j+1];
               p[j+1]=temp;
               
               temp=at[j];
               at[j]=at[j+1];
               at[j+1]=temp;
            }
         }
         
     //int start[n];    
     start[0]=0;
     for (i=1;i<n;i++)
     {
         start[i]=start[i-1]+bt[i-1];
     }
     for (i=0;i<n;i++)
     {
         wt[i]=start[i]-t[i];
         avwt+=wt[i];
     }
     avwt/=n;
     
     
     for (i=0;i<n;i++)
     {
         tat[i]=wt[i]+bt[i];
         ct[i]=tat[i]+t[i];
         avtat+=tat[i];
     }
     avtat/=n;
     //ganttt chartt
     printf("\n\n---------------------------:\n");
     printf("\n\t\t ***** Gantt chart ******** : \n");
     for (i=0;i<n;i++)
     {
         printf("   %d <p[%d]> %d ",start[i],p[i],ct[i]);
     }
     printf("\n\n ------------------------------\n");
     
     
     
     printf("\npro\tAt\tBt\tWt\t TAT");
     for (i=0;i<n;i++)
     {
          printf("\n p[%d]\t%d\t%d\t%d\t%d\n",p[i],at[i],bt[i],wt[i],tat[i]);
     }
     printf("\n Average Waiting time : %d ",avwt);
     printf("\n Average turn around  time : %d ",avtat); 
     /*
     printf("\npro\tAt\tBt\tWt\t TAT");
     for (i=0;i<n;i++)
     {
         wt[i]=0;
         tat[i]=0;
         for (j=0;j<n;j++)
         {
              wt[j]=wt[j]+bt[j]; 
         }   
         tat[i]=wt[i]+bt[i];
         awt+=wt[i];
         atat[i]+=tat[i];
         printf("\n P%d\t%d\t%d\t%d\t %d",i+1,at[i],bt[i],wt[i],tat[i]);  
     }  
     printf("\n Average Waiting time : %d\n Average Turn Around time : %d\n\n",awt,atat);   
   */
}
