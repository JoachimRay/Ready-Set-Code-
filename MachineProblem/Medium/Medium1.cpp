#include <bits/stdc++.h>
/*
    MEDIUM 1 – Sum of Array Elements
    Goal: Read n and an array of n integers, output their sum.
    Input:
        n
        a1 a2 ... an
    Output: single integer (sum)
    Example:
        Input: 5\n1 2 3 4 5\n    Output: 15
*/
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n; if(!(cin>>n)) return 0;
    vector<int> a(n);
    for(int i=0;i<n;i++) cin>>a[i];
    long long sum = 0;
    for(int x: a) sum += x;
    cout << sum << '\n';
    return 0;
}
