#include <iostream>

using namespace std;

struct test
{
    long A;
    long B;
    long result;
};

int main()
{
    int T;
    cin >> T;
    test myList[T];
    for (int i = 0; i < T; i++)
    {
        cin >> myList[i].A >> myList[i].B >> myList[i].result;
    }
    for (int i = 0; i < T; ++i)
    {
        if (myList[i].A + myList[i].B > myList[i].result)
        {
            cout << "Case #" << (i + 1) << ": true" << endl;
        }
        else
        {
            cout << "Case #" << (i + 1) << ": false" << endl;
        }
    }
    return 0;
}