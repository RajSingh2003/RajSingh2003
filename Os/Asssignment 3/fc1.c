#include<stdio.h>
#include<math.h>
#include<stdlib.h>

void main()
{
     int i,n;
     printf("\n Enter number of processses : ");
     scanf("%d",&n);
     
     int at[n],bt[n],wt[n],tat[n],awt=0,atat=0,start[n],ct[n],t[n];
     printf("\n Enter Arrival time ");
     for (i=0;i<n;i++)
         scanf("%d",&at[i]);
         
     //printf("\n Enter Burst time ");
     for (i=0;i<n;i++)
         bt[i]=rand()%10;    
     /*    
     int temp[n];
     temp[0]=0;
     for (i=0;i<n;i++)
     {
         wt[i]=0;
         temp[i+1]=wt[i]+bt[i];
         wt[i]=temp[i]-at[i];
         awt+=wt[i];
         tat[i]=wt[i]+bt[i];
         atat+=tat[i];
     }
     */
     start[0]=0;
     for (i=1;i<n;i++)
         start[i]=start[i-1]+bt[i-1];
         //awt+=wt[i];
     
     for (i=0;i<n;i++)
     {
         wt[i]=start[i]-at[i];
         awt+=wt[i];
         tat[i]=wt[i]+bt[i];
         ct[i]=tat[i]+t[i];
         atat+=tat[i];
     }
     
      printf("\n\n---------------------------:\n");
     printf("\n\t\t ***** Gantt chart ******** : \n");
     for (i=0;i<n;i++)
     {
         printf("   %d <p[%d]> %d ",start[i],i+1,ct[i]);
     }
     printf("\n\n ------------------------------\n");
     
     
     awt=awt/n;
     atat=atat/n;
     printf("\npro\tAt\tBt\tWt\t TAT");
     for (i=0;i<n;i++)
     {
       printf("\n P%d\t%d\t%d\t%d\t %d",i+1,at[i],bt[i],wt[i],tat[i]);  
     }  
     printf("\n Average Waiting time : %d\n Average Turn Around time : %d\n\n",awt,atat);
}
