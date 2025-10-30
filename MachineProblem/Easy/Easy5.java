/*
    EASY 5 – Reverse a String
    Goal: Reverse the input string and print it.
    Input: single word (e.g. "hello")
    Output: reversed string (e.g. "olleh")
*/
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNext()) return;
        String s = sc.next();
        System.out.println(new StringBuilder(s).reverse().toString());
    }
}
