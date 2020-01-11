/*
 * @Author: chen
 * @Date: 2020-01-11 20:00:48
 * @LastEditTime : 2020-01-11 20:01:17
 * @LastEditors  : Please set LastEditors
 * @Description: 将一个长度最多为30位数字的十进制非负整数转换为二进制数输出。
 * @FilePath: \newcoder\计算机考研复试\进制转换.cpp
 */
#include <iostream>
#include <string>
#include <stack>

using namespace std;

/**
 * 大数除法，其中 array 中存储的数据已经反转，如 12345 存储成 54321
 * @param array 大数
 * @param divisor 除数
 * @param len 被除数长度
 * @return 余数
 */
int division(char array[], int divisor, int &len) {
    // 上一位数
    int pre = 0;
    for (int i = len - 1; i >= 0; i--) {
        pre = pre * 10 + (array[i] - '0');
        array[i] = (pre / divisor) + '0';
        pre = pre % divisor;
    }
    int j = 0;
    for (j = len - 1; j >= 0; j--) {
        if (array[j] != '0') {
            len = j + 1;
            break;
        }
    }
    if (j == -1) {
        len = 0;
    }
    return pre;
}

int main() {
    string number;
    char array[31];
    stack<int> S;
    cin >> number;
    int length = number.length();
    int j, index;
    for (j = 0, index = length - 1; j < length; ++j, index--) {
        array[index] = number.at(j);
    }
    array[j] = '\0';
    while (length > 0) {
        int remainder = division(array, 2, length);
        S.push(remainder);
    }
    while (!S.empty()){
        cout<<S.top();
        S.pop();
    }
    cout << endl;
    return 0;
}