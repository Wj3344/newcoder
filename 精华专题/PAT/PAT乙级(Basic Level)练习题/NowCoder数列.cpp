/**
 * 相同的代码java死活通过不了说没输出，只能有c++提交了
 */
#include <iostream>

using namespace std;

int main()
{
    int num;
    while (cin >> num)
    {
        if((num % 4) == 2)
        {
            cout << "Yes" << endl;
        }
        else
        {
            cout << "No" << endl;
        }
    }
    return 0;
}