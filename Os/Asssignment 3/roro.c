#include<stdio.h>
#include<math.h>
#include<stdlib.h>

void main()
{
     int i,n,j,ct=0,count,qt;
     printf("\n Enter number of processses : ");
     scanf("%d",&n);
     count=n; 
     int at[n],bt[n],rt[n];
     float sum_wt=0,sum_tat=0;
     
    // printf("\n Enter Arrival time ");
     /*for (i=0;i<n;i++)
         scanf("%d",&at[i]);
      */
         
     for (i=0;i<n;i++)
     {
          printf("\n For process [%d] : ",i+1);
          printf("\n Enter Arrival time : ");
          scanf("%d",&at[i]);
          printf("\n Enter Burst time : ");     
          scanf("%d",&bt[i]);
          rt[i]=bt[i];
     }
     
     printf("\n Enter time quantam : ");
     scanf("%d",&qt);    
     
     printf("\n Pro \tAt\tbt\tTat\twt");
     for (ct=0,i=0;count!=0;)
     {
          if (rt[i]<=qt && rt[i]>0 )
          {
              ct=ct+rt[i];
              rt[i]=0;
              count--;
              printf("\n p[%d]\t%d\t%d\t%d\t%d ",i+1,at[i],bt[i],ct-at[i],ct-bt[i]-at[i]); 
              sum_tat=sum_tat+ct-at[i];
              sum_wt=sum_wt+ct-bt[i]-at[i];
               
          }
          else 
          if (rt[i]>0)
          {
             rt[i]=rt[i]-qt;
             ct=ct+qt;
          }
          else
          if (i ==n-1)
          {
              i=0;
          }
          else 
          if (at[i+1] <= ct)
          {
              i++;
          }
          else
          {
             i=0;
          }
     }
     sum_wt/=n;
     sum_tat/=n;
     printf("\n Average Waiting time : %f\n Average Turn Around time : %f\n\n",sum_wt,sum_tat);
  /*   
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
  */
}
