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
