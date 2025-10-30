#include <bits/stdc++.h>
/*
    HARD 2 – Simple Bank Account Simulator
    Goal: Process commands to deposit, withdraw, and show balance.
    Commands:
        DEPOSIT x   (add x)
        WITHDRAW x  (subtract x)
        BALANCE      (print current balance)
    Example:
        DEPOSIT 100\nWITHDRAW 40\nBALANCE  --> Balance: 60
*/
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
