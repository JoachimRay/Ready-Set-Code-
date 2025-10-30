#include <bits/stdc++.h>
/*
    HARD 1 – Student Grade Analyzer
    Goal: Read number of students and their grades; print average, highest, lowest.
    Input:
        n
        g1 g2 ... gn
    Output:
        Average: <avg>\nHighest: <high>\nLowest: <low>
    Example:
        Input: 5\n87 90 78 92 88\n
*/
using namespace std;
int main(){
    int n; if(!(cin>>n)) return 0;
    vector<int> g(n);
    for(int i=0;i<n;i++) cin>>g[i];
    long long sum = 0;
    int high = INT_MIN, low = INT_MAX;
    for(int x: g){ sum += x; if(x>high) high = x; if(x<low) low = x; }
    cout << "Average: " << (sum / n) << endl;
    cout << "Highest: " << high << endl;
    cout << "Lowest: " << low << endl;
    return 0;
}
