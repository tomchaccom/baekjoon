#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    // 아스키 코드로 계산하기? 
    string line;
    cin >> line;
    
    vector<int> arr (26, 0);
    // 대문자 소문자로 바꾸기 요구

    
     
    for(int i =0; i < line.size(); i++){
        int x = tolower(line[i]) -'a';
        
        arr[x]++; 
    }

    int mx = 0;
    int cnt =0;
    int idx = 0;

    for(int x : arr){
        mx = max(mx, x); 
    }

    for(int i =0; i < 26; i++){
        if(mx == arr[i]){
            cnt++;
            idx = i;
        }
        
    }

    if(cnt == 1){
        cout << char(idx + 'A');
    }
    else{
        cout << "?";
    }
    
    
}