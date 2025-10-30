#include <bits/stdc++.h>
/*
    MEDIUM 4 – Find Second Largest
    Goal: Given an array, print the second largest element.
    Input:
        n
        a1 a2 ... an
    Output: second largest value (if n<2 behavior: prints 0 or single element)
    Example:
        Input: 5\n5 9 2 4 8\n    Output: 8
*/
using namespace std;
int main(){
    int n; if(!(cin>>n)) return 0;
    vector<int> a(n);
    for(int i=0;i<n;i++) cin>>a[i];
    if(n<2){
        if(n==1) cout << a[0] << '\n';
        else cout << "0" << '\n';
        return 0;
    }
    int largest = INT_MIN, second = INT_MIN;
    for(int x: a){
        if(x > largest){ second = largest; largest = x; }
        else if(x > second && x < largest) second = x;
    }
    // If all equal, second may be INT_MIN; handle by finding second largest allowing equality
    if(second==INT_MIN){
        sort(a.begin(), a.end(), greater<int>());
        if((int)a.size()>=2) cout << a[1] << '\n';
        else cout << a[0] << '\n';
    } else cout << second << '\n';
    return 0;
}
