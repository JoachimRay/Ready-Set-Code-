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
