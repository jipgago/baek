#include <iostream>
#include <cmath>
using namespace std;


int main(){
    int num, M; // 카드갯수와 타겟넘버 입력.
    cin>>num>>M;
    int card[num];
    for (int i=0; i<num; i++)
    {
        cin>>card[i]; // 카드 넘버 입력.
    }
    int answer = card[0] + card[1] + card[2];

    for (int i=0; i<num; i++)
    {
        for (int j=i+1; j<num; j++)
        {
            for (int k=j+1; k<num; k++)
            {
                if (abs(card[i]+card[j]+card[k]-M) < abs(answer-M) && card[i]+card[j]+card[k] <= M)
                {
                    answer = card[i]+card[j]+card[k]; // 타겟넘버와 더 가까우면 계속 업데이트
                }
            }
        }
    }
    cout<<answer;
    return 0;
}