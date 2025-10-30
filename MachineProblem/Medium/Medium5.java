import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        if(!s.hasNextDouble()) return;
        double a = s.nextDouble();
        double b = s.nextDouble();
        char op = s.next().charAt(0);
        if(op == '+') System.out.println(a + b);
        else if(op == '-') System.out.println(a - b);
        else if(op == '*') System.out.println(a * b);
        else if(op == '/') System.out.println(b != 0 ? (a / b) : 0);
    }
}
