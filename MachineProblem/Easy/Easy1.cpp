#include <iostream>
/*
    EASY 1 – Sum of Two Numbers
    Goal: Read two integers and output their sum.
    Input: two integers separated by space (e.g. "5 10")
    Output: single integer (e.g. "15")
*/
using namespace std;
int main() {
    int a, b;
    if (!(cin >> a >> b)) return 0;
    cout << (a + b) << '\n';
    return 0;
}
