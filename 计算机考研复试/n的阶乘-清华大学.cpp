#include <iostream>

using namespace std;

int main()
{
    int n;
    while (cin >> n)
    {
        long long sum = 1;
        for(int i = 1; i <= n; i++)
        {
            sum = sum * i;
        }
        cout << sum << endl;
    }
    return 0;
}