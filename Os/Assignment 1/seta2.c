#include<stdio.h>
#include<sys/types.h>
void main ()
{
    int pid,retnice;
    pid=fork();
    printf("\n Press ctrl + c to stop process");
    for (;;)
    {
          if (pid==0)
          {
             retnice=nice(-5);
             printf("\n Child gets highest CPU priority %d \n",retnice);
             sleep(1);
          }
          else 
          if (pid>0)
          {
             retnice=nice(4);
             printf("\n Parent gets lowest CPU priority %d \n",retnice);
             sleep(1);
          }  
          else
             printf("\n Unsuccessful execution process not created . \n");   
    }
}
