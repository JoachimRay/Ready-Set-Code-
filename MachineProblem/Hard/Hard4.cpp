#include <bits/stdc++.h>
/*
    HARD 4 – Temperature Converter
    Goal: Convert between Celsius and Fahrenheit.
    Input: a type character and a numeric value, e.g. "C 100" or "F 212"
    Output: converted temperature labeled accordingly, e.g. "Fahrenheit: 212"
    Notes: Uses standard formulas:
        C -> F: F = C * 9/5 + 32
        F -> C: C = (F - 32) * 5/9
*/
using namespace std;
int main(){
    char type; double val;
    if(!(cin >> type >> val)) return 0;
    if(type == 'C'){
        double f = val * 9.0/5.0 + 32.0;
        // If it's an integer value, print without decimal fraction
        if(f == (long long)f) cout << "Fahrenheit: " << (long long)f << '\n';
        else cout << "Fahrenheit: " << f << '\n';
    } else {
        double c = (val - 32.0) * 5.0/9.0;
        if(c == (long long)c) cout << "Celsius: " << (long long)c << '\n';
        else cout << "Celsius: " << c << '\n';
    }
    return 0;
}
