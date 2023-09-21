#include<stdio.h>
main()
{
	int a[3][3],b[3][3],c[3][3],i,j,r1,k,c1,r2,c2;
	printf("enter row and clom of first matrix:");
	scanf("%d%d",&r1,&c1);
	printf("enter row and clom of second matrix:");
	scanf("%d%d",&r2,&c2);
	if(c1==r2)
	{
		printf("given first matrix");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				scanf("%d",&a[i][j]);
			}
			
		}
		printf(" first matrix is\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				printf("%d ",a[i][j]);
			}
			printf("\n");
			
		}
		
		printf("given second matrix\n");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				scanf("%d",&b[i][j]);
			}
		}
		printf(" second matrix is\n");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				printf("%d ",b[i][j]);
			}
			printf("\n");
			
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				for(k=0;k<c1;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		printf("multiplay matrix\n");
			for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
			   printf("%d ",c[i][j]);
			}
		}
}
else
printf("invalid");
		
		
}
