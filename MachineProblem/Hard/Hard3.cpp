#include <bits/stdc++.h>
using namespace std;
int main(){
    map<string,int> freq;
    string word;
    while(cin >> word){
        ++freq[word];
    }
    for(auto &p: freq) cout << p.first << ": " << p.second << endl;
    return 0;
}
