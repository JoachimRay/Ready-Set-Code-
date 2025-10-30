#include <bits/stdc++.h>
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
