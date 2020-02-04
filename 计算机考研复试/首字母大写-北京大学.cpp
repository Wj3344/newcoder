#include <iostream>
#include <string.h>

#define Max_Length 101

using namespace std;

int main() {
    char array[Max_Length];
    while (gets(array)) {
        int len = strlen(array);
//        cout << len << endl;
        // 游标
        int index = 0;
        while (array[index] != '\0') {
            char temp = array[index];
            if ((array[index] >= 'a') && (array[index] <= 'z')) {
                // 处理首字母
                if (index == 0) {
                    array[index] = array[index] + ('A' - 'a');
                } else {
                    if (array[index - 1] == ' ' || array[index - 1] == '\t' || array[index - 1] == '\r' ||

                        array[index - 1] == '\n') {
                        array[index] = array[index] + ('A' - 'a');
                    }
                }
            }
            temp = array[index];
            index++;
        }
        cout << array << endl;
    }

    return 0;
}