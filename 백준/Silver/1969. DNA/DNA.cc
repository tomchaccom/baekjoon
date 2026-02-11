#include <bits/stdc++.h>
using namespace std;

int main(){

    int n, m;
    cin >> n >> m;

    vector<string> dna(n);
    map<char , int> mp;

    for(int i = 0; i < n ; i++){
        string line;
        cin >> line;
        dna[i] = line;
        
    }
    int mx = 0;
    int count = 0;
    

    for(int i = 0; i < m ; i++){
        char res;
        mx = 0;
        for(int j = 0; j < n ; j++){
            if(dna[j][i] == 'A') mp['A']++;
            if(dna[j][i] == 'C') mp['C']++;
            if(dna[j][i] == 'G') mp['G']++;
            if(dna[j][i] == 'T') mp['T']++;
            
        }
        for(auto &p : mp){
            if(p.second> mx) {
                mx = p.second;
                res = p.first;
            }
        }


        for(int k = 0; k < n ; k++){
            if(dna[k][i] != res){
                count++;
            }
        }

        cout << res;
        mp.clear();
    }
    cout << "\n" << count;
}