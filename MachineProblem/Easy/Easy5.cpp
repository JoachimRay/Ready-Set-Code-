#include <bits/stdc++.h>
/*
    EASY 5 – Reverse a String
    Goal: Reverse the input string and print it.
    Input: single word (e.g. "hello")
    Output: reversed string (e.g. "olleh")
*/
using namespace std;
int main(){
    string s; if(!(cin >> s)) return 0;
    reverse(s.begin(), s.end());
    cout << s << '\n';
    return 0;
}
