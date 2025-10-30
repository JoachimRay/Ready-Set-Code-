#include <bits/stdc++.h>
using namespace std;
int main(){
    string s; if(!(cin>>s)) return 0;
    int count = 0;
    for(char c: s){
        char x = tolower(c);
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u') ++count;
    }
    cout << count << '\n';
    return 0;
}
