/*
    MEDIUM 3 – Palindrome Checker
    Goal: Check if a string reads the same backward. Print "Palindrome" or "Not".
    Input: single word (e.g. "madam")
    Output: "Palindrome" or "Not"
*/
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNext()) return;
        String s = sc.next();
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not");
    }
}
