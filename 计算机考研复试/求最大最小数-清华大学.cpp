#include<iostream>

using namespace std;

int main()
{
    int N;
    while(cin >> N)
    {
        int max = -1000001;
        int min = 1000001;
        for(int i = 0; i < N; i++)
        {
            int temp;
            cin >> temp;
            if(temp > max)
            {
                max = temp;
            }
            if(temp < min)
            {
                min = temp;
            }
        }
        cout << max << " " << min << endl;
    }
    return 0;
}