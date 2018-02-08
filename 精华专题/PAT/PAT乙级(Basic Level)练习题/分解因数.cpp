#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int n, i, flag;
    while (cin >> n)
    {
        flag = 0;
        cout << n << " = ";
        for (i = 2; i <= sqrt(n); i++)
        {
            if (n % i == 0)
            {
                while (n % i == 0)
                {
                    if (flag)
                    {
                        cout << " * ";
                    }
                    else
                    {
                        flag = 1;
                    }
                    cout << i;
                    n /= i;
                }
            }
        }

        if (n != 1)
        {
            if (flag)
            {
                cout << " * ";
            }
            cout << n;
        }
        cout << endl;
    }
    return 0;
}