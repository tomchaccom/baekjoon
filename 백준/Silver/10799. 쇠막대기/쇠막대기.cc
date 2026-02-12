#include<bits/stdc++.h>
using namespace std;

int main(){

    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string line;
    cin >> line;

    int pieceCount = 0; 
    int open = 0; 
    bool isLazar = false; 

    int idx = 0; // 현재 위치 확인용

    for(char c : line){

        if(c == '('){
            open++;
            isLazar = true; 
        }
        else if(isLazar){
            if(c == ')'){
                open--; // 레이저일 경우 막대는 열린게 아님.. 
                pieceCount += open;
                isLazar = false;
            }else{
                
                isLazar = false;
            }
            
        }
        else if(c == ')'){
            open--;
            pieceCount++;
        }

    }

    cout  << pieceCount << "\n";
}
