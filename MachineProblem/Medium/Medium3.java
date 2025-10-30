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
