#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string s;
    getline(cin, s);
    int flag = 0;
    string word = "";

    for (char c  : s ){

        if(c == '<'){
            flag = 1;
            reverse(word.begin(), word.end());
            cout << word;
            word.clear();
            cout << c;
            
        }else if (c == '>'){
            flag = 0;
            cout << c;
            
        }else if(c == ' '&& flag == 0){
            reverse(word.begin(), word.end());
            cout << word;
            word.clear();
            cout << ' ';
            
        } else
        {
            if(!flag){
                word.push_back(c);
            }
            else cout << c;
            
        }
    }
    reverse(word.begin(), word.end());
    cout << word;
    
    
    
}