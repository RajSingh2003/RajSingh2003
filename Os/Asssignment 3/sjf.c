#include<stdio.h>
#include<math.h>
#include<stdlib.h>

void main()
{
     int i,n,j;
     printf("\n Enter number of processses : ");
     scanf("%d",&n);
     int at[n],bt[n],rt[n],ct,smallest,remain=0,time,temp;
     float sum_wt=0,sum_tat=0;
     
     printf("\n Enter Arrival time ");
     for (i=0;i<n;i++)
         scanf("%d",&at[i]);
         
     printf("\n Enter Burst time ");
     for (i=0;i<n;i++)
     {
          scanf("%d",&bt[i]);
          rt[i]=bt[i];
     }
         
     
     printf("\n Pro \tAt\tbt\tTat\twt");
     for (time=0;remain!=n;time++)
     {
           for (i=0;i<n;i++)
           {
                if (at[i]<=time && rt[i])
                    smallest=i;
           }
           rt[smallest]--;
           if (rt[smallest]==0)
           {
              remain++;
              ct=time+1;
              printf("\n p[%d]\t%d\t%d\t%d\t%d ",smallest+1,at[smallest],bt[smallest],ct-at[smallest],ct-bt[smallest]-at[smallest]);
              sum_tat=sum_tat+ct-at[smallest];
              sum_wt=sum_wt+(ct-bt[smallest]-at[smallest]);
           }
      }
      sum_wt/=n;
      sum_tat/=n;
      printf("\n Average Waiting time : %f\n Average Turn Around time : %f\n\n",sum_wt,sum_tat);
}
