#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<string.h>
#include<sys/stat.h>
//#include<fcnt1.h>
#include<sys/wait.h>
#include<stdlib.h>

void token(char *s,char *tok[]);
void count(char op);

void main()
{
     char br[80],*ar[10];
     while (1)
     {
           printf("\n Myshells ");
           fflush(stdin);
           fgets(br,80,stdin);
           token(br,ar);
           if (strcmp(ar[0],"count")==0)
               count(ar[1][0]);
           else
           {
               pid_t pid=fork();
               if (pid<0)
                  printf("\n Error ..");
               else
               if (pid==0)
               {
                  if (execvp(ar[0],ar)==-1)
                     printf("\n Bad Command ");
               }
               else 
                   wait(NULL);
            } 
     }
     
}
void token(char *s,char *tok[])
{
     int i=0;
     char *p;
     p=strtok(s, " " );
     while (p!=NULL)
     {
          tok[i++]=p;
          p=strtok(NULL, " " );
     }
     tok[i]=NULL;
}
/*
void count(char op)
{
     int cc=0,wc=0,lc=0;
     char ch;
     FILE *fp;
     fp=fopen("atharv.txt","r");
     if (fp==NULL)
     {
        printf("\n File does not exist");
        exit(0);
     }
     while (ch=fgetc(fp)!=EOF)
     {
            cc++;
            if (ch==' ')
            { 
                wc++;
                printf("Space ..");
            }
            if (ch== '\n')
            {
                if (ch==' ')
                   wc++;
                lc++;
            }
     }
     while (ch=fgetc(fp)!=EOF)
     {
           if (ch==' ')
                wc++;
     }
     while (ch=fgetc(fp)!=EOF)
     {
           if (ch== '\n')
            {
                if (ch==' ')
                   wc++;
                lc++;
            }
     }
     
     
     fclose(fp);
     
     switch (op)
     {
            case 'c':
                     printf("\n Number of characters %d",cc);
                     break;
            case 'w':
                     printf("\n Number of words %d",wc);
                     break;
            case 'l':
                     printf("\n Number of lines %d",lc);
                     break;
    }
}
*/
void count (char op)
{

     int cc=0,wc=0,lc=0;
     char ch;
     FILE *fp;
     fp=fopen("atharv.txt","r");
     if (fp==NULL)
     {
        printf("\n File does not exist");
        exit(0);
     }
     while (ch=fgetc(fp)!=EOF)
     {
     //       cc++;
            if (ch==' ')
            { 
                wc++;
                printf("Space ..");
            }
       /*     if (ch== '\n')
            {
                if (ch==' ')
                   wc++;
                lc++;
            }*/
     }
     fclose(fp);
     
     switch (op)
     {
            case 'c':
                     printf("\n Number of characters %d",cc);
                     break;
            case 'w':
                     printf("\n Number of words %d",wc);
                     break;
            case 'l':
                     printf("\n Number of lines %d",lc);
                     break;
    }
}
