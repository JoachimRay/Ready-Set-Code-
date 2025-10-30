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
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long balance = 0;
        while(sc.hasNext()){
            String cmd = sc.next();
            if(cmd.equals("DEPOSIT")){
                long amt = sc.nextLong(); balance += amt;
            } else if(cmd.equals("WITHDRAW")){
                long amt = sc.nextLong(); balance -= amt;
            } else if(cmd.equals("BALANCE")){
                System.out.println("Balance: " + balance);
            } else {
                // ignore
            }
        }
    }
}
