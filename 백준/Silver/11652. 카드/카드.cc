#include<bits/stdc++.h>
using namespace std;

int main(){

    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n; 
    cin >> n;
    map<long long,long long> mp; // 초기 사이즈 설정이 필요없다
    int mx = 0;

    for(int i =0; i< n; i++){
        long long num;
        cin >> num;

        mp[num]++;

    }
    
    for(auto& p : mp){
       if(mx < p.second){
         mx = p.second;
       }
    }
    
    for(auto& p : mp){
        if(p.second == mx){
            cout << p.first;
            break;
        }
    }


}