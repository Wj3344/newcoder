#include <iostream>
#include <iomanip>

using namespace std;

void printInteger(int num)
{
    if (num == 0)
    {
        cout << "N";
    }
    else
    {
        cout << num;
    }
}

void printDouble(double num)
{
    if (num == 0)
    {
        cout << "N";
    }
    else
    {
        cout.setf(ios::fixed);
        cout << setprecision(1) << num;
    }
}

int main()
{
    int N, A1 = 0, A2 = 0, A3 = 0, A5 = 0, temp;
    int flag = -1, num = 0;
    double A4 = 0;
    cin >> N;
    for (int i = 0; i < N; ++i)
    {
        cin >> temp;
        if (temp % 5 == 0 && temp % 2 == 0)
        {
            A1 += temp;
        }
        if (temp % 5 == 1)
        {
            flag = flag * -1;
            A2 += flag * temp;

        }
        if (temp % 5 == 2)
        {
            A3++;
        }
        if (temp % 5 == 3)
        {
            num++;
            A4 += temp;
        }
        if (temp % 5 == 4)
        {
            if (temp > A5)
            {
                A5 = temp;
            }
        }
    }
    if (num != 0)
    {
        A4 = A4 / num;
    }
    printInteger(A1);
    cout << " ";
    printInteger(A2);
    cout << " ";
    printInteger(A3);
    cout << " ";
    printDouble(A4);
    cout << " ";
    printInteger(A5);
    cout << endl;
    return 0;
}