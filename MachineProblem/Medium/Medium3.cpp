#include <bits/stdc++.h>
using namespace std;
int main(){
    string s; if(!(cin>>s)) return 0;
    string rev = s;
    reverse(rev.begin(), rev.end());
    if(s == rev) cout << "Palindrome" << '\n';
    else cout << "Not" << '\n';
    return 0;
}
