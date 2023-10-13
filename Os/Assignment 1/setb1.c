#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<sys/wait.h>
void bubbleSort();
void insertionSort();
int arr[10],n;
void main ()
{
     int i;
     pid_t pid;
     printf("\n Enter size of array : ");
     scanf("%d",&n);
     printf("\n Enter %d array elements : ",n);
     for (i=0;i<n;++i)
          scanf("%d",&arr[i]);
     
     printf("\n The array elements : ");
     for (i=0;i<n;++i)
          printf(" %d\t ",arr[i]);
     
     pid=fork();
     if (pid==0)
     {
       printf("\n I am child process \n");
       insertionSort();
       printf("\n The array elements sorted using insertion \n : \n");
       for (i=0;i<n;++i)
            printf(" %d\t ",arr[i]);
       printf("\n");
      }   
      else 
      if (pid>0)
      {
        wait(NULL);
        printf("\n I am parent process \n");
        bubbleSort();
        printf("\n The array elements sorted using bubble \n : \n");
        for (i=0;i<n;++i)
            printf(" %d\t ",arr[i]);   
        printf("\n");   
      }   
      else
         printf("\n Unsuccessful execution process not created . \n");    
}

void bubbleSort()
{
     for (int i=0;i<n;++i)
          for (int j=0;j<n-i-1;++j)
               if (arr[j]>arr[j+1])
               {
                   int temp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;     
                }
}
void insertionSort()
{
     int j;
     for (int i=1;i<n;++i)
     {
          int temp=arr[i];
          j=i-1;
          for (j>=0;arr[j]>temp;j--)
          {
               arr[j+1]=arr[j];
          }
          arr[j+1]=temp;
      }

}
