import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNext()) return;
        String s = sc.next();
        int count = 0;
        for(char ch: s.toLowerCase().toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') count++;
        }
        System.out.println(count);
    }
}
