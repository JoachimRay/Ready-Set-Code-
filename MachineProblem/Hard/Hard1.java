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
