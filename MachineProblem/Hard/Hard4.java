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
