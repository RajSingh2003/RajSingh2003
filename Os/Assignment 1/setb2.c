#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
void ChildProcess(int);
void ParentProcess(int);
int main ()
{
    pid_t pid;
    pid=fork();
    
    if (pid==0)
    {
       sleep(10);
       ChildProcess(pid);
    }
    else 
    if (pid>0)
    {
        sleep(3);   
        ParentProcess(pid);
    }
    else
        printf("\n Unsuccessful execution process not created . \n");   
}
void ChildProcess(int pid)
{
     printf("\n I am Child process");
     printf("\n Child process Id : %d",getpid());
     printf("\n My Parent process Id :%d \n\n",getppid());
}
void ParentProcess(int pid)
{
     printf("\n I am Parent process ");
     printf("\n Parent process Id :%d ",getpid());
     printf("\n My Child process Id : %d\n\n",pid);
}
