#include <iostream>
using namespace std;
int main() {
    int n; if (!(cin >> n)) return 0;
    long long fact = 1;
    for (int i = 1; i <= n; ++i) fact *= i;
    cout << fact << '\n';
    return 0;
}
