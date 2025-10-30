/*
    MEDIUM 4 – Find Second Largest
    Goal: Given an array, print the second largest element.
    Input:
        n
        a1 a2 ... an
    Output: second largest value (if n<2 behavior: prints 0 or single element)
    Example:
        Input: 5\n5 9 2 4 8\n    Output: 8
*/
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
