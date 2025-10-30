#include <bits/stdc++.h>
/*
    MEDIUM 2 – Count Vowels
    Goal: Count vowels (a, e, i, o, u) in the given string (case-insensitive).
    Input: single word (e.g. "HelloWorld")
    Output: integer count (e.g. "3")
*/
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
