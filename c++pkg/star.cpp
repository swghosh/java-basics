#include<stdio.h>
using namespace std;
    int main()
    {
        for(int i=1;i<=15;i++)
        {
            printf("               ");
            for(int j=1;j<=(16-i);j++)
            printf(" ");
            for(int j=1;j<=i;j++)
            printf("* ");
            printf("\n");
        }
        int k=0;
        for(int i=30;i>=20;i--)
        {
            printf(" ");
            for(int j=1;j<=k;j++)
            printf(" ");
            k++;
            for(int j=1;j<=i;j++)
            printf("* ");
            printf("\n");
        }
        k--;
        for(int i=20;i<=30;i++)
        {
            printf(" ");
            for(int j=1;j<=k;j++)
            printf(" ");
            k--;
            for(int j=1;j<=i;j++)
            printf("* ");
            printf("\n");
        }
        for(int i=15;i>=1;i--)
        {
            printf("               ");
            for(int j=1;j<=(16-i);j++)
            printf(" ");
            for(int j=1;j<=i;j++)
            printf("* ");
            printf("\n");
        }
    }
