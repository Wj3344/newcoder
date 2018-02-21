#include <iostream>
#include<algorithm>
#include <iomanip>

using namespace std;

struct MoonCake
{
    double stock;
    double total;
    double price;
};

bool comp(const MoonCake moonCake1, MoonCake moonCake2)
{
    if (moonCake1.price > moonCake2.price)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int N, D;
    cin >> N >> D;
    MoonCake moonCakes[N];
    double stockTemp, priceTemp, totalTemp;
    //输入月饼的库存
    for (int i = 0; i < N; ++i)
    {
        cin >> stockTemp;
        moonCakes[i].stock = stockTemp;
    }
    //输入月饼中售价
    for (int i = 0; i < N; ++i)
    {
        cin >> totalTemp;
        moonCakes[i].total = totalTemp;
    }
    //计算月饼单价
    for (int i = 0; i < N; ++i)
    {
        stockTemp = moonCakes[i].stock;
        totalTemp = moonCakes[i].total;
        priceTemp = totalTemp / stockTemp;
        moonCakes[i].price = priceTemp;
    }
    //排序
    sort(moonCakes, moonCakes + N, comp);
    int i = 0;
    totalTemp = 0;
    //计算
    while (D > 0 && i < N)
    {
        if (D >= moonCakes[i].stock)
        {
            totalTemp += moonCakes[i].total;
            D -= moonCakes[i].stock;
            i++;
        }
        else
        {
            totalTemp += moonCakes[i].price * D;
            D = 0;
        }
    }
    cout.setf(ios::fixed);
    cout << setprecision(2) << totalTemp << endl;
    return 0;
}