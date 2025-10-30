/*
    EASY 3 – Factorial Calculator
    Goal: Compute factorial of n (n <= 10).
    Input: single integer n (e.g. "5")
    Output: factorial value (e.g. "120")
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int n = s.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println(fact);
    }
}
