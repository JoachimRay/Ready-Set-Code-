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
