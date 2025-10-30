/*
    MEDIUM 1 – Sum of Array Elements
    Goal: Read n and an array of n integers, output their sum.
    Input:
        n
        a1 a2 ... an
    Output: single integer (sum)
    Example:
        Input: 5\n1 2 3 4 5\n    Output: 15
*/
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long sum = 0;
        for(int i=0;i<n;i++) sum += sc.nextInt();
        System.out.println(sum);
    }
}
