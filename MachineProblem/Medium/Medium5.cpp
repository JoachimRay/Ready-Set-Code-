#include <bits/stdc++.h>
/*
    MEDIUM 5 – Simple Calculator
    Goal: Perform + - * / between two numbers and print the result.
    Input: two numbers and an operator (e.g. "10 5 *")
    Output: result (e.g. "50")
    Note: division by zero returns 0 in this simple implementation.
*/
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
