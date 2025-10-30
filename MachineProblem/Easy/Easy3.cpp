#include <iostream>
/*
    EASY 3 – Factorial Calculator
    Goal: Compute factorial of n (n <= 10).
    Input: single integer n (e.g. "5")
    Output: factorial value (e.g. "120")
*/
using namespace std;
int main() {
    int n; if (!(cin >> n)) return 0;
    long long fact = 1;
    for (int i = 1; i <= n; ++i) fact *= i;
    cout << fact << '\n';
    return 0;
}
