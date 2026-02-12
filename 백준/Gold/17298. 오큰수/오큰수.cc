#include<bits/stdc++.h>
using namespace std;

int main(){

    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n; 
    cin >> n;
    int num;

    stack<int> st;
    int arr[n];
    vector<int> answer(n, -1);

    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    for(int i =0; i < n; i++){

        while(!st.empty()){
            if(arr[st.top()] < arr[i]){
                answer[st.top()] = arr[i];
                st.pop();
            }else{
                break;
            }
        }
        st.push(i);
    }
    for(int x : answer){
        cout << x << " ";
    }

}
