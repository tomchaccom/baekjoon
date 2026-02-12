#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string str;
    cin >> str;

    stack<char> s;
    int cnt = 0;

    for(int i = 0; i < str.size(); i++){
        if(str[i] == '('){
            s.push('(');
        }
        else { // ')'
            s.pop();  // 일단 하나 닫힘

            if(str[i-1] == '('){
                // 레이저
                cnt += s.size();
            }
            else{
                // 막대 끝
                cnt += 1;
            }
        }
    }

    cout << cnt << "\n";
}
