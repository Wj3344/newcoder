#include<iostream>

using namespace std;

int nodeNumber;

/**
 * 遍历二叉树
 */
void getNode(int nodeId,int n)
{
    if(nodeId > n)
    {
        return;
    }
    nodeNumber++;
    if(nodeId * 2 <= n){
        getNode(nodeId * 2,n);
    }
    if((nodeId * 2 + 1) <= n){
        getNode((nodeId * 2 + 1),n);
    }
}

int main()
{
    int n,m;
    // 输入节点个数和节点编号
    cin >> m >> n;
    // 初始化计数器
    nodeNumber = 0;
    getNode(m,n);
    cout<<nodeNumber<<endl;
    nodeNumber = 0;
    return 0;
}