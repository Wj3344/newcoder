
#include<stdio.h>
#include<string.h>


int main()
{
    int sum, n = 0;
    scanf("%d", &sum);
    getchar();
    char c = getchar();
    while ((2 * (n + 1) * (n + 1) - 1) <= sum)
    {
        n++;
    }
    int temp = sum - (2 * n * n - 1);
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < (i + 2 * (n - i) - 1); j++)
        {
            if (j < i)
            {
                printf(" ");
            }
            else
            {
                printf("%c", c);
            }
        }
        printf("\n");
    }
    for (int i = 1; i < n; i++)
    {
        for (int j = 0; j < ((2 * i + 1) + (n - 1 - i)); j++)
        {
            if (j < (n - 1 - i))
            {
                printf(" ");
            }
            else
            {
                printf("%c", c);
            }
        }
        printf("\n");
    }
    printf("%d\n", temp);
    return 0;
}