/*
 * @Author: chen
 * @Date: 2020-01-11 13:36:03
 * @LastEditTime : 2020-01-11 18:45:17
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \newcoder\计算机考研复试\今年第几天.cpp
 */
#include <iostream>

using namespace std;

/**
 * @description: 判断是否是闰年
 * @param year 年份 
 * @return: 是否是闰年
 */
bool isLeapYear(int year) {
//    1、非整百年：能被4整除的为闰年。（如2004年就是闰年,2001年不是闰年）
//    2、整百年：能被400整除的是闰年。(如2000年是闰年，1900年不是闰年)
    if ((year % 100 != 0) && (year % 4 == 0)) {
        return true;
    } else if ((year % 100 == 0) && (year % 400 == 0)) {
        return true;
    } else {
        return false;
    }
}

/**
 * @description: 根据年份和月份获取天数
 * @param year 年份
 * @param month 月份
 * @return: 天数
 */
int getDays(int year, int month) {
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            return 31;
        case 2: {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        case 4:
        case 6:
        case 9:
        case 11:
            return 30;
        default:
            return 0;
    }
}

int main() {
    int year, month, day;
    cin >> year >> month >> day;
    int days = 0;
    for (int i = 1; i < month; ++i) {
        days += getDays(year, i);
    }
    days += day;
    cout << days << endl;
    return 0;
}