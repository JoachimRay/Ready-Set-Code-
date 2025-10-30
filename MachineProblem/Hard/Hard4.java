/*
    HARD 4 – Temperature Converter
    Goal: Convert between Celsius and Fahrenheit.
    Input: a type character and a numeric value, e.g. "C 100" or "F 212"
    Output: converted temperature labeled accordingly, e.g. "Fahrenheit: 212"
    Notes: Uses standard formulas:
        C -> F: F = C * 9/5 + 32
        F -> C: C = (F - 32) * 5/9
*/
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNext()) return;
        char type = sc.next().charAt(0);
        if(!sc.hasNextDouble()) return;
        double val = sc.nextDouble();
        if(type == 'C'){
            double f = val * 9.0/5.0 + 32.0;
            if(f == (long)Math.round(f)) System.out.println("Fahrenheit: " + (long)Math.round(f));
            else System.out.println("Fahrenheit: " + f);
        } else {
            double c = (val - 32.0) * 5.0/9.0;
            if(c == (long)Math.round(c)) System.out.println("Celsius: " + (long)Math.round(c));
            else System.out.println("Celsius: " + c);
        }
    }
}
