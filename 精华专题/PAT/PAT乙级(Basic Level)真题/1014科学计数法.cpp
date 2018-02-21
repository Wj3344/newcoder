#include<iostream>
#include <sstream>

using namespace std;

int main()
{
    string num;
    cin >> num;
    string str1;
    int i = 0;
    int len = num.length();
    while (num[i] != 'E' && i < len)
    {
        str1 += num[i++];
    }
    i++;
    char str2[10000];
    int j = 0;
    while (i < len)
    {
        str2[j++] = num[i++];
    }
    str2[j] = '\0';
    int a;
    sscanf(str2, "%d", &a);
    if (a != 0)
    {
        str1.erase(2, 1);
    }
    len = str1.length();

    if (a > 0)
    {
        if (a < len - 2)
        {
            str1.insert(a + 1, 1, '.');
        }
        else
        {
            int temp = a - (len - 2);
            for (int i = 0; i < temp; i++)
            {
                str1 += '0';
            }
        }
    }
    else if (a < 0)
    {
        a = abs(a);
        for (int i = 0; i < a; i++)
        {
            str1.insert(1, 1, '0');
        }
        str1.insert(2, 1, '.');
    }
    if (str1[0] == '+')
    {
        str1.erase(0, 1);
    }
    cout << str1 << endl;
    return 0;
}


/*
#include <iostream>
#include <string>
#include <iomanip>
#include <math.h>

using namespace std;

int main() {
    string inStr, subStr1, subStr2;
    char flag; // 指数的符号
    int pos; // 记录'E'字符的位置
    cin >> inStr;
    if ('-' == inStr[0])
        cout << "-"; // 小数符号位
    pos = inStr.find('E', 0);
    subStr1 = inStr.substr(1, pos - 1);
    flag = inStr[pos + 1];
    subStr2 = inStr.substr(pos + 2, subStr1.size() - 2 - pos);
    int n = atoi(subStr2.c_str());
    subStr1.erase(subStr1.find('.'), 1);
    int len = subStr1.size();
    if ('+' == flag) {
        if (n >= 0 && n < len - 1)
            subStr1.insert(n + 1, 1, '.');
        else
            subStr1.insert(len, n - len + 1, '0');
        cout << subStr1;
    } else {
        if (0 == n) {
            subStr1.insert(1, 1, '.');
            cout << subStr1;
        } else {
            cout << "0." << setfill('0') << setw(len + n - 1) << subStr1;
        }
    }

    return 0;
}
 */