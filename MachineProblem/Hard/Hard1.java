/*
    HARD 1 – Student Grade Analyzer
    Goal: Read number of students and their grades; print average, highest, lowest.
    Input:
        n
        g1 g2 ... gn
    Output:
        Average: <avg>
        Highest: <high>
        Lowest: <low>
    Example:
        Input: 5\n87 90 78 92 88\n
*/
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] g = new int[n];
        long sum = 0;
        int high = Integer.MIN_VALUE, low = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            g[i] = sc.nextInt();
            sum += g[i];
            if(g[i] > high) high = g[i];
            if(g[i] < low) low = g[i];
        }
        System.out.println("Average: " + (sum / n));
        System.out.println("Highest: " + high);
        System.out.println("Lowest: " + low);
    }
}
