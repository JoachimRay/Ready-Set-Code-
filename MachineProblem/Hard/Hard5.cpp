#include <bits/stdc++.h>
using namespace std;
int main(){
    map<string,int> cart;
    string cmd;
    while(cin >> cmd){
        if(cmd == "ADD"){
            string item; int price; cin >> item >> price; cart[item] = price;
        } else if(cmd == "REMOVE"){
            string item; cin >> item; cart.erase(item);
        } else if(cmd == "TOTAL"){
            long long total = 0;
            for(auto &p: cart) total += p.second;
            cout << "Total: " << total << endl;
        } else {
            // ignore unknown
        }
    }
    return 0;
}
