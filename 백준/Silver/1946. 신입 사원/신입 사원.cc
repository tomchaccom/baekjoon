#include <bits/stdc++.h>
using namespace std;

int main(){

    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int test;
    int people;
    int a ,b;
    cin >> test;
    int count;
    int mn;

    map<int, int> mp;

    for(int i =0; i< test; i++){
        cin >> people;
        mp.clear();
        for(int j =0 ; j < people; j++){
            cin >> a >> b;
            mp[a] = b;

        }
        // 합격자의 수를 세는 로직 추가하기 
        // 이미 정렬된 상태, 하나씩 내려가면서, 나보다 면접 점수가 낮은 사람을 제거? 아니면 생존자 카운트?
        count = 0;
        bool first = true;

        for(auto& p : mp){

            if(first){
                count++;
                first= false;
                mn = p.second;
            }
            else if(mn > p.second){
                count++;
                mn = p.second;
            }
        }
        cout << count << "\n";

        
        
        
    }

}