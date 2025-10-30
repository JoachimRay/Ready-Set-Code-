import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        if(n < 2){
            if(n==1) System.out.println(arr[0]);
            else System.out.println(0);
            return;
        }
        Arrays.sort(arr);
        System.out.println(arr[n-2]);
    }
}
