/*
    HARD 5 – Mini Shopping Cart
    Goal: Simulate a simple shopping cart with ADD, REMOVE, and TOTAL commands.
    Commands:
        ADD <item> <price>
        REMOVE <item>
        TOTAL  (prints total price of items in cart)
    Example:
        ADD apple 50\nADD banana 20\nREMOVE apple\nTOTAL  -> Total: 20
*/
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> cart = new HashMap<>();
        while(sc.hasNext()){
            String cmd = sc.next();
            if(cmd.equals("ADD")){
                String item = sc.next(); int price = sc.nextInt(); cart.put(item, price);
            } else if(cmd.equals("REMOVE")){
                String item = sc.next(); cart.remove(item);
            } else if(cmd.equals("TOTAL")){
                long total = 0;
                for(int p: cart.values()) total += p;
                System.out.println("Total: " + total);
            } else {
                // ignore
            }
        }
    }
}
