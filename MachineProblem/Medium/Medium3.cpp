#include <bits/stdc++.h>
/*
    MEDIUM 3 – Palindrome Checker
    Goal: Check if a string reads the same backward. Print "Palindrome" or "Not".
    Input: single word (e.g. "madam")
    Output: "Palindrome" or "Not"
*/
using namespace std;
int main(){
    string s; if(!(cin>>s)) return 0;
    string rev = s;
    reverse(rev.begin(), rev.end());
    if(s == rev) cout << "Palindrome" << '\n';
    else cout << "Not" << '\n';
    return 0;
}
