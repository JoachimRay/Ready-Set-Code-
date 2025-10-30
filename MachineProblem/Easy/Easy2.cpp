#include <iostream>
/*
    EASY 2 – Even or Odd
    Goal: Check if a number is even or odd and print "Even" or "Odd".
    Input: single integer (e.g. "9")
    Output: "Even" or "Odd" (e.g. "Odd")
*/
using namespace std;
int main() {
    int n; if (!(cin >> n)) return 0;
    if (n % 2 == 0) cout << "Even" << '\n';
    else cout << "Odd" << '\n';
    return 0;
}
