#include <bits/stdc++.h>
using namespace std;
int main(){
    long long balance = 0;
    string cmd;
    while(cin >> cmd){
        if(cmd == "DEPOSIT"){
            long long amt; cin >> amt; balance += amt;
        } else if(cmd == "WITHDRAW"){
            long long amt; cin >> amt; balance -= amt;
        } else if(cmd == "BALANCE"){
            cout << "Balance: " << balance << endl;
        } else {
            // ignore unknown
        }
    }
    return 0;
}
