#include <iostream>
#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;
const int maxn = 10005;
struct bag
{
    int id, income, num;
} a[maxn];
bool cmp(bag x, bag y)
{
    if(x.income == y.income)
    {
        if(x.num == y.num) return x.id < y.id;
        return x.num > y.num;
    }
    return x.income > y.income;
}
int main()
{
    int n, k, d, p;
    while(~scanf("%d", &n))
    {
        for(int i = 1; i <= n; i++)
        {
            a[i].id = i;
            a[i].income = a[i].num = 0;
        }
        for(int i = 1; i <= n; i++)
        {
            scanf("%d", &k);
            for(int j = 0; j < k; j++)
            {
                scanf("%d%d", &d, &p);
                a[d].income += p;
                a[d].num++;
                a[i].income -= p;
            }
        }
        sort(a + 1, a + n + 1, cmp);
        for(int i = 1; i <= n; i++) printf("%d %.2lf\n", a[i].id, (double)a[i].income / 100.0);
    }
    return 0;
}
