#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int n;
    int i;
    int flag;
    int num;
    while (cin >> n)
    {
        num = 0;
        for (i = 2; i <= sqrt(n); i++)
        {
            flag = 0;
            if (n % i == 0)
            {
                while (n % i == 0)
                {
                    if (!flag)
                    {
                        flag = 1;
                        num++;
                    }
                    n /= i;
                }
            }
        }
        if (n != 1)
        {
            num++;
        }
        cout << num << endl;
    }
    return 0;
}