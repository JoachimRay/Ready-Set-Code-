#include <iostream>
/*
    EASY 4 – Find Maximum
    Goal: Read three integers and print the largest.
    Input: three integers separated by spaces (e.g. "4 9 2")
    Output: the largest integer (e.g. "9")
*/
#include <algorithm>
using namespace std;
int main() {
    int a, b, c;
    if (!(cin >> a >> b >> c)) return 0;
    cout << max(a, max(b, c)) << '\n';
    return 0;
}
