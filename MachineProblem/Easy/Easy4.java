/*
    EASY 4 – Find Maximum
    Goal: Read three integers and print the largest.
    Input: three integers separated by spaces (e.g. "4 9 2")
    Output: the largest integer (e.g. "9")
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(Math.max(a, Math.max(b, c)));
    }
}
