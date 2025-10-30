/*
    EASY 2 – Even or Odd
    Goal: Check if a number is even or odd and print "Even" or "Odd".
    Input: single integer (e.g. "9")
    Output: "Even" or "Odd" (e.g. "Odd")
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int n = s.nextInt();
        if (n % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
