#include <bits/stdc++.h>
using namespace std;
int main(){
    double a,b; char op;
    if(!(cin >> a >> b >> op)) return 0;
    if(op == '+') cout << (a + b) << '\n';
    else if(op == '-') cout << (a - b) << '\n';
    else if(op == '*') cout << (a * b) << '\n';
    else if(op == '/') cout << (b != 0 ? (a / b) : 0) << '\n';
    return 0;
}
