/*
    EASY 1 – Sum of Two Numbers
    Goal: Read two integers and output their sum.
    Input: two integers separated by space (e.g. "5 10")
    Output: single integer (e.g. "15")
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a + b);
    }
}
