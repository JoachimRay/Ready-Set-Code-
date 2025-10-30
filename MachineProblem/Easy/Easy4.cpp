#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    int a, b, c;
    if (!(cin >> a >> b >> c)) return 0;
    cout << max(a, max(b, c)) << '\n';
    return 0;
}
