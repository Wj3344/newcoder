/*
 * @Author: your name
 * @Date: 2020-02-08 17:48:08
 * @LastEditTime : 2020-02-08 17:48:12
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \newcoder\计算机考研复试\查找学生信息.cpp
 */
#include <iostream>

#define Max_Length 101

using namespace std;

typedef struct StudentNode {
    // 学号
    int studentId;
    // 姓名
    char name[12];
    // 性别
    char sex[3];
    // 年龄
    int age;
    // 是否存数据
    bool flag;
} *Student, StudentNode;

int charToNumber(const char array[]) {
    // 结果
    int result = 0;
    // 游标
    int index = 0;
    int len = sizeof(array) / sizeof((array)[0]);
    while (index < len) {
        result = result * 10 + (array[index] - '0');
        index++;
    }
    return result;
}

int main() {
    // 学生的个数
    int N;
    // 输入学生个数
    cin >> N;
    // 学生信息存储
    Student students = (Student) malloc(sizeof(StudentNode) * (1001));
    for (int k = 0; k < 1001; ++k) {
        students[k].flag = false;
    }
    // 接受学生信息
    for (int j = 1; j <= N; ++j) {
        // 为学生信息开辟存储空间
        int i = 0;
        cin >> i;
        // 学号
        students[i].studentId = i;
        // 姓名
        cin >> students[i].name;
        // 性别
        cin >> students[i].sex;
        // 年龄
        cin >> students[i].age;
        students[i].flag = true;
    }
    // 查询次数
    int M;
    cin >> M;
    for (int j = 0; j < M; ++j) {
        int index;
        cin >> index;
        if (!students[index].flag) {
            cout << "No Answer!" << endl;
        } else {
            cout << students[index].studentId << " ";
            cout << students[index].name << " ";
            cout << students[index].sex << " ";
            cout << students[index].age << endl;
        }
    }
    return 0;
}